package org.example;

import org.example.Ejercicio1.Ejercicio1;
import org.example.Ejercicio2.Ejercicio2;
import org.example.Ejercicio5.Ejercicio5;
import org.example.Ejercicio3.Ejercicio3;
import java.math.BigInteger;


// Trabajo practico n1 , realizado por Eugenio Romanelli y Juan Ignacio Rago
public class Main {
    public static void main(String[] args) {

//        System.out.println("Ejercicio 1: ");
//        System.out.println();
//        ejercicio1();
//        System.out.println();
//        System.out.println("Ejercicio 2: ");
//        System.out.println();
//        ejercicio2();
        System.out.println("Ejercicio 2: ");
        System.out.println();
        ejercicio3();
//        System.out.println();
//        System.out.println("Ejercicio 5: ");
//        System.out.println();
//        ejercicio5();

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
        System.out.println();

        // prueba 2
        texto = "H h g a f tt yyy y w 23 54y6t6y7u8iooo0 tt 1443.hola.";
        longitudMinimaPalabra = 1; // Definir la longitud mínima de las palabras
        palabraMasUsada = Ejercicio1.contarPalabrasRepetidas(texto, longitudMinimaPalabra);
        System.out.println("La palabra más usada es: " + palabraMasUsada);
        System.out.println();

        // prueba 3
        texto = "cursada CURsada OpTaTiVa CURSADA OP.TATIVA";
        longitudMinimaPalabra = 7; // Definir la longitud mínima de las palabras
        palabraMasUsada = Ejercicio1.contarPalabrasRepetidas(texto, longitudMinimaPalabra);
        System.out.println("La palabra más usada es: " + palabraMasUsada);
        System.out.println();
    }


    public static void ejercicio2(){

        // Ejercicio 2

        int n = 1000; // Valor de Fibonacci a calcular
        BigInteger fibonacci = Ejercicio2.Fibonacci(n);
        System.out.println("El valor de Fibonacci para " + n + " es: " + fibonacci);
    }


    public static void ejercicio3(){

        // Ejercicio 3

        Ejercicio3.Nodo nodo1 = new Ejercicio3.Nodo(3, null, null);
        Ejercicio3.Nodo nodo2 = new Ejercicio3.Nodo(2, null, null);
        Ejercicio3.Nodo nodo3 = new Ejercicio3.Nodo(65, null, null);
        Ejercicio3.Nodo nodo4 = new Ejercicio3.Nodo(10, null, null);

        nodo1.setLeft(nodo2);
        nodo1.setRight(nodo4);
        nodo4.setRight(nodo3);


        Ejercicio3.Arbol arbol = new Ejercicio3.Arbol();

        arbol.agregarNodo(nodo1);
        arbol.agregarNodo(nodo2);
        arbol.agregarNodo(nodo3);
        arbol.agregarNodo(nodo4);

        arbol.mostrarArbol();

        arbol.verificarArbolDeBusqueda(nodo1, nodo1.getData());

    }


    public static void ejercicio5(){
        int columnas;
        int filas;
        int posx;
        int posy;
        int retorno;

        columnas = 4;
        filas = 4;
        posx = 1;
        posy = 1;
        char[][] matrizEj1 = new char[][]{{'E', '.', '.', '.'},
                                          {'#', '#', '#', '.'},
                                          {'.', '.', '.', '.'},
                                          {'.', '.', 'S', '.'}};
        imprimirMatriz(matrizEj1,columnas,filas);
        retorno = Ejercicio5.getJuego(matrizEj1,columnas,filas,posx,posy);

        System.out.println();
        if (retorno!=-1)
            System.out.println("La solución mas eficiente se resuelve con " + retorno + " pasos");
        else
            System.out.println("No tiene solución");
        System.out.println();

        columnas = 4;
        filas = 6;
        posx = 1;
        posy = 1;
        char[][] matrizEj2 = new char[][]{  {'E', '.', '.', '.'},
                                            {'#', '#', '#', '.'},
                                            {'.', 'S', 'a', '.'},
                                            {'.', '.', '#', '#'},
                                            {'.', '#', '.', 'a'},
                                            {'.', '.', '.', '.'}};
        imprimirMatriz(matrizEj2,columnas,filas);
        retorno = Ejercicio5.getJuego(matrizEj2,columnas,filas,posx,posy);

        System.out.println();
        if (retorno!=-1)
            System.out.println("La solución mas eficiente se resuelve con " + retorno + " pasos");
        else
            System.out.println("No tiene solución");
        System.out.println();

        columnas = 4;
        filas = 6;
        posx = 1;
        posy = 1;
        char[][] matrizEj3 = new char[][]{  {'E', '.', '.', 'a'},
                                            {'#', '#', '.', '.'},
                                            {'a', '.', '.', '.'},
                                            {'.', '.', '#', '#'},
                                            {'.', '#', 'S', '.'},
                                            {'z', '#', 'z', '.'}};
        imprimirMatriz(matrizEj3,columnas,filas);
        retorno = Ejercicio5.getJuego(matrizEj3,columnas,filas,posx,posy);

        System.out.println();
        if (retorno!=-1)
            System.out.println("La solución mas eficiente se resuelve con " + retorno + " pasos");
        else
            System.out.println("No tiene solución");
        System.out.println();
    }

    private static void imprimirMatriz(char[][] matriz,int cols, int fils){
        System.out.println("Matriz: ");
        System.out.println();
        for(int j = 0; j<(fils) ; j++){
            for(int i = 0; i<(cols) ; i++){
                System.out.print(matriz[j][i] + "  ");
            }
            System.out.println();
        }
    }

}