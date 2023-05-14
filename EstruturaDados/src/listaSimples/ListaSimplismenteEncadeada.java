/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaSimples;

/**
 *
 * @author joaochoma
 */
public class ListaSimplismenteEncadeada {
    private Node inicio;
    private int tamanho;

    
    private class Node {
        int valor;
        Node proximo;

        Node(int valor) { // construtor class no
            this.valor = valor;
            this.proximo = null;
        }
    }

    public ListaSimplismenteEncadeada() { // construtor da lista
        this.inicio = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public int tamanho() {
        return tamanho;
    }
    
    public void adicionar(int valor) {
        Node novoNo = new Node(valor);

        if (inicio == null) {
            inicio = novoNo;
        } else {
            Node atual = inicio;
            while (atual.proximo != null) {
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }

        tamanho++;
    }
    
    public void imprimir() {
        if (estaVazia()) {
            System.out.println("Lista vazia");
            return;
        }

        Node atual = inicio;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }


}
