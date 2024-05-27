/*                        1
                        
                   2           3
                        
               4       5           10
                        
                    6       7
                        
                          8   9
 */  
package Tree;

import java.util.LinkedList;
import java.util.Queue;

public  class Tree {
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
                                                Tree Building
   ================================================================================================================*/
    
     class BinaryTree{
         int i=-1;
        Node buildTree(int arr[]){
            i++;
            if(arr[i]==-1){
                return null;
            }
            Node newNode= new Node(arr[i]);
            newNode.left=buildTree(arr);
            newNode.right=buildTree(arr);
            return newNode;
        }
    }
    
     
    /*===============================================================================================================
                                               Traversing(preorder,Inorder,postorder,levelorder)
   ================================================================================================================*/
    
//    Time complexity:- O(n);
    static void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    //    Time complexity:- O(n);
    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
        
    }

    //    Time complexity:- O(n);
    static void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    
    //    Time complexity:- O(n);
    static void levelorder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curNode =q.remove();
            if(curNode==null){
                System.out.println("");
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                System.out.print(curNode.data+" ");
                if(curNode.left!=null){
                    q.add(curNode.left);
                } 
                if(curNode.right!=null){
                    q.add(curNode.right);
                }
            }
        }
    }
    
        
  
    /*===============================================================================================================
                                               Tree Operation(count,sum,height)
   ================================================================================================================*/
//    Time complexity  O(n)
    static int count = 0;
    static int countOfNodes(Node root){
        if(root==null){
            return 0;
        }
       int leftNode= countOfNodes(root.left);
       int rightNode=countOfNodes(root.right);
        return leftNode+rightNode+1;
    }
    
//      static int sum=0;  
//    static int sumOfNodes(Node root){
//        if(root==null){
//            return 0;
//        }
//        sum+=root.data;
//        sumOfNodes(root.left);
//        sumOfNodes(root.right);
//        return sum;
//        
//    }
    
//    TimeComplexity O(n);
    static int sumOfNodes(Node root){
        if(root==null){
            return 0;
        }
     int leftsum=sumOfNodes(root.left);

     int rightsum=sumOfNodes(root.right);
     return leftsum+rightsum+root.data;
     }
    
    static int heightofnodes(Node root){
        if(root==null){
            return 0;
        }
        int leftheight=heightofnodes(root.left);
        int rightheight=heightofnodes(root.right);
        
        return Math.max(leftheight,rightheight)+1;
        
    }
   
      
    /*===============================================================================================================
                           Tree Diameter :-diameter of tree is the longest path between 2 nodes in tree
                                         :-we have 2 approch to get it.(n,n^2)
   ================================================================================================================*/
    
    //Approch 1 for diameter  O(n^2)
    static int diameter1(Node root){
        /* time comlexity for this approch is O(n^2);*/
        if(root==null){
            return 0;
        }
        int diamL=diameter1(root.left);
        int diamR=diameter1(root.right);
        int diamAlongRoot=heightofnodes(root.left)+heightofnodes(root.right)+1;
        
        return Math.max(diamAlongRoot,Math.max(diamR, diamR));
    }

//       Approch 2 for diameter  O(n)
    
   static class TreeInfo{
        int height;
        int diam;
        TreeInfo(int height,int diam){
            this.height=height;
            this.diam=diam;
        }
    }
    static TreeInfo diameter2(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo Left=diameter2(root.left);
        TreeInfo Right = diameter2(root.right);
        
        int myheight=Math.max(Left.height, Right.height)+1;
        
         int diamL=Left.diam;
        int diamR=Right.diam;
        int diamAlongRoot=Left.height+ Right.height+1;
        
        int mydiam=Math.max(diamAlongRoot,Math.max(diamR, diamR));
        
        TreeInfo myInfo=new TreeInfo(myheight,mydiam);
        return  myInfo;
        
    }
    
    
    /*===============================================================================================================
           Microsoft Q.1                    Sub Tree Of Another Tree(boolean)
   ================================================================================================================*/
    
    static boolean isIdentical(Node root,Node subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root==null|| subRoot==null){
            return false;
        }
        if(root.data==subRoot.data){
            return isIdentical(root.left,subRoot.left)&& isIdentical(root.right,subRoot.right);
        }
        else{
            return false;
        }
    }
    static boolean isSubTree(Node root,Node subRoot){
        if(subRoot==null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.data==subRoot.data){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);
    }
   
    
    /*===============================================================================================================
                                               Q.2  sum of nodes at nth level  
   ================================================================================================================*/
    static int sum=0;
    static int j=1;
    static int sumAtlevel(Node root,int n){
        if(root==null){
            return 0;
        }
        Queue<Node> Q = new LinkedList<>();
        Q.add(root);
        Q.add(null);
        if(n==j){
            return root.data;
        }
        while((!Q.isEmpty())&&n>=j){
            Node curNode=Q.remove();
            if(curNode==null){
                if(Q.isEmpty()){
                    break;
                }
                else Q.add(null);
                j++;
            }
            else{
                if(j==n){
                    sum+=curNode.data;
                }
                if(curNode.left!=null)Q.add(curNode.left);
                if(curNode.right!=null)Q.add(curNode.right);
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        int arr1[] = {1, 2, 4, -1, -1, 5, 6, -1, -1, 7, 8, -1, -1, 9, -1, -1, 3, -1, 10, -1, -1};
        
        int arr2[]={7,8,-1,-1,9,-1,-1};
        
        Tree copy1=new Tree();
        Tree copy2=new Tree();
        Tree copy3=new Tree();

        BinaryTree T1 = copy1.new BinaryTree();
        BinaryTree T2 = copy2.new BinaryTree();
        BinaryTree T3 = copy2.new BinaryTree();


        Node root=T1.buildTree(arr);
        Node root1=T2.buildTree(arr1);
        Node root2=T3.buildTree(arr2);
        
        System.out.println(sumAtlevel(root1, 5));
        
        System.out.println(isSubTree(root1, root2));

        System.out.println(root2.data);
        preorder(root);
        System.out.println("");
        inorder(root); 
        System.out.println("");
        postorder(root);
        System.out.println("");
        levelorder(root);
//        System.out.println("");
//        System.out.println(countOfNodes(root));
//        System.out.println(sumOfNodes(root));
//        System.out.println(heightofnodes(root));
//        System.out.println(diameter2(root).diam+" and "+diameter2(root).height);
        
 

    }
    
}
