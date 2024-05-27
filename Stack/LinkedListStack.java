
package Stack;

public class LinkedListStack {
     Node head = null;
     class Node{
        int data;
        Node next;
        Node(int data){
            this.data =data;
            next=null;
        }
    }
    boolean isEmpty(){
        return head==null;
    }
    void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()){
            head = newNode;
            return;
        }
        newNode.next=head;
        head = newNode;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is underFlow");
            return -1;
        }

        int d=head.data;
        head=head.next;
        return d;
    } 
    void peek(){
        if(isEmpty()){
            System.out.println("stack is underfLow");
            return;}
        System.out.println(head.data);
    }
    public static void main(String[] args) {
        LinkedListStack s = new LinkedListStack();
        LinkedListStack s2= new LinkedListStack();
        s.peek();
        s.pop();
        s.push(2);
        s.push(10);
        s.push(7);
        
        s.push(15);
        while(!s.isEmpty()){
            s.peek();
            s.pop();
        }
    }
}
        
    
        
