/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaEncadeada;

/**
 *
 * @author joaochoma
 * @param <T>
 */
public class ListaEncadeada<T> {
    private NoLista<T> inicio;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public boolean estaVazia() {
        return this.inicio == null;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public void adicionarNoInicio(T valor) {
        NoLista<T> novoNo = new NoLista<>(valor);
        novoNo.setProximo(this.inicio);
        this.inicio = novoNo;
        this.tamanho++;
    }

    public void adicionarNoFinal(T valor) {
        NoLista<T> novoNo = new NoLista<>(valor);

        if (this.estaVazia()) {
            this.inicio = novoNo;
        } else {
            NoLista<T> noAtual = this.inicio;
            while (noAtual.getProximo() != null) {
                noAtual = noAtual.getProximo();
            }
            noAtual.setProximo(novoNo);
        }
        this.tamanho++;
    }

    public void removerNoInicio() {
        if (this.estaVazia()) {
            throw new NoSuchElementException("Lista vazia");
        }
        this.inicio = this.inicio.getProximo();
        this.tamanho--;
    }

    public void removerNoFinal() {
        if (this.estaVazia()) {
            throw new NoSuchElementException("Lista vazia");
        }

        if (this.inicio.getProximo() == null) {
            this.inicio = null;
        } else {
            NoLista<T> noAtual = this.inicio;
            while (noAtual.getProximo().getProximo() != null) {
                noAtual = noAtual.getProximo();
            }
            noAtual.setProximo(null);
        }
        this.tamanho--;
    }

    public void imprimirLista() {
        if (this.estaVazia()) {
            System.out.println("Lista vazia");
            return;
        }

        NoLista<T> noAtual = this.inicio;
        while (noAtual != null) {
            System.out.print(noAtual.getValor() + " ");
            noAtual = noAtual.getProximo();
        }
        System.out.println();
    }
}