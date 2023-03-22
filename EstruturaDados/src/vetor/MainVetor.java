/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vetor;

/**
 *
 * @author joaochoma
 */
public class MainVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] qualquerCoisa = new int[10];
        
        //qualquerCoisa[0] = 1;
        //qualquerCoisa[1] = 2;
        //qualquerCoisa[2] = 3;
        //qualquerCoisa[3] = 4;
        //qualquerCoisa[4] = 5;
        
        //prencher
        for(int i = 0; i < qualquerCoisa.length; i++){
            qualquerCoisa[i] = 10*i;
        }
        
        System.out.println("Em ordem");
        //imprimir em ordem
        for(int i=0; i < qualquerCoisa.length; i++){
            System.out.println("Valor da posição" + i + " é " + qualquerCoisa[i]);
        }
        
        System.out.println("Ordem inversa");
        //imprimir na ordem inversa
        for(int i=qualquerCoisa.length-1; i > 0; i--){
            
            System.out.println("Valor da posição" + i + " é " + qualquerCoisa[i]);
        }
        
        
        
    }
    
}
