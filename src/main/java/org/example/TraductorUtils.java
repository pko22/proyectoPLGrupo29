package org.example;

public class TraductorUtils {
    // StringBuilder para los #define (deben ir al principio del fichero .c)
    private StringBuilder listaDefines = new StringBuilder();
    // Variable para transportar la dimensión de los CHARs
    private String dimActual = "";

    public void addDefine(String id, String valor) {
        listaDefines.append("#define ").append(id).append(" ").append(valor).append("\n");
    }

    public String getDefines() {
        return listaDefines.toString();
    }

    public void setDimActual(String dim) {
        this.dimActual = dim;
    }

    public String getDimActual() {
        return this.dimActual;
    }




    //TODO: revisar si esto es asi en el lenguaje final tambien
    /**
     * Transforma strings del lenguaje fuente al formato de C:
     * 1. Delimita siempre con comillas dobles.
     * 2. Escapa comillas dobles internas con \".
     */
    public String normalizarString(String texto) {
        if (texto == null || texto.length() < 2) return "\"\"";

        // Quitamos las comillas exteriores
        String contenido = texto.substring(1, texto.length() - 1);

        if (texto.startsWith("'")) {
            // Si venía con '', sustituimos por ' simple
            contenido = contenido.replace("''", "'");
            // Y si hay comillas dobles dentro, las escapamos para C
            contenido = contenido.replace("\"", "\\\"");
        } else {
            // Si venía con "", la especificación dice que "" dentro es una comilla [cite: 97, 98]
            // En C eso se traduce como \"
            contenido = contenido.replace("\"\"", "\\\"");
        }

        return "\"" + contenido + "\"";
    }
}