/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaSimples;

/**
 *
 * @author joaochoma
 */
public class DuplamenteEncadeada {
    Node cabeca;
    int tamanho;
    
    public DuplamenteEncadeada() {
        this.cabeca = null;
        this.tamanho = 0;
    }
    
    public void adicionar(int data) {
        Node novoNode = new Node(data);
        
        if (cabeca == null) {
            cabeca = novoNode;
        } else {
            Node corrente = cabeca;
            while (corrente.next != null) {
                corrente = corrente.next;
            }
            corrente.next = novoNode;
            novoNode.prev = corrente;
        }
        tamanho++;
    }

    public void remover(int data) {
        if (cabeca == null) {
            return;
        }
        
        if (cabeca.data == data) {
            cabeca = cabeca.next;
            cabeca.prev = null;
            tamanho--;
            return;
            
            
        }
    }
    
}
