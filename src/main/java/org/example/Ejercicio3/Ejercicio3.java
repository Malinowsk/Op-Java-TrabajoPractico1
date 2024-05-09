package org.example.Ejercicio3;

public class Ejercicio3 {
    private static int numActualDelRecorrido;

    // la estrategia es no volver por el mismo camino
    public static boolean esBinarioDeBusqueda(Nodo raiz) {
        numActualDelRecorrido = Integer.MIN_VALUE;
        return esBinarioDeBusq(raiz);
    }

    private  static boolean esBinarioDeBusq(Nodo arbol){
        if( (arbol.getLeft() == null || esBinarioDeBusq(arbol.getLeft())) && numActualDelRecorrido <= arbol.getData()){
            numActualDelRecorrido = arbol.getData();
             return (arbol.getRight() == null || (esBinarioDeBusq(arbol.getRight())));
        }
        return false;
    }
}
