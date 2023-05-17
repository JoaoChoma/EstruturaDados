/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arvoreBinaria;

/**
 *
 * @author joaochoma
 */
public class BinaryTree {
    Node cabeca;

    public BinaryTree() {
        cabeca = null;
    }

    void insert(int data) {
        cabeca = insertRec(cabeca, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    void inorder() {
        inorderRec(cabeca);
    }

    void inorderRec(Node root) {
        if (root != null) {
            //inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
}
