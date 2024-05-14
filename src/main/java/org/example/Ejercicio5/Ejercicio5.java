package org.example.Ejercicio5;

import java.util.ArrayList;
import java.util.HashMap;

/*

La estrategia utilizada es el backtracking utilizando un procedimiento recursivo, dado una matriz y una posicion
se busca las soluciones para los 4 movimientos posibles, quedandonos con la mejor solucion.
Si algun camino no es solucion se devuelve -1.
Para los portales, utilizo una variable boleana para saber si estoy entrando o saliendo del portal,
para el caso de que estoy entrando, armo un hashmap con todas las posibles portales que puedo tomar.
*/


public class Ejercicio5 {

    private static int pos_x;
    private static int pos_y;
    private static int cols;
    private static int fils;

    // la estrategia es no volver por el mismo camino
    public static int getJuego(char[][] matriz, int columnas, int filas, int pos_inicio_x, int pos_inicio_y) {
        int pasos = -1;

        cols = columnas;
        fils = filas;

        pos_x = pos_inicio_x-1;
        pos_y = pos_inicio_y-1;

        pasos = pasosparalasolucion(matriz, pos_x,pos_y,false); // izquierda

        return pasos;
    }

    private static int pasosparalasolucion(char[][] matriz, int x, int y, boolean salidaPortal){
        int minimoDePasos = -1;
        int auxiliar = 0;
        int contador = 1;

        if(x<0 || x>=cols || y<0 || y>=fils || matriz[y][x]=='#' || matriz[y][x]==' '){
            return -1; // no es una solucion inviable
        }
        else if(matriz[y][x]=='S') {
            return 1; // se termina la recursividad
        }
        else if (matriz[y][x]=='.'|| matriz[y][x]=='E' || (Character.isLowerCase(matriz[y][x]) && salidaPortal) )  // avanzo un casillero y me muevo para los 4 lados
        {
            if(salidaPortal){
                salidaPortal=false;
            }
            if (matriz[y][x]=='E'){
                contador = 0;
            }
            char[][] copia = copiaMatriz(matriz);
            copia[y][x] = ' ';
            //derecha
            auxiliar = pasosparalasolucion(copia,x+1,y,salidaPortal);
            minimoDePasos = minDePasos(auxiliar,minimoDePasos,contador);
            //izquierda
            auxiliar = pasosparalasolucion(copia,x-1,y,salidaPortal);
            minimoDePasos = minDePasos(auxiliar,minimoDePasos,contador);
            //arriba
            auxiliar = pasosparalasolucion(copia,x,y+1,salidaPortal);
            minimoDePasos = minDePasos(auxiliar,minimoDePasos,contador);
            //abajo
            auxiliar = pasosparalasolucion(copia,x,y-1,salidaPortal);
            minimoDePasos = minDePasos(auxiliar,minimoDePasos,contador);
        }else{ // cai en un portal
            char letraPortal = matriz[y][x];
            char[][] copia = copiaMatriz(matriz);
            copia[y][x] = ' ';
            ArrayList<Dupla> portales = devolverpuntosdesalida(copia,letraPortal);
            if (portales.isEmpty()){
                return -1;
            }
            else {
                for(Dupla portal : portales){
                    auxiliar = pasosparalasolucion(copia,portal.getCor_x(),portal.getCor_y(),true);
                    minimoDePasos = minDePasos(auxiliar,minimoDePasos,contador);
                }
            }
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

    private static ArrayList<Dupla> devolverpuntosdesalida(char[][] copia,char letraPortal){
        ArrayList<Dupla> retorno = new ArrayList<>();
        for(int j = 0; j<(fils) ; j++){
            for(int i = 0; i<(cols) ; i++){
                if (copia[j][i]==letraPortal)
                    retorno.add(new Dupla(i,j));
            }
        }
        return retorno;
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

