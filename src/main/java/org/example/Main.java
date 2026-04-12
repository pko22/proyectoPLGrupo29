package org.example;
import java.io.IOException;
import java.io.*;
import org.antlr.v4.runtime.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {
            // 1. Preparar entrada
            CharStream input = CharStreams.fromFileName(args[0]);
            org.example.calculoCientificoToCLexer analex = new org.example.calculoCientificoToCLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            org.example.calculoCientificoToCParser anasint = new org.example.calculoCientificoToCParser(tokens);

            // 2. Ejecutar el axioma y capturar el contexto
            // PrgContext es la clase que genera ANTLR para tu regla 'prg'
            org.example.calculoCientificoToCParser.PrgContext ctx = anasint.prg();

            // 3. Obtener el atributo sintetizado 'res' que definiste en el .g4
            String codigoTraducido = ctx.res;

            // 4. Generar el nombre del archivo de salida (.c)
            // El enunciado dice que si entra 'ejemplo.for' sale 'ejemplo.c' [cite: 175]
            String nombreEntrada = args[0];
            String nombreSalida = nombreEntrada.substring(0, nombreEntrada.lastIndexOf('.')) + ".c";

            // 5. Escribir el resultado en el archivo
            try (PrintWriter writer = new PrintWriter(new FileWriter(nombreSalida))) {
                writer.print(codigoTraducido);
                System.out.println("Traducción completada con éxito en: " + nombreSalida);

                System.out.println("--- CÓDIGO TRADUCIDO ---");
                System.out.println(codigoTraducido);
                System.out.println("------------------------");
            }

        } catch (IOException e) {
            System.err.println("Error de IO: " + e.getMessage());
        }
    }

}