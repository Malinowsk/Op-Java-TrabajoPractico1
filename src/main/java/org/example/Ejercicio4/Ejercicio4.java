package org.example.Ejercicio4;

/*

Problema 4: Fotografía artística
Se está desarrollando un sistema para un estudio fotográfico que desea saber cuántas fotografías
artísticas se pueden realizar con un arreglo de fotógrafos, artistas y escenario. La organización de los
fotógrafos, artistas y fondos se presenta en un arreglo A de N elementos, donde:

A[i]=’f’ si en la posición i hay un fotógrafo.
A[i]=’a’ si en la posición i hay un artista.
A[i]=’e’ si en la posición i hay un escenario.
A[i]=’.’ si en la posición i no hay nada.
Para que una fotografía sea artística, un fotógrafo debe encontrarse a una distancia entre X e Y de un
artista, que a su vez debe estar a una distancia entre X e Y de un escenario en la misma dirección.
Ejemplos:

Caso
A=afaea
X=1
Y=2
Salida esperada = 1

A=afaea
X=2
Y=3
Salida esperada = 0

A=.feaaf.e
X=1
Y=3
Salida esperada = 3

*/

public class Ejercicio4 {

    public static int contarFotosArtisticas(char[] A, int X, int Y) {
        int contador = 0;

        if (A !=null) { // Si el arreglo no está vacío

            for (int i = 0; i < A.length; i++) {
                if (A[i] == 'f') {  // Si encontramos un fotógrafo

                    // Recorrido hacia la derecha de f
                    for (int j = X; j <= Y; j++) { // A partir del fotografo encontrado, se busca un artista
                        if (i+j < A.length && A[i + j] == 'a') { // Si encontramos un artista a una distancia desde X hasta Y

                            for (int k = X; k <= Y; k++) { // A partir del artista encontrado, se busca un escenario
                                if (i+j+k < A.length && A[i + j + k] == 'e') { // Si encontramos un escenario a una distancia desde X hasta Y

                                    contador++;

                                }
                            }
                        }
                    }

                    // Recorrido hacia la izquierda de f
                    for (int j = X; j <= Y; j++) { // A partir del fotografo encontrado, se busca un artista
                        if (i-j >= 0 && A[i - j] == 'a') { // Si encontramos un artista a una distancia desde X hasta Y

                            for (int k = X; k <= Y; k++) { // A partir del artista encontrado, se busca un escenario
                                if (i-j-k >= 0 && A[i - j - k]  == 'e') { // Si encontramos un escenario a una distancia desde X hasta Y

                                    contador++;

                                }
                            }
                        }
                    }
                }
            }
        }

        return contador;
    }
}

