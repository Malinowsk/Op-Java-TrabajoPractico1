package org.example.Ejercicio2;

import java.math.BigInteger;
/*

Problema 2: Fibonacci
Utilizando solo tipos primitivos, implemente un algoritmo que retorne el valor de Fibonacci para un
entero mayor o igual a 0 y menor igual a 90. Recuerde que:

fib(0) = fib(1) = 1
fib(n) = fib(n-1) + fib(n-2)

Opcional:
Extienda el algoritmo para que pueda calcular número de fibonacci más grandes, por ejemplo,
fib(1000).

*/


public class Ejercicio2 {

    // Para el primer caso usaremos el tipo primitivo long, el cual tiene un tamaño de 64 bits

//    public static long Fibonacci(int n) {
//
//        long fib = 0;
//        long fibMenos1 = 1;  // Primer término
//        long fibMenos2 = 1;  // Segundo término
//
//        if (n <= 1){
//            return 1;}
//        else {
//            for (int i = 2; i < n; i++) {
//                fib = fibMenos1 + fibMenos2;
//                fibMenos2 = fibMenos1;
//                fibMenos1 = fib;
//            }
//        }
//
//        return fib;
//    }

    // El numero de Fibonacci para 90 es: 2880067194370816120



    // Ya que los tipos primitivos no pueden manejar numeros grandes,
    // para calcular el número de Fibonacci de 1000 usaremos la clase BigInteger de Java.

    public static BigInteger Fibonacci(int n) {

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

    // El resultado para 1000 es: 43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875

}
