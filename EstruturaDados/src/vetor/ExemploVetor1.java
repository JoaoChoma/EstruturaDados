/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

/**
 *
 * @author joaochoma
 */
public class ExemploVetor1 {
    public static void main(String[] args) {
        // Criando um vetor de inteiros com 5 elementos
        int[] vetor = new int[5];
        
        // Atribuindo valores ao vetor
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        
        // Imprimindo o valor de um elemento do vetor
        System.out.println("O valor do elemento na posição 3 é: " + vetor[2]);
        
        // Percorrendo o vetor e imprimindo seus valores
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("O valor do elemento na posição " + i + " é: " + vetor[i]);
        }
    }
}

