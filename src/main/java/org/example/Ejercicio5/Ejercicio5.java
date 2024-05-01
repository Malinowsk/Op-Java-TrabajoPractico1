package org.example.Ejercicio5;

public class Ejercicio5 {

    private static char[][] juego;
    private static int pos_x;
    private static int pos_y;
    private static int cols;
    private static int fils;

    // la estrategia es no volver por el mismo camino
    public static int getJuego(char[][] matriz, int columnas, int filas, int pos_inicio_x, int pos_inicio_y) {
        juego = matriz;
        int pasos = -1;

        cols = columnas;
        fils = filas;

        pos_x = pos_inicio_x-1;
        pos_y = pos_inicio_y-1;

        pasos = pasosparalasolucion(matriz, pos_x,pos_y); // izquierda

        return pasos;
    }

    private static int pasosparalasolucion(char[][] matriz, int x, int y){
        int minimoDePasos = -1;

        if(x<0 || x>=cols || y<0 || y>=fils || matriz[y][x]=='#' || matriz[y][x]==' '){
            return -1; // no es una solucion inviable
        }
        else if(matriz[y][x]=='S') {
            return 1; // se termina la recursividad
        }
        else if (matriz[y][x]=='.'|| matriz[y][x]=='E')  // avanzo un casillero y me muevo para los 4 lados
        {
            int contador = 1;
            if (matriz[y][x]=='E'){
                contador = 0;
            }
            char[][] copia = copiaMatriz(matriz);
            copia[y][x] = ' ';
            int auxiliar = 0;
            //derecha
            auxiliar = pasosparalasolucion(copia,x+1,y);
            minimoDePasos = minDePasos(auxiliar,minimoDePasos,contador);
            //izquierda
            auxiliar = pasosparalasolucion(copia,x-1,y);
            minimoDePasos = minDePasos(auxiliar,minimoDePasos,contador);
            //arriba
            auxiliar = pasosparalasolucion(copia,x,y+1);
            minimoDePasos = minDePasos(auxiliar,minimoDePasos,contador);
            //abajo
            auxiliar = pasosparalasolucion(copia,x,y-1);
            minimoDePasos = minDePasos(auxiliar,minimoDePasos,contador);
        }

        return minimoDePasos;
    }

    private static int minDePasos(int auxiliar,int minimoDePasos,int contador){
        if (auxiliar != -1)
        {
            if ( (minimoDePasos==-1) || (minimoDePasos > (auxiliar+contador))){
                minimoDePasos = auxiliar+contador;
            }
        }
        return minimoDePasos;
    }
    private static char[][] copiaMatriz(char[][] matriz){
        char[][] retorno = new char[fils][cols];
        for(int j = 0; j<(fils) ; j++){
            for(int i = 0; i<(cols) ; i++){
                retorno[j][i]=matriz[j][i];
            }
        }
        return retorno;
    }

}


