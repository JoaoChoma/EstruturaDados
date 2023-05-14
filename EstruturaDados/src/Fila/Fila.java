/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fila;

import java.util.LinkedList;

/**
 *
 * @author joaochoma
 */
public class Fila<T> {
    private LinkedList<T> elementos = new LinkedList<T>();

    public void enfileira(T elemento) {
        elementos.add(elemento);
    }

    public T desenfileira() {
        return elementos.removeFirst();
    }

    public boolean vazia() {
        return elementos.size() == 0;
    }

    public int tamanho() {
        return elementos.size();
    }

    public T primeiro() {
        return elementos.getFirst();
    }

    public T ultimo() {
        return elementos.getLast();
    }
}
