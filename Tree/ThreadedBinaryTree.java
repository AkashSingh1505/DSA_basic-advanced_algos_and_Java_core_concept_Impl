
package Tree;

public class ThreadedBinaryTree {
    /*===============================================================================================================
                                               Threaded Binary search tree Structure
   ================================================================================================================*/
    static class Node{
        int data;
        int LB;//left bit
        int RB;// right bit
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            left=right=null;
            LB=RB=0;
        }
    }
    
    /*===============================================================================================================
                                               TBT inserting Operation
    Inorder precedure :-right most of left sub tree
    Inorder successot :-left most of right sub tree
   ================================================================================================================*/
    static Node CreateNode(int value){
        return new Node(value);
    }
    static int i=0;
    static Node TBT(Node root,int val){
        i++;
        if(root==null){
            root=new Node(val);
            if(i==1){
                Node head = new Node(999);
                head.right=head;
                head.left=root;
                head.LB=1;
                head.RB=1;
                root.left=root.right=head;
            }
            return root;
        }
        else{
        if(root.data>val){
            if(root.left!=null && root.LB==0){
            Node temp=root.left;
            root.left=CreateNode(val);
            root.left.left=temp;
            root.left.right=root;
            root.LB=1;
            }
            else{TBT(root.left,val);}
        }
        if(root.data<val){
            if(root.right!=null && root.RB==0){
            Node temp=root.right;
            root.right=CreateNode(val);
            root.right.right=temp;
            root.right.left=root;
            root.RB=1;
            }
            else{TBT(root.right,val);}
        }
        
        }
        return root;
    }
       
    static void inorder(Node root){
        if(root.LB==0){
            System.out.print(root.data+" ");
           
            return;
        }
        if(root.RB==0){
           System.out.print(root.data+" ");
        }
        inorder(root.left);
        System.out.print(root.data);
        inorder(root.right);
        
    }


    public static void main(String[] args) {
        int val[]={6,3,8,2,5,10,9};
        Node root=null;
        for(int i=0;i<val.length;i++){
            root=TBT(root,val[i]);
        }
        inorder(root);
//        System.out.println();
//        System.out.println(root.data);
//        System.out.println((inorderPrecessor(root.left)).data);

        
    }
    
}
