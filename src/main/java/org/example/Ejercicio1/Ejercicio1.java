package org.example.Ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio1 {

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

}
