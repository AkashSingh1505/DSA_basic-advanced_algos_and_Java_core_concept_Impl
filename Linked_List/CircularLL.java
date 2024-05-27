package Linked_List;
public class CircularLL {
    static Node head=null;
    static Node tail=null;
    static int length=0;

     class Node{
        int data;
        Node next=null;
        Node(int data){
            this.data=data;
        }
     }
        void addFirst(int data){
            Node newNo = new Node(data);
            if(head==null && tail ==null){
            head = tail= newNo;}
            else{
                newNo.next=head;
                head=newNo;
                tail.next=head;
            }
            length++;
        }
        void insert(int data,int index){
            if(index==0){
                addFirst(data);
                return;
            }
            Node newNo = new Node(data);
            if(head==null && index==0){
                head = newNo;
            }
            
//              
                
            if(head==null && index != 0){
                System.out.println("List is empty");
                
            }
            else{
                   Node curNode = head;
                   Node temp=null;
                   for(int i=0;i<index-1;i++){
                       curNode=curNode.next;
                   }
                   temp=curNode.next;
                   curNode.next = newNo;
                   newNo.next = temp;
            length++;
            }
        }
        void addLast(int data){
            Node newNo = new Node(data);
           if(head==null && tail ==null){
            head = tail= newNo;}
            else{
               tail.next=newNo;
               tail=newNo;
               tail.next=head;
            }
           length++;
        }
        void removeFirst(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            if(head==tail){
                head=tail=null;
                length--;
                return;
            }
            head=head.next;
            tail.next=head;
            length--;
        }
        void remove(int index){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            if(index==0){
                removeFirst();
                return;
            }
            if(index==length-1){
            removeLast();}
            else{
                Node secondLast=head;
                Node last=secondLast.next;
                
                for(int i=0;i<index-1;i++){
                     secondLast=last;
                    last=last.next;
                }
                secondLast.next=last.next;
                
//                tail=secondLast;
//            if(secondLast.next==head){
//            tail=secondLast;}
               length--; 
            }
        }
        void removeLast(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            if(head==tail){
                head=tail=null;
                length--;
                return;
            }
            Node curNode = head;
            while((curNode.next)!=tail){
                curNode=curNode.next;
                
            }
            
            tail=curNode;
            tail.next=head;
            length--;
        }
        void print(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            Node curNode=head;
            do{
//                
                System.out.print(curNode.data+"->");
                curNode=curNode.next;
            
            }while(curNode!=head);
//            System.out.print(tail.data+"->");
            System.out.println("NULL");
        }
        
   
    public static void main(String args[]) {
        CircularLL llist = new CircularLL();
//        llist.addFirst(10);
//       llist.addFirst(15);
//       llist.addFirst(12);
//       
//       llist.addLast(32);
//       llist.addLast(39);
//       llist.addLast(40);
       llist.removeFirst();

       llist.print();
       llist.remove(0);
//              llist.remove(6);

       llist.print();
       llist.insert(40, 4);
       llist.print();
        System.out.println(length);
////      
////        System.out.println();
//       llist.print();

    }
}
