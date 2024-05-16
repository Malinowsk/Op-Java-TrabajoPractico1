package org.example.Ejercicio2;

import java.math.BigInteger;
/*

Se implementan tres versiones del cálculo del número de Fibonacci:
Una versión utilizando el tipo primitivo long, otra utilizando el tipo de punto flotante double,
y la última utilizando la clase BigInteger para manejar números de gran tamaño como fibonacci(1000).

Al realizar la comparativa, podemos observar que los resultados no coinciden para los números de Fibonacci de gran tamaño.
Esto se debe a que los números de punto flotante tienen una precisión limitada y solo pueden representar un número finito de dígitos significativos.
A medida que el número crece, la precisión se pierde, y los errores de redondeo se vuelven más significativos.

*/


public strictfp class Ejercicio2 {

    // cálculo con tipo primitivo long, tamaño de 64 bits
    public static long fibonacciPrimitivo(int n) {

        long fib = 0;
        long fibMenos1 = 1;  // Primer término
        long fibMenos2 = 1;  // Segundo término

        if (n <= 1){
            return 1;}
        else {
            for (int i = 2; i < n; i++) {
                fib = fibMenos1 + fibMenos2;
                fibMenos2 = fibMenos1;
                fibMenos1 = fib;
            }
        }

        return fib;
    }


    // cálculo con tipo primitivo double
    public static double fibonacciFloat(int n) {

        double fib = 0.0d;
        double fibMenos1 = 1.0d;  // Primer término
        double fibMenos2 = 1.0d;  // Segundo término

        if (n <= 1){
            return 1.0d;}
        else {
            for (int i = 2; i < n; i++) {
                fib = fibMenos1 + fibMenos2;
                fibMenos2 = fibMenos1;
                fibMenos1 = fib;
            }
        }
        return fib;
    }


    // para calcular el número de Fibonacci de 1000 usaremos la clase BigInteger de Java
    public static BigInteger fibonacciBigInteger(int n) {

        // Inicializacion de las variables
        BigInteger fib = BigInteger.valueOf(0);
        BigInteger fibMenos1 = BigInteger.valueOf(1);  // Primer término
        BigInteger fibMenos2 = BigInteger.valueOf(1);  // Segundo término

        if (n <= 1){
            return BigInteger.valueOf(1);}
        else {
            for (int i = 2; i < n; i++) {
                fib = fibMenos1.add(fibMenos2);  //Suma los dos términos
                fibMenos2 = fibMenos1;
                fibMenos1 = fib;
            }
        }

        return fib;
    }

}
