package BinaryTree;

import java.util.Scanner;

public class BinaryTreeUse {
    public static TreeNode<Integer> TakeInput(Scanner s){
        int rootData;
        System.out.println("Enter the root Data");
        rootData=s.nextInt();
        if(rootData==-1){
            return null;
        }
        TreeNode<Integer> root=new TreeNode<Integer>(rootData);
        root.left=TakeInput(s);
        root.right=TakeInput(s);
        return root;

    }
    public static void printTree(TreeNode<Integer> root){
        if(root ==null){
            return;
        }
        String ToBePrinted=root.data+"";
        if(root.left!=null){
            ToBePrinted+="L:"+root.left.data;
        }
        if(root.right !=null){
            ToBePrinted+="R:"+root.right.data;

        }
        System.out.println(ToBePrinted);
        printTree(root.left);
        printTree((root.right));
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        TreeNode<Integer> root=TakeInput(s);
        printTree(root);
        // TreeNode<Integer> root=new TreeNode<Integer>(10);
        // TreeNode<Integer> node1=new TreeNode<Integer>(10);
        // TreeNode<Integer> node2=new TreeNode<Integer>(10);
        // TreeNode<Integer> node3=new TreeNode<Integer>(10);
        // root.left=node1;
        // root.right=node2;
        // node1.right=node3;


    }
}
