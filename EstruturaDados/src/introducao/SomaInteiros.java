/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introducao;

/**
 *
 * @author joaochoma
 */
public class SomaInteiros {

  public static int somar(int a, int b) {
    int resultado = a + b;
    return resultado;
  }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1 = 5;
        int numero2 = 3;
        int resultado = somar(numero1, numero2);
        System.out.println("O resultado da soma é: " + resultado);
    }
    
}