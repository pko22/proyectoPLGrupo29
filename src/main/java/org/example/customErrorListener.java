package org.example;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

public class customErrorListener extends BaseErrorListener {

    // Variable para saber si la compilación debe detenerse
    private boolean hasErrors = false;
    private boolean hasBlockingErrors = false;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer,
                            Object offendingSymbol,
                            int line,
                            int charPositionInLine,
                            String msg,
                            RecognitionException e) {

        System.err.println("Error [Línea " + line + ", Columna " + charPositionInLine +
                "]: Posible causa: " + traducirMensaje(msg));

        // Si es un "missing" o un "extraneous", ANTLR se recupera insertando o borrando un
        // solo token. El árbol sobrevive y podemos traducir el resto.
        if (msg.contains("missing") || msg.contains("extraneous input")) {
            hasErrors= true;
        } else {
            // Es un error grave estructural ("no viable alternative", "mismatched input", etc.).
            // La traducción estará incompleta o rota, así que abortamos.
            hasBlockingErrors = true;
            hasErrors= true;
        }
    }

    public boolean hasErrors() {
        return hasErrors;
    }
    public boolean hasBlockingErrors() { return hasBlockingErrors;}
    private String traducirMensaje(String msg) {
        if (msg.contains("mismatched input")) {
            return msg.replace("mismatched input", "Entrada no esperada").replace("expecting", "se esperaba");
        } else if (msg.contains("extraneous input")) {
            return msg.replace("extraneous input", "Símbolo sobrante").replace("expecting", "se esperaba");
        } else if (msg.contains("missing")) {
            return msg.replace("missing", "Falta").replace("at", "en");
        } else if (msg.contains("no viable alternative at input")) {
            return msg.replace("no viable alternative at input", "No se reconoce la estructura cerca de");
        } else if (msg.contains("token recognition error at")) {
            return msg.replace("token recognition error at", "Símbolo léxico desconocido:");
        }
        return "Error de sintaxis (" + msg + ")";
    }
}