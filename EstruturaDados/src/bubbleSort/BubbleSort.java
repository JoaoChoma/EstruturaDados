/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubbleSort;

import java.util.Arrays;

/**
 *
 * @author joaochoma
 */
public class BubbleSort {
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                if (array[j] > array[j + 1]) {
                    // array[j] = 5 > array[j +1] = 3
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // j = (6 - 0 -1) 5
        // j = (6 - 1 -1) 4
        
        int[] array = { 3, 5, 1, 8, 1, 4 };
        System.out.println("Array antes da ordenação: " + Arrays.toString(array));

        bubbleSort(array);

        System.out.println("Array após a ordenação: " + Arrays.toString(array));
    }
}
