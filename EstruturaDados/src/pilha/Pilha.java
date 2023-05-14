/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilha;

/**
 *
 * @author joaochoma
 */
public class Pilha {
    private int tamanhoMax;
    private int[] dados;
    private int topo;

    public Pilha(int tamanhoMax) {
        this.tamanhoMax = tamanhoMax;
        dados = new int[tamanhoMax];
        topo = -1;
    }

    public boolean isVazia() {
        return topo == -1;
    }

    public boolean isCheia() {
        return topo == tamanhoMax - 1;
    }

    public void push(int valor) {
        if (isCheia()) {
            System.out.println("A pilha está cheia!");
            return;
        }
        topo++;
        dados[topo] = valor;
    }
    
    public int pop() {
        if (isVazia()) {
            System.out.println("A pilha está vazia!");
            return -1;
        }
        int valor = dados[topo];
        topo--;
        return valor;
    }

}
