/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenacao;

/**
 *
 * @author joaochoma
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    


    public static void selectionSort(int[] vetor) {
        int tamanhoVetor = vetor.length;
        // 0, 1, 2, 3, 4, 5
        for (int atual = 0; atual < tamanhoVetor - 1; atual++) {
            int ordenado = atual; // guardar a posicao onde esta o menor elemento
            
            // Encontra o índice do menor elemento no restante do array
            for (int proximo = atual + 1; proximo < tamanhoVetor; proximo++) {
                if (vetor[proximo] < vetor[ordenado]) {
                    ordenado = proximo;
                }
            }
            
            // Troca o elemento atual com o menor elemento encontrado
            int temp = vetor[ordenado];
            vetor[ordenado] = vetor[atual];
            vetor[atual] = temp;
        }
    }
    
    public static void main(String[] args) {
        int[] vetor = {64, 25, 12, 22, 11};
        
        System.out.println("Array antes da ordenação:");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        
        selectionSort(vetor);
        
        System.out.println("\nArray após a ordenação:");
        for (int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\n");
        // https://www.youtube.com/watch?v=0-W8OEwLebQ
    }
}


// Random gerador = new Random();
//gerador.nextInt();
