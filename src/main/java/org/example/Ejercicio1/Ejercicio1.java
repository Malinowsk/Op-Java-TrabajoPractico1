package org.example.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {

    private static StringBuilder palabraActual;
    private static int maxRepeticiones;
    private static String palabraMasRepetida;
    private static int tamanio;
    private static Map<String, Integer> contadorPalabras;

/*

        public static String contarPalabrasRepetidas(String texto, int tamanio) {

            // Dividir el string en palabras individuales
            String[] palabras = texto.split("[^a-zA-Z]+");

            // Crear un mapa para contar las ocurrencias de cada palabra
            Map<String, Integer> contadorPalabras = new HashMap<>();

            // Iterar sobre las palabras y contar las ocurrencias
            String palabraMasRepetida = "";
            int maxRepeticiones = 0;
            for (String palabra : palabras) {
                if (palabra.length() >= tamanio) {
                    // Contar las ocurrencias de la palabra actual
                    int contador = contadorPalabras.getOrDefault(palabra, 0) + 1;
                    contadorPalabras.put(palabra, contador);

                    // Actualizar la palabra más repetida si es necesario
                    if (contador > maxRepeticiones) {
                        maxRepeticiones = contador;
                        palabraMasRepetida = palabra;
                    }

                }
            }

            return palabraMasRepetida;
        }

*/


    public static String contarPalabrasRepetidas(String texto, int tamaniomax) {
        tamanio = tamaniomax;
        // Crear un mapa para contar las ocurrencias de cada palabra
        contadorPalabras = new HashMap<>();
        // Quedarme con la ocurrencias mayor
        palabraMasRepetida = "";
        maxRepeticiones = 0;
        // crear y llevar la palabra actual
        palabraActual = new StringBuilder();

        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                palabraActual.append(c);
            } else {
                guardarPalabra();
            }
        }
        guardarPalabra();
        System.out.println(contadorPalabras);
        return palabraMasRepetida;
    }

    private static void guardarPalabra() {
        String palabra = palabraActual.toString().toLowerCase();
        if (!palabra.isEmpty()) { // palabra actual tiene algo?
            if (palabra.length() >= tamanio) { // la palabra actual contiene el tamaño necesario para contabilizarla?

                // Contar las ocurrencias de la palabra actual
                int contador = contadorPalabras.getOrDefault(palabra, 0) + 1;

                // agregar al hashmap
                contadorPalabras.put(palabra, contador);

                // Actualizar la palabra más repetida si es necesario
                if (contador > maxRepeticiones) {
                    maxRepeticiones = contador;
                    palabraMasRepetida = palabra;
                }
            }
            palabraActual.setLength(0); // Limpiar la palabra actual
        }
    }

}
