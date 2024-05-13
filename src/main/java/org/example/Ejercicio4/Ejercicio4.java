package org.example.Ejercicio4;

/*

La estrategia utilizada para resolver el problema es recorrer el arreglo A en busca de fotógrafos ('f').
Una vez que se encuentra un fotógrafo, se realizan dos recorridos: uno hacia la derecha y otro hacia la izquierda, en busca de artistas ('a').
Para cada artista encontrado, se realiza otro recorrido en la misma dirección para encontrar un escenario ('e').
Si se cumplen todas las condiciones de distancia especificadas por los valores de X e Y, se incrementa el contador de fotografías artísticas.

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

