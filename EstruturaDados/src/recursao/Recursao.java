/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package recursao;

/**
 *
 * @author joaochoma
 */
public class Recursao {
    
    
    public int fatorial(int n) {
    // Caso base: fatorial de 0 ou 1 é 1
            if (n == 0 || n == 1) {
                return 1;
            }
    
    // Chamada recursiva: fatorial de n é n * fatorial(n - 1)
            return n * fatorial(n - 1);
    }

}
