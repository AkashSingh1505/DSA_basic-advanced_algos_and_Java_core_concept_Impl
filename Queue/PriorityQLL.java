
package Queue;

public class PriorityQLL {
    static Node head=null;
    static class Node{
        int data;
        Node next;
        double priority;
        Node(int data,double p){
            this.data = data;
            priority = p;
            next=null;
        }
    }
        boolean isEmpty(){
            return head==null;
        }
        void add(int data,double p){
            Node newNode = new Node(data,p);
            if(isEmpty()){
                head=newNode;
                return;
            }
            if(head.next==null||newNode.priority>head.priority){
                if(newNode.priority<=head.priority){
                    head.next=newNode;
                }
                else{
                    newNode.next=head;
                    head=newNode;
                }
                return;
            }
            Node Slast = head;
            Node last=Slast.next;
            while(newNode.priority<=last.priority){
                Slast=last;
                last =last.next;
                if(last==null){
                    Slast.next=newNode;
                    return;}
            }
            newNode.next=last;
            Slast.next=newNode;
           
        }
                

        int remove(){
             if(isEmpty()){
                 System.out.println("Q is underflow");
                return -1;
            }
            int d = head.data;
            head=head.next;
            return d;
        }
        int peek(){
            if(isEmpty()){
                 System.out.println("Q is underflow");
                return -1;
            }
            return head.data;
        }
    
    public static void main(String[] args) {
        PriorityQLL Q = new PriorityQLL();
        Q.add(4, 1);
        Q.add(5, 2);
        Q.add(6, 3);
        Q.add(10, 2);
        Q.add(100, 3.001);
        
        while(!Q.isEmpty()){
            System.out.println(Q.peek());
            Q.remove();
        }
//        System.out.println(Q.peek());
        
        
    }
    
}
