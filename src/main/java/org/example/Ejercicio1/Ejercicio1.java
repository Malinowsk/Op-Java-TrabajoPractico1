package org.example.Ejercicio1;

import java.util.HashMap;
import java.util.Map;


/*

Problema 1: Palabra más usada
Se desea implementar un sistema que dado un String retorne la palabra más usada. Las palabras
son divididas por la existencia de espacios o caracteres diferentes a letras entre las mismas. Solo se
considera como palabra a toda secuencia de caracteres con una longitud mayor o igual a N donde N
es un parámetro. Finalmente, la igualdad entre las palabras debe ignorar el uso de mayúsculas y
minúsculas.

 */
public class Ejercicio1 {

    private static StringBuilder palabraActual;
    private static int maxRepeticiones;
    private static String palabraMasRepetida;
    private static int tamanio;
    private static Map<String, Integer> contadorPalabras;

    // Retorno la palabra correcta mas repetida
    public static String contarPalabrasRepetidas(String texto, int tamaniomax) {

        inicializacion(tamaniomax); // inicializar variables

        for (char c : texto.toCharArray()) { // recorremos el string , caracter a caracter
            if (Character.isLetter(c)) { // consulta si es letra
                palabraActual.append(c);    // agrego letra a palabra actual
            } else {
                guardarPalabra();   // se guarda la palabra en el hashmap y la contabiliza
            }
        }
        guardarPalabra(); // se guarda la palabra en el hashmap y la contabiliza
        System.out.println("Contador de palabras:");
        System.out.println(contadorPalabras); // borrar luego
        System.out.println();
        return palabraMasRepetida;
    }

    private static void inicializacion(int tamaniomax){
        tamanio = tamaniomax;
        // Crear un mapa para contar las ocurrencias de cada palabra
        contadorPalabras = new HashMap<>();
        // Quedarme con la ocurrencias mayor
        palabraMasRepetida = "";
        maxRepeticiones = 0;
        // crear y llevar la palabra actual
        palabraActual = new StringBuilder();
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
