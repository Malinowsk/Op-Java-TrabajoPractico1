package org.example;

import org.example.Ejercicio1.Ejercicio1;

public class Main {
    public static void main(String[] args) {
        String texto = "Hola hola hola mundo mundo mundo mundo hola";
        int longitudMinimaPalabra = 4; // Definir la longitud mínima de las palabras

        String palabraMasUsada = Ejercicio1.contarPalabrasRepetidas(texto, longitudMinimaPalabra);
        System.out.println("La palabra más usada es: " + palabraMasUsada);
    }
}