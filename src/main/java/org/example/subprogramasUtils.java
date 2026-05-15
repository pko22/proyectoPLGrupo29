package org.example;

import java.util.*;

public class subprogramasUtils {
    private String nombreActual = "";
    private String tipoActual = "";

    // Control de argumentos en las llamadas
    private Stack<String> pilaLlamadas = new Stack<>();
    private Stack<Integer> pilaIndices = new Stack<>();





    // Estructura para guardar la info de cada subprograma globalmente
    public static class InfoSubprograma {
        public List<String> nombresParametros = new ArrayList<>();
        public Map<String, String> tiposParametros = new LinkedHashMap<>();
        public Map<String, String> modosParametros = new HashMap<>(); // Guarda "IN", "OUT", "INOUT"
    }

    // Registro global de todos los subprogramas
    private Map<String, InfoSubprograma> subprogramas = new HashMap<>();

    // 1. Iniciar una nueva función/procedimiento
    public void iniciar(String nombre) {
        this.nombreActual = nombre;
        // Si no existe, lo creamos. Si ya existe lo reusamos.
        subprogramas.putIfAbsent(nombre, new InfoSubprograma());
    }

    // 2. Control del tipo actual que estamos leyendo
    public void setTipoActual(String tipo) {
        this.tipoActual = tipo;
    }

    // 3. Registrar el nombre de un parámetro
    public void registrarParametro(String nombre) {
        InfoSubprograma info = subprogramas.get(nombreActual);
        if (!info.nombresParametros.contains(nombre)) {
            info.nombresParametros.add(nombre);
        }
    }

    // 4. Asignarle el tipo y el modo (IN, OUT, INOUT)
    public void asignarTipoYModo(String nombre, String intent) {
        InfoSubprograma info = subprogramas.get(nombreActual);
        info.modosParametros.put(nombre, intent);

        // Los parámetros OUT e INOUT en C se traducen como punteros (*)
        // Excepción: las cadenas de caracteres (char []) en C ya actúan como punteros.
        if ((intent.equals("OUT") || intent.equals("INOUT")) && !this.tipoActual.equals("char")) {
            info.tiposParametros.put(nombre, this.tipoActual + " *" + nombre);
        } else if (this.tipoActual.equals("char")) {
            info.tiposParametros.put(nombre, "char " + nombre + "[]");
        } else {
            info.tiposParametros.put(nombre, this.tipoActual + " " + nombre);
        }
    }

    // 5. Generar la firma final para C: "float *c, int d, int *e"
    public String generarFirmaC() {
        InfoSubprograma info = subprogramas.get(nombreActual);
        if (info.nombresParametros.isEmpty()) return "void";

        List<String> listaFinal = new ArrayList<>();
        for (String nombre : info.nombresParametros) {
            String param = info.tiposParametros.get(nombre);
            if (param != null) listaFinal.add(param);
        }
        return String.join(", ", listaFinal);
    }

    // 6. Detectar si una asignación es en realidad un return
    public boolean esReturn(String id) {
        return id.equals(this.nombreActual);
    }

    // 7. Saber si un parámetro local necesita '*' (para uso interno en el cuerpo)
    public boolean esParametroReferencia(String nombre) {
        InfoSubprograma info = subprogramas.get(nombreActual);
        if (info == null) return false;
        String intent = info.modosParametros.get(nombre);
        return intent != null && (intent.equals("OUT") || intent.equals("INOUT")) && !info.tiposParametros.get(nombre).startsWith("char");
    }

    // 8. Saber si en una llamada (CALL) el argumento necesita '&'
    public boolean esParamLlamadaReferencia(String nombreProc, int indice) {
        InfoSubprograma info = subprogramas.get(nombreProc);
        if (info == null || indice >= info.nombresParametros.size()) return false;
        String nombreParam = info.nombresParametros.get(indice);
        String intent = info.modosParametros.get(nombreParam);
        return intent != null && (intent.equals("OUT") || intent.equals("INOUT")) && !info.tiposParametros.get(nombreParam).startsWith("char");
    }

    // 9. Comprobación de Nombres: Validar que los parámetros declarados coinciden con los tipiados
    public void validarParametros() {
        InfoSubprograma info = subprogramas.get(nombreActual);
        for (String param : info.nombresParametros) {
            if (!info.tiposParametros.containsKey(param)) {
                System.err.println("Error semántico: El parámetro '" + param + "' en la cabecera de '" + nombreActual + "' no tiene un tipo declarado.");
                System.exit(1); // Aborta ejecución
            }
        }
    }





    public void iniciarLlamada(String nombre) {
        pilaLlamadas.push(nombre);
        pilaIndices.push(0); // Empezamos en el argumento 0
    }

    public void finalizarLlamada() {
        if (!pilaLlamadas.isEmpty()) {
            pilaLlamadas.pop();
            pilaIndices.pop();
        }
    }

    public String procesarArgumento() {
        if (pilaLlamadas.isEmpty()) return "";

        String nombre = pilaLlamadas.peek();
        int idx = pilaIndices.pop();
        pilaIndices.push(idx + 1);

        return esParamLlamadaReferencia(nombre, idx) ? "&" : "";
    }
}