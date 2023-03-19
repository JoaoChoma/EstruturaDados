/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalRepeticao;

import java.util.Scanner;

/**
 *
 * @author joaochoma
 */
public class ExemploRepeticao {
  public static void main(String[] args) {
      
      Scanner s = new Scanner(System.in);
      
    int limite;
      System.out.println("escreva");
    limite = s.nextInt();
    for (int i = 0; i < limite; i++) {
      System.out.println("Numero: " + i);
    }
  }
}
