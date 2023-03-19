/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introducao;

import java.util.Scanner;

/**
 *
 * @author joaochoma
 */
public class SomarDoisNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro valor: ");
        int valor1 = scanner.nextInt();
        
        System.out.print("Digite o segundo valor: ");
        int valor2 = scanner.nextInt();
        
        int resultado = valor1 + valor2;
        System.out.println("A soma é: " + resultado);
    }
    
}
