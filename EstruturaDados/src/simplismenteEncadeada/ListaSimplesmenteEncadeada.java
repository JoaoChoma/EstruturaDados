/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplismenteEncadeada;

/**
 *
 * @author joaochoma
 */
public class ListaSimplesmenteEncadeada {
    private Node inicio;
    private int tamanho;
    
    private class Node {
        int valor;
        Node proximo;
        
        Node(int valor) {
            this.valor = valor;
            this.proximo = null;
        }
    }
    
    public ListaSimplesmenteEncadeada() {
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
            while (atual.proximo != null) { // == !=
                atual = atual.proximo;
            }
            atual.proximo = novoNo;
        }
        tamanho++;
    }
    
}
