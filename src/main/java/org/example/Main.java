package org.example;

import org.example.Ejercicio1.Ejercicio1;

// Trabajo practico n1 , realizado por Eugenio Romanelli y Juan Ignacio Rago
public class Main {
    public static void main(String[] args) {

        ejercicio1();

    }

    public static void ejercicio1(){
        // ejercicio 1

        String texto;
        int longitudMinimaPalabra; // Definir la longitud mínima de las palabras

        // prueba 1
        texto = "Hola hola hola mundo mundo mundo mundo hola mmundo  mun peepspel 1443.hola   1hola111hola";
        longitudMinimaPalabra = 4;
        String palabraMasUsada = Ejercicio1.contarPalabrasRepetidas(texto, longitudMinimaPalabra);
        System.out.println("La palabra más usada es: " + palabraMasUsada);

        // prueba 2
        texto = "H h g a f tt yyy y w 23 54y6t6y7u8iooo0 tt 1443.hola.";
        longitudMinimaPalabra = 1; // Definir la longitud mínima de las palabras
        palabraMasUsada = Ejercicio1.contarPalabrasRepetidas(texto, longitudMinimaPalabra);
        System.out.println("La palabra más usada es: " + palabraMasUsada);

        // prueba 3
        texto = "cursada CURsada OpTaTiVa CURSADA OP.TATIVA";
        longitudMinimaPalabra = 7; // Definir la longitud mínima de las palabras
        palabraMasUsada = Ejercicio1.contarPalabrasRepetidas(texto, longitudMinimaPalabra);
        System.out.println("La palabra más usada es: " + palabraMasUsada);
    }
}