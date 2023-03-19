/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionalRepeticao;

/**
 *
 * @author joaochoma
 */
public class ExemploCondicao {
  public static void main(String[] args) {
    int idade = 18;
    if (idade > 18) {
      System.out.println("Você é maior de idade.");
    } else if (idade == 18) {
      System.out.println("Você tem 18.");
    } else {
        System.out.println("Você é menor de idade.");
    }
    
    int ano = 2000;
    switch(ano){
        case 1000:
            System.out.println("Muito velho");
            break;
            
        case 2000:
            System.out.println("Milenais");
            break;
            
        default:
            System.out.println("Fim");
           
    }
         
    
  }
}

