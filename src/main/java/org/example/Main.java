package org.example;

import org.example.Ejercicio1.Ejercicio1;
import org.example.Ejercicio2.Ejercicio2;
import org.example.Ejercicio3.Ejercicio3;
import org.example.Ejercicio4.Ejercicio4;
import org.example.Ejercicio5.Ejercicio5;
import org.example.Ejercicio3.Nodo;
import java.math.BigInteger;
import java.util.Arrays;



// Trabajo practico n1 , realizado por Eugenio Romanelli y Juan Ignacio Rago
public class Main {
    public static void main(String[] args) {

       /* System.out.println("Ejercicio 1: ");
        System.out.println();
        ejercicio1();*/
        System.out.println();
        System.out.println("Ejercicio 2: ");
        System.out.println();
        ejercicio2();
  /*
        System.out.println();
        System.out.println("Ejercicio 3: ");
        System.out.println();
        ejercicio3();
        System.out.println();
        System.out.println("Ejercicio 4: ");
        System.out.println();
        ejercicio4();
        System.out.println();
        System.out.println("Ejercicio 5: ");
        System.out.println();
        ejercicio5();
*/
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

        int n = 77; // Valor de Fibonacci a calcular

        long fibonacciPrimitivo = Ejercicio2.fibonacciPrimitivo(n);
        System.out.println("Fibonacci de " + n + " (versión long): " + fibonacciPrimitivo);

        double fibonacciFloat = Ejercicio2.fibonacciFloat(n);
        System.out.println("Fibonacci de " + n + " (versión flotante): " + fibonacciFloat);

        BigInteger fibonacciBigInteger = Ejercicio2.fibonacciBigInteger(n);
        System.out.println("Fibonacci de " + n + " (versión BigInteger): " + fibonacciBigInteger);


        // Comparación con BigInteger para verificar la precisión
        if (fibonacciBigInteger.equals(BigInteger.valueOf((long) fibonacciFloat))){
            System.out.println("Las dos implementaciones coinciden.");
        } else {
            System.out.println("Las dos implementaciones NO coinciden.");
        }

    }

    public static void ejercicio3(){

        // Ejercicio 3

        // Creacion del arbol

        Nodo nodo1 = new Nodo(1, null, null);
        Nodo nodo2 = new Nodo(2, nodo1, null);
        Nodo nodo10 = new Nodo(10, null, null);
        Nodo nodo65 = new Nodo(65, nodo10, null);
        Nodo nodo3 = new Nodo(3, nodo2, nodo65);

        // Creacion del arbol
        boolean retorno = Ejercicio3.esBinarioDeBusqueda(nodo3);
        if(retorno){
            System.out.println("Es binario de busqueda");
        }
        else {
            System.out.println("No es binario de busqueda");
        }

        // Creacion del arbol

        nodo1 = new Nodo(1, null, null);
        nodo2 = new Nodo(2, nodo1, null);
        nodo10 = new Nodo(2, null, null);
        nodo65 = new Nodo(65, nodo10, null);
        nodo3 = new Nodo(3, nodo2, nodo65);

        // Creacion del arbol
        retorno = Ejercicio3.esBinarioDeBusqueda(nodo3);
        if(retorno){
            System.out.println("Es binario de busqueda");
        }
        else {
            System.out.println("No es binario de busqueda");
        }


        // Creacion del arbol

        nodo1 = new Nodo(1, null, null);
        nodo2 = new Nodo(2, nodo1, null);
        Nodo nodo4 = new Nodo(4, null, null);
        nodo3 = new Nodo(3, nodo2, nodo4);
        Nodo nodo30 = new Nodo(30, nodo3, null);
        nodo10 = new Nodo(50, null, null);
        Nodo nodo69 = new Nodo(69, null, null);
        Nodo nodo71 = new Nodo(71, null, null);
        Nodo nodo70 = new Nodo(70, nodo69, nodo71);
        nodo65 = new Nodo(65, nodo10, nodo70);
        Nodo nodo41 = new Nodo(41, nodo30, nodo65);

        // Creacion del arbol
        retorno = Ejercicio3.esBinarioDeBusqueda(nodo41);
        if(retorno){
            System.out.println("Es binario de busqueda");
        }
        else {
            System.out.println("No es binario de busqueda");
        }


    }



    public static void ejercicio4(){

        // Ejercicio 4

        char[] A1 = {'a', 'f', 'a', 'e', 'a'};
        int X1 = 1;
        int Y1 = 2;
        System.out.println("A1 = " + Arrays.toString(A1));
        System.out.println("Salida esperada = 1");
        System.out.println("Salida obtenida = " + Ejercicio4.contarFotosArtisticas(A1, X1, Y1) + "\n");

        char[] A2 = {'a', 'f', 'a', 'e', 'a'};
        int X2 = 2;
        int Y2 = 3;
        System.out.println("A2 = " + Arrays.toString(A2));
        System.out.println("Salida esperada = 0");
        System.out.println("Salida obtenida = " + Ejercicio4.contarFotosArtisticas(A2, X2, Y2) + "\n");

        char[] A3 = {'.', 'f', 'e', 'a', 'a', 'f', '.', 'e'};
        int X3 = 1;
        int Y3 = 3;
        System.out.println("A3 = " + Arrays.toString(A3));
        System.out.println("Salida esperada = 3");
        System.out.println("Salida obtenida = " + Ejercicio4.contarFotosArtisticas(A3, X3, Y3) + "\n");
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