
package Tree;
//not completed

public class AVL {
    static class Node{
        int data;
        int BF;
        Node left,right;
        Node(int data){
            this.data=data;
            left=right=null;
        }
    }
    static Node bstBuilder(Node root,int key){
        if(root==null)return new Node(key);
        if(key<root.data){
            root.left=bstBuilder(root.left, key);
            bFactor(root);
        }
        if(key>root.data){
            root.right=bstBuilder(root.right, key);
            bFactor(root);
        }
        return root;
    }
    static boolean isUnbalance(Node root){
        if(root==null)return false;
        boolean l = isUnbalance(root.left);
        boolean r = isUnbalance(root.right);
        return l||r||!(root.BF>=-1 && root.BF<=1);
    }
    
    static void bFactor(Node root){
        int l = height(root.left);
        int r = height(root.right);
        root.BF=l-r;
    }
    static int height(Node root){
       if(root==null)return 0;
       int l=height(root.left);
       int r =height(root.right);
       return Math.max(l, r)+1;
    }
    
    public static void main(String args[]) {
        int arr[]={7,8,4,5,2,6,3,9};
        Node root = null;
        for(int i:arr){
            root=bstBuilder(root, i);
        }
    }
}
