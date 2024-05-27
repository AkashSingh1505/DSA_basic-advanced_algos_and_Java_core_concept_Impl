
package Queue;

public class LinkedListQueue {
   static Node head=null,tail=null;
   static class Node{
       int data;
       Node next;
       Node(int data){
           this.data=data;
           next=null;
        }
    }
   boolean isEmpty(){
       return head==null;
   }
   void add(int data){
       Node newNode = new Node(data);
       if(isEmpty()){
           head=tail=newNode;
           return;
       }
       tail.next=newNode;
       tail=newNode;
   }
   int remove(){
       if(isEmpty()){
           System.out.println("Q is underflow");
           return -1;
       }
       int data=head.data;
       if(head==tail){
           head=tail=null;
        }
       else{
           head=head.next;
       }
       return data;
   } 
    void peek(){
        if(isEmpty()){
           System.out.println("Q is underflow");
           return ;
       }
        System.out.println(head.data);
    }
    
    public static void main(String[] args) {
        LinkedListQueue Q = new LinkedListQueue();
        Q.peek();
        Q.remove();
        Q.add(10);
        Q.add(15);
        Q.add(45);
        Q.add(20);
        while(!Q.isEmpty()){
            Q.peek();
            Q.remove();
        }
    }
    
   
}
