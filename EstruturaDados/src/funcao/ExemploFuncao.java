/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcao;

/**
 *
 * @author joaochoma
 */
public class ExemploFuncao {
    
    public static int dobro(int num) {
        int resultado = num * 2;
        return resultado;
    }

    public static void main(String[] args) {
        int num = 5;
        int resultado = dobro(num);
        System.out.println("O dobro de " + num + " é " + resultado);
    }
}

