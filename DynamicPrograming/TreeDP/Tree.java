package DynamicPrograming.TreeDP;

// @author Akash singh

import java.util.concurrent.atomic.AtomicInteger;

public class Tree {
    static int  result;
    static int sum=Integer.MIN_VALUE;
    static int sum1=Integer.MIN_VALUE;
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            left=right=null;
            this.data=data;}
    }
    static int i=-1;
    public static Node BuildTree(int arr[]){
        i++;
        if(arr[i]==-1)return null;
        Node newNode = new Node(arr[i]);
        newNode.left=BuildTree(arr);
        newNode.right=BuildTree(arr);
        return newNode;
    }
   
    public static int height(Node root){
        if(root==null)return 0;
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
        
    }
//    Time complexity O(n^2) bcz we calculate diameter by calculating height for each node
//    first we calculate height by height fun then we cal diam
    public static int diameter(Node root){
        if(root==null)return 0;
        int leftd=diameter(root.left);
        int rightd=diameter(root.right);
        int rd=height(root.left)+height(root.right)+1;
        return Math.max(rd,Math.max(rightd,leftd));
        
    }
    
//    Time complexity is o(n) 
//    Approch: bcz in this we calculate diamerter and height at each lavel parallel first we go at the bootem and get height  by base condition then by l+r+1 we get its diameter and store it by comparing 
//    previous dima which is Integer.min in first case
    
    public static int d(Node root,AtomicInteger rus){
        if(root==null)return 0;
        int l=d(root.left,rus);
        int r=d(root.right,rus);
        int temp=l+r+1;
        result=Integer.max(temp, result);
        rus.set(Integer.max(temp, rus.get()));
        return Integer.max(l, r)+1;
    }
    
    public static int sumanyNode(Node root){
        if(root==null)return 0;
        int l= sumanyNode(root.left);
        int r= sumanyNode(root.right);
        int temp=Math.max(Math.max(l, r)+root.data, root.data);
        int ans=Math.max(l+r+root.data,temp);
        sum=Math.max(sum,ans);
        return temp;
    }
    
     public static int sumleaf2leaf(Node root){
        if(root==null)return 0;
        int l= sumleaf2leaf(root.left);
        int r= sumleaf2leaf(root.right);
        int temp;
         if(root.left==null&&root.right==null){
         temp=root.data;}
         else if(root.left==null){
            temp=r+root.data;
        }
         else if(root.right==null){
            temp=l+root.data;
        }
         else{
             temp=Math.max(l, r)+root.data;
         }
        int ans=Math.max(l+r+root.data,temp);
        sum1=Math.max(sum1,ans);
        return temp;
    }
    
    
    public static void main(String[] args) {
//        int arr[]={11,1,2,4,-1,-1,5,-1,-1,3,-1,6,7,10,8,-1,-1,-1,-1,9,-1,-1,12,-1,13,-1,14,-1,-1};
//        int arr[]={10,20,-15,-1,-1,-1,12,-1,2,-1,-10,-1,5,-1,-1};
        int arr[]={-15,5,-8,2,-1,-1,6,-1,-1,1,-1,-1,6,3,-1,-1,9,-1,0,4,-1,-1,-3,10,-1,-1,-1};
        AtomicInteger rus = new AtomicInteger(Integer.MIN_VALUE);
          Node root=BuildTree(arr);
          System.out.println(height(root));
          System.out.println(diameter(root));
          result=Integer.MIN_VALUE;
          d(root,rus);
          System.out.println(result);
          sumanyNode(root);
                    System.out.println(sum);

          sumleaf2leaf(root);
          System.out.println(sum1);
        
    }
}
