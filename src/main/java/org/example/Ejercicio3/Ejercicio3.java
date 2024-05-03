package org.example.Ejercicio3;

/*

Problema 3: Árbol de búsqueda
Dado un árbol, determine si dicho árbol es un árbol binario de búsqueda. Cada nodo está definido
como:
public class Node {
    int data;
    Node left;
    Node right;
}

Se considera que es un árbol binario de búsqueda si:
• El dato de un nodo es mayor a todos los datos en su rama izquierda.
• El dato de un nodo es menor a todos los datos en su rama derecha.

 */

import java.util.ArrayList;

public class Ejercicio3 {

    public static class Arbol{
        ArrayList<Nodo> arbol;

        public Arbol(){
            this.arbol = new ArrayList<>();
        }

        public void agregarNodo(Nodo n){
            this.arbol.add(n);
        }

        public void mostrarArbol(){
            System.out.println("Arbol: ");
            for (Nodo nodo : this.arbol){
                nodo.mostrar();
            }
        }


        public Boolean esArbolDeBusqueda(Nodo nodo){

            if (nodo != null){
                if (nodo.getLeft() !=null && nodo.getData() > nodo.getLeft().getData()) {
                    esArbolDeBusqueda(nodo.left);
                }else {
                    return false;
                }


                if (nodo.getRight() !=null && nodo.getData() < nodo.getRight().getData()) {
                    esArbolDeBusqueda(nodo.right);
                }else {
                    return false;
                }

           }
            return true;
        }


        public void verificarArbolDeBusqueda(Nodo nodo){
            if (esArbolDeBusqueda(nodo)){
                System.out.println("Es un árbol binario de búsqueda");
            }
            else {
                System.out.println("No un árbol binario de búsqueda");
            }
        }
    }




    public static class Nodo {
        int data;
        Nodo left;
        Nodo right;

        public Nodo(int data, Nodo left, Nodo right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }

        public int getData() {
            return data;
        }
        public void setData(int data) {
            this.data = data;
        }
        public Nodo getLeft() {
            return left;
        }
        public void setLeft(Nodo left) {
            this.left = left;
        }
        public Nodo getRight() {
            return right;
        }
        public void setRight(Nodo right) {
            this.right = right;
        }


        public void mostrar() {
            System.out.println("Nodo: " + data);

            try {
                System.out.println("Izquierda: " + this.left.data);
            } catch (NullPointerException e) {
                System.out.println("Izquierda: null");
            }

            try {
                System.out.println("Derecha: " + this.right.data);
            } catch (NullPointerException e) {
                System.out.println("Derecha: null");
            }
            System.out.println();
        }
    }



}
