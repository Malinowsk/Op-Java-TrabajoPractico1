package org.example.Ejercicio3;


/*

La estrategia utilizada consiste en recorrer el arbol en inorden utlizando recursividad (Atraviese el sub-árbol izquierdo, Visite la raíz, Atraviese el sub-árbol derecho)
Se utiliza una variable global (numActualDelRecorrido) para guardar el dato visitado hasta el momento, y vamos comparando si el dato visitado que le sigue, es mayor e igual al anterior visitado.
Como el recorrido es inorden, siempre deberia darse esa coincidencia, de lo contrario el arbol no es de busqueda, lo que se corta la recursividad y se devuelva false, en caso contrario el resultado es true.
 */


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
