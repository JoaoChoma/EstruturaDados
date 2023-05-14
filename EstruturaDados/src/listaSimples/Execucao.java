/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaSimples;

/**
 *
 * @author joaochoma
 */
public class Execucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaSimplismenteEncadeada  lista = new ListaSimplismenteEncadeada();
//        System.out.println(lista.estaVazia());
//        System.out.println(lista.tamanho());
        lista.adicionar(1);
//        System.out.println(lista.estaVazia());
//        System.out.println(lista.tamanho());
        lista.adicionar(2);
//        System.out.println(lista.estaVazia());
//        System.out.println(lista.tamanho());
        lista.imprimir();
        
        
    }
    
}
