package Linked_List;
class DoublySLL{
    static Node head=null;
    static int len=0;
    class Node{
        int data;
        Node next,previous;
        Node(int data){
            this.data=data;
            next=previous=null;
        }
    }
    void addFirst(int data){
        Node newnode = new Node(data);
        if(head==null){
             head=newnode;  
        }
        else{
            head.previous=newnode;
            newnode.next=head;
            head=newnode;
        }
        len++;
    }
    void addLast(int data){
        Node newnode = new Node(data);
        if(head==null){
             head=newnode;  
        }
        else{
            Node curNode = head;
            while(curNode.next!=null){
                curNode=curNode.next;
            }
            curNode.next=newnode;
            newnode.previous=curNode;
        }
        len++;
    }
    void insert(int data,int index){
        
        Node newnode = new Node(data);
        if(index>len){
            System.out.println("List is too short");
            return;
        }
        else  if(index==0){
            addFirst(data);
        }
        else if(index==len){
            addLast(data);
//            return;
        }
       else if(head==null){
             head=newnode; 
             len++;
             
        }
        else{
            Node curNode=head;
            for(int i=1;i<index;i++){
                curNode=curNode.next;
            }
            curNode.next.previous=newnode;
            newnode.next=curNode.next;
            newnode.previous=curNode;
            curNode.next=newnode;
            len++;
        }
    }
    void removeFirst(){
        if(head==null){
            System.out.println("List have no node");
            return;
        }
        if(head.next==null){
            head=null;
        }
        else{
            head.next.previous=null;
            head=head.next;
        }
        len--;
    }
    void remove(int index){
        if(index>len){
            System.out.println("List is too short");
            return;
        }
       else if(index==0){
            removeFirst();
        }
       else if(index==len){
            removeLast();
        }
       else if(head==null){
             System.out.println("no node avilable");
             len--;
             
        }
        else{
            Node curNode=head;
            for(int i=1;i<index;i++){
                curNode=curNode.next;
            }
            curNode.next=curNode.next.next;
            curNode.next.previous=curNode;
            
            len--;
        }
    }
    void removeLast(){
           if(head==null){
            System.out.println("List have no node");
        }
        else{
            Node curNode = head;
            while(curNode.next!=null){
                curNode=curNode.next;
            }
            curNode.previous.next=null;
            
        }
        len--;
    }
    void print(){
        if(head==null){
            System.out.println("List have no node");
        }
        else{
            Node curNode=head;
            while(curNode!=null){
                System.out.print(curNode.data+"->");
                curNode=curNode.next;
            }
            System.out.println("NUll");
        }
    }
    
    
    public static void main(String[] args) {
        DoublySLL list = new DoublySLL();
        list.print();
//        list.removeFirst();
//        list. removeLast();
//        list.remove(0);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(5);
        list.addLast(15);
        list.addLast(25);
        list.addLast(20);
        list.print();
        System.out.println(len);
//        list.insert(30, 6);
//        list.insert(1,0);
//        list.print();
//        list.insert(50,3);
//
//        list.print();
//        list.insert(100, 9);
        list.print();
System.out.println(len);
    }
}