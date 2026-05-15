package org.example;
import org.antlr.v4.runtime.*;
import java.io.IOException;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Por favor, indica el fichero de entrada.");
            return;
        }

        try {
            // 1. Preparar entrada
            CharStream input = CharStreams.fromFileName(args[0]);

            // Instanciar nuestro manejador de errores personalizado
            customErrorListener errorListener = new customErrorListener();

            // Configurar el Lexer
            org.example.calculoCientificoToCLexer analex = new org.example.calculoCientificoToCLexer(input);
            analex.removeErrorListeners(); // Quitamos el de defecto (esta en ingles)
            analex.addErrorListener(errorListener); // Ponemos el nuestro

            CommonTokenStream tokens = new CommonTokenStream(analex);

            // Configurar el Parser
            org.example.calculoCientificoToCParser anasint = new org.example.calculoCientificoToCParser(tokens);
            anasint.removeErrorListeners(); // Quitamos el de defecto (esta en ingles)
            anasint.addErrorListener(errorListener); // Ponemos el nuestro

            // 2. Ejecutar el axioma y capturar el contexto
            org.example.calculoCientificoToCParser.PrgContext ctx = anasint.prg();


            // 3. Comprobar si ha saltado la bandera de errores.
            if ( errorListener.hasBlockingErrors() || anasint.hayErroresSemanticos) {
                System.err.println("\nTraducción abortada: Se han encontrado errores en el código fuente.");
                return; // Salimos sin generar el fichero .c
            }
            // 4. Obtener el atributo sintetizado 'res'
            String codigoTraducido = ctx.res;

            // 5. Generar el nombre del archivo de salida (.c)
            String nombreEntrada = args[0];
            String nombreSalida = nombreEntrada.substring(0, nombreEntrada.lastIndexOf('.')) + ".c";

            // 6. Escribir el resultado en el archivo
            try (PrintWriter writer = new PrintWriter(new FileWriter(nombreSalida))) {
                writer.print(codigoTraducido);
                if( errorListener.hasErrors() || anasint.hayErroresSemanticos){
                    System.out.println("Traducción completada con errores en: " + nombreSalida);
                }
                else{
                    System.out.println("Traducción completada sin errores en: " + nombreSalida);
                }


                System.out.println("--- CÓDIGO TRADUCIDO ---");
                System.out.println(codigoTraducido);
                System.out.println("------------------------");
            }

        } catch (IOException e) {
            System.err.println("Error de IO: " + e.getMessage());
        }
    }
}