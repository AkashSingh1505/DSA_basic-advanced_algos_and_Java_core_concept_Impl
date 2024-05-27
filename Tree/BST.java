
package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class BST {
    /*===============================================================================================================
                                               BST Structure
    height of binary try min = log(n) and maximum n
   ================================================================================================================*/
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null; 
        }
    }
    /*===============================================================================================================
                                               BST builder method
   ================================================================================================================*/
//    Time Complexity O(height) or is some cases O(log(n))
    static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
        }
        if(root.data>val){
            root.left=insert(root.left,val);
        }
        else if(root.data<val){
            root.right=insert(root.right,val);
            
        }
        return root;
    }
    /*===============================================================================================================
                                               Inorder BST traversing which always will be sorted
   ================================================================================================================*/
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    /*===============================================================================================================
                                               Searching in BST
   ================================================================================================================*/
    
    static boolean isPresent(Node root,int key){
        if(root==null){
            return false;
        }
        else if(root.data>key){
            return isPresent(root.left,key);
        }
        else if(root.data==key){
            return true;
        }
        else{
            return isPresent(root.right,key);
        }
    }
        
        /*===============================================================================================================
                                               Delete Node in BSTC
   ================================================================================================================*/
   /*     Three case to delete node
       case 1. leaf Node (its not have any child)
       case 2. single child Node 
       case 3. Two children 
                          Replace value with inorder Successor(left most in right subtree) */
   
    static Node delete(Node root,int key){
        if(root==null){
            return null;
        }
        if(root.data<key){
            root.right=delete(root.right,key);
        }
        if(root.data>key){
            root.left=delete(root.left,key);
        }
        if(root.data==key){
            
//            case 1
            if(root.left==null && root.right==null){
                return null;
            }
            
//            case 2
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
            
            //case 3
            System.out.println("i am");
            if(root.left!=null &&root.right!=null){
                Node temp=inorderSuccessor(root.right);
                System.out.println("successot of 4 is : "+temp.data);
                delete(root,temp.data);
                root.data=temp.data;
            }
        }
        return root;
    }
    
        static Node inorderSuccessor(Node root){
            if(root.left==null){
            return root;
        }
            return inorderSuccessor(root.left);
             
        }
        
        /*===============================================================================================================
                                               Print in Range
   ================================================================================================================*/
        
        static void printInRange(Node root,int lb,int up){    //lb=lowerbound
            if(root==null){
                return ;
            }
            if(root.data>=lb && root.data<=up){
                printInRange(root.left,lb,up);
                System.out.print(root.data+" ");
                printInRange(root.right,lb,up);
            }
             if(root.data<lb){
                printInRange(root.right,lb,up);
            }
             if(root.data>up){
                printInRange(root.left,lb,up);
            }
        }
        
        /*===============================================================================================================
                                              All Path priting code
                                              Path from root node to leaf Node 
                                               using ArrayList data structure
           ================================================================================================================*/
        static ArrayList<Integer> l = new ArrayList<>();
        static void root2leaf(Node root){
            
            if(root==null){
                return;
            }
            l.add(root.data);
            root2leaf(root.left);
            root2leaf(root.right);
            if(root.left==null && root.right==null){
                for(int i=0;i<l.size();i++){
                    System.out.print(l.get(i)+" ");
                }
                System.out.println();
            }
            l.remove(l.size()-1);
         }  
     /*===============================================================================================================
                                               All paths from root to leaf usnig Stack data Structure by akash
   ================================================================================================================*/   
        static Stack<Integer> s = new Stack<>();
        static void Path(Node root){
            if(root==null){
                return;
            }
            s.push(root.data);
            Path(root.left);
            Path(root.right);
            if(root.left==null&& root.right==null){
                printStack(s);
                System.out.println();
            }
                s.pop();
        }
        
        static  void printStack(Stack<Integer> s){
            if(s.isEmpty()){
                return;
            }
            int d=s.pop();
            printStack(s);
            System.out.print(d+" ");
            s.push(d);
        }

            
        
        
        public static void main(String[] args) {
//            int value[]={5,1,3,4,2,7};
            int value[]={7,8,4,5,2,6,3,9};
//            int value[]={8,5,3,1,4,6,10,11,14};
            Node root=null;
            for(int i=0;i<value.length;i++){
                root=insert(root,value[i]);
            }
            inorder(root);
            delete(root,4);
            inorder(root);
//            System.out.println();
////            printInRange(root,4,6);
////            System.out.println();
//            root2leaf(root);
////            System.out.println();
////            Path(root);
//            
            
                    
                    
        }
}
