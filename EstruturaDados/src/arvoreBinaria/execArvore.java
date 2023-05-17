/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arvoreBinaria;

/**
 *
 * @author joaochoma
 */
public class execArvore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
//        tree.insert(70);
//        tree.insert(60);
//        tree.insert(80);

        tree.inorder();
    }
    
}
