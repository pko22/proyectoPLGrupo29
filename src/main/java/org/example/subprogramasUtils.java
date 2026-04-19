package org.example;

import java.util.*;

public class subprogramasUtils {
    private String nombreActual = "";
    private String tipoActual = "";
    private List<String> nombresParametros = new ArrayList<>();
    private Map<String, String> tiposParametros = new LinkedHashMap<>();

    // 1. Iniciar una nueva función/procedimiento
    public void iniciar(String nombre) {
        this.nombreActual = nombre;
        this.nombresParametros.clear();
        this.tiposParametros.clear();
    }

    // 2. Control del tipo actual que estamos leyendo
    public void setTipoActual(String tipo) { this.tipoActual = tipo; }

    // 3. Registrar el nombre de un parámetro
    public void registrarParametro(String nombre) {
        this.nombresParametros.add(nombre);
    }

    // 4. Asignarle el tipo al parámetro que acabamos de leer
    public void asignarTipo(String nombre) {
        if (this.tipoActual.equals("char")) {
            tiposParametros.put(nombre, "char " + nombre + "[]");
        } else {
            tiposParametros.put(nombre, this.tipoActual + " " + nombre);
        }
    }

    // 5. Generar la firma final para C: "int a, float b"
    public String generarFirmaC() {
        if (nombresParametros.isEmpty()) return "void";

        List<String> listaFinal = new ArrayList<>();
        for (String nombre : nombresParametros) {
            String param = tiposParametros.get(nombre);
            if (param != null) listaFinal.add(param);
        }
        return String.join(", ", listaFinal);
    }

    // 6. Detectar si una asignación es en realidad un return
    public boolean esReturn(String id) {
        return id.equals(this.nombreActual);
    }
}