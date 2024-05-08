package org.example.Ejercicio3;

// Clase que representa un nodo
public class Nodo {
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

    public Nodo getLeft() {
        return left;
    }

    public Nodo getRight() {
        return right;
    }
}
