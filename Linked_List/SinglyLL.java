package Linked_List;
public class SinglyLL {
    static Node head=null;
    class Node{
        int data;
        Node next=null;
        Node(int data){
            this.data=data;
        }
     }
        void addFirst(int data){
            Node newNo = new Node(data);
            if(head==null){
            head = newNo;}
            else{
                newNo.next=head;
                head=newNo;
            }
        }
        void insert(int data,int index){
            Node newNo = new Node(data);
            if(head==null && index==0){
                head = newNo;
//              
                
            }
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
            }
        }
        void addLast(int data){
            Node newNo = new Node(data);
            if(head==null){
            head = newNo;}
            else{
               Node curNode =head;
               while(curNode.next!=null){
                   curNode=curNode.next;
               }
               curNode.next=newNo;
            }
        }
        void removeFirst(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            head=head.next;
            
        }
        void remove(int index){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            else{
                Node secondLast=head;
                Node last=secondLast.next;
                for(int i=0;i<index-1;i++){
                    secondLast=secondLast.next;
                    last=last.next;
                }
                secondLast.next=last.next;
            }
        }
        void removeLast(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            Node curNode = head;
            if(head.next==null){
                head=null;
                return;
            }
            while((curNode.next).next!=null){
                curNode=curNode.next;
            }
        }
        void print(){
            if(head==null){
                System.out.println("List is Empty");
                return;
            }
            Node curNode=head;
            while(curNode!=null){
                System.out.print(curNode.data+"->");
                curNode=curNode.next;
            }
            System.out.println("NULL");
        }
        ///recurcive code..
        Node reverse(Node temp){
            if(temp.next==null){
                head=temp;
                return temp;
            }
           Node prAdd= reverse(temp.next);
            prAdd.next=temp;
            return temp;
        }

    public static void main(String args[]) {
        
       SinglyLL list = new SinglyLL();
             

       list.addFirst(10);
       list.addFirst(15);
       list.addFirst(12);
       list.addFirst(18);
       list.addLast(30);
       list.addLast(35);
       list.addLast(32);
       list.addLast(39);
       list.addLast(40);
       list.removeFirst();

       list.print();
       list.remove(2);
       list.print();
       list.remove(6);
       list.print();
       list.insert(40, 0);
       list.print();
       Node p=list.reverse(head);
       p.next=null;
        System.out.println("reversed :"+p.data);
       list.print();

    }
}
