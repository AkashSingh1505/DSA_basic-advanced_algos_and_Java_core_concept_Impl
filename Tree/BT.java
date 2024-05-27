// Revision
package Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Akash Singh
 */
public class BT {
    int i =-1;
    static class Node{
        int data;
        Node left,right;
        Node(int data){
            this.data = data;
            left=right=null;
        }
    }
    private Node BTbuilder(int arr[]){
        i++;
        if(arr[i]==-1)return null;
        Node newNode = new Node(arr[i]);
        newNode.left=BTbuilder(arr);
        newNode.right=BTbuilder(arr);
        return newNode;
    }
    private static void preorder(Node root){
       if(root == null)return;
        System.out.print(root.data+",");
        preorder(root.left);
        preorder(root.right);
    }
    private static void inorder(Node root){
        if(root == null)return;
        inorder(root.left);
        System.out.print(root.data+",");
        inorder(root.right);
    }
    private static void postorder(Node root){
        if(root==null)return ;;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+",");
    }
    private static void levelorder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node temp = q.remove();
            if(temp!=null){
                System.out.print(temp.data+" ");
                if(temp.left!=null){
                q.add(temp.left);}
                if(temp.right!=null){
                q.add(temp.right);}
            }
            else{
                System.out.println();
                if(!q.isEmpty()){q.add(null);}
                else break;
            }
            
        }
    }
    private static int count(Node root){
        if(root==null)return 0;
        int l=count(root.left);
        int r =count(root.right);
        return l+r+1;
    }
     private static int sum(Node root){
        if(root==null)return 0;
        int l=sum(root.left);
        int r =sum(root.right);
        return l+r+root.data;
    }
     private static int height(Node root){
         if(root==null)return 0;
         int l = height(root.left);
         int r = height(root.right);
         return Math.max(l, r)+1;
     }
     private static int diameter(Node root){
         if(root==null)return 0;
         int l = diameter(root.left);
         int r = diameter(root.right);
         int throughRootD=height(root.left)+height(root.right)+1;
         return Math.max(throughRootD, Math.max(l, r));
     }
     class TP{
         int hight;
         int diameter;
         TP(int d,int h){
             this.diameter=d;
             this.hight=h;
         }
     }
     private TP prop(Node root){
         if(root == null)return new TP(0,0);
         TP left = prop(root.left);
         TP right = prop(root.right);
         int height = Math.max(left.hight, right.hight)+1;
         int diam = Math.max(Math.max(left.diameter, right.diameter),left.hight+right.hight+1);
         return new TP(diam,height);
     }
     private static boolean isClone(Node root,Node sub){
         if(root==null && sub==null)return true;
         if(root==null || sub==null)return false;
         if(root.data == sub.data){
             return isClone(root.left,sub.left)&& isClone(root.right, sub.right);
         }
         return false;
     }
     private static boolean isSubtree(Node root,Node sub){
         if(sub==null)return true;
         if(root==null)return false;
         if(root.data==sub.data){
             if(isClone(root,sub))return true;
             return false;
         }
         return isSubtree(root.left,sub) || isSubtree(root.right,sub);
     }
     
     private static Node getMirrorImage(Node root){
         if(root == null){
             return null;
         }
        
         Node leftMirroedSubTree = getMirrorImage(root.left);
         Node rightMirroedSubTree = getMirrorImage(root.right);
         root.left=rightMirroedSubTree;
         root.right=leftMirroedSubTree;
         return root;
     }
    

    
    public static void main(String args[]) {
        int arr[]={5,4,3,2,-1,-1,6,-1,-1,7,-1,-1,10,11,12,-1,-1,13,-1,-1,14,-1,-1};
        int sub[]={4,3,2,-1,-1,6,-1,-1,7,-1,8,-1,-1};
        Node root=new BT().BTbuilder(arr);
//        Node subR=new BT().BTbuilder(sub);
//        preorder(root);
//        System.out.println();
        inorder(root);
        System.out.println();
        inorder(getMirrorImage(root));
//        System.out.println();
//        postorder(root);
//        System.out.println();
//        levelorder(root);
//        System.out.println("\n number of nodes are : "+count(root));
//        System.out.println("\n sum of nodes is : "+sum(root));
//        System.out.println("\n heaigh of Tree is : "+height(root));
//        System.out.println("\n diameter of Tree is : "+diameter(root));
//        BT o = new BT();
//        TP t=o.prop(root);
//        System.out.println("Diameter with n complexity : "+t.diameter);
//        
//        System.out.println("\n Subtree Tree is : "+isSubtree(root, subR));
        
        
        
        
    }
}
