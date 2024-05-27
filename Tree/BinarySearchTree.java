
package Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 *
 * @author Akash Singh
 */
public class BinarySearchTree {
    static class Node {
        int data;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    private static Node bstBuilder(Node root,int data){
        if(root==null)return new Node(data);
        if(root.data>data){
            root.left=bstBuilder(root.left, data);
        }
        if(root.data<data){
            root.right=bstBuilder(root.right, data);
        }
        return root;
    }
    private static void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.data+",");
        inorder(root.right);
    }
    private static boolean isPresent(Node root,int key){
        if(root==null)return false;
        if(root.data>key){
            return isPresent(root.left, key);
        }
        if(root.data==key)return true;
        if(root.data<key){
            return isPresent(root.right, key);
        }
        return false;
    }
    private static Node inorderSuccessor(Node root){
        if(root.left==null)return root;
        return inorderSuccessor(root.left);
    }
    private static Node delete(Node root,int key){
        if(root==null)return null;
        if(key<root.data){
            root.left=delete(root.left,key);
        }
        if(key>root.data){
            root.right=delete(root.right,key);
        }
        if(key==root.data){
            if(root.left==null && root.right==null){
                return null;
            }
            if(root.left==null)return root.right;
            if(root.right==null)return root.left;
            if(root.left!=null &&root.right!=null){
                Node temp = inorderSuccessor(root.right);
                int val = temp.data;
                delete(root,val);
                root.data=val;
            }
        }
        return root;
    }
    //print in range
    private static void printInRange(Node root,int lb,int ub){
        if(root==null)return;
        if(root.data>=lb && root.data<=ub){
            System.out.print(root.data+",");
            printInRange(root.left, lb, ub);
            printInRange(root.right, lb, ub);
        }
        if(root.data>ub){
            printInRange(root.left, lb, ub);
        }
        if(root.data<lb){
            printInRange(root.right, lb, ub);
        }
    }
    
    // All Path print from root to leaf 
    static ArrayList<Integer> list = new ArrayList<>();
    private static void print(Node root){
        if(root == null)return;
        list.add(root.data);
        print(root.left);
        print(root.right);
        if(root.left==null && root.right==null){
            System.out.println(list);
        }
        System.out.println();
        list.remove(list.size()-1);
    }
    static Stack<Integer> s = new Stack<>();
    private static void PPrint(Node root){
        if(root==null)return;
        s.push(root.data);
        PPrint(root.left);
        PPrint(root.right);
        if(root.left==null&&root.right==null){
            printStack(s);
        }
        System.out.println();
        s.pop();
    }
    static void printStack(Stack s){
        if(s.isEmpty())return;
        int n = (int)s.pop();
        printStack(s);
        System.out.print(n+",");
        s.push(n);
    }
    public static void main(String args[]) {
        int arr[]={7,8,4,5,2,6,3,9};
        Node root = null;
        for(int i:arr){
            root=bstBuilder(root, i);
        }
//        inorder(root);
//        System.out.println(isPresent(root,10));
//        delete(root, 4);
//        inorder(root);
        System.out.println();
//        printInRange(root, 4, 6);
//        print(root);
        PPrint(root);
    }
}
