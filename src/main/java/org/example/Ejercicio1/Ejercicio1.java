package org.example.Ejercicio1;

import java.util.HashMap;
import java.util.Map;


/*

La estrategia utilizada consiste en recorrer el texto caracter por caracter y construir las palabras mediante el ensamblaje de caracteres consecutivos que son letras.
Cuando se encuentra un caracter que no es una letra, se considera que una palabra ha terminado y se procede a guardarla en un HashMap junto con su conteo de ocurrencias.
En esa misma iteracion nos quedando con la palabra que mas veces se repite.

La comparación entre palabras se hace ignorando las diferencias entre mayúsculas y minúsculas, lo que asegura que palabras como "Casa" y "casa" sean consideradas iguales.

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

