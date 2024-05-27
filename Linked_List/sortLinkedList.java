package Linked_List;

public class sortLinkedList {
    static Node head=null;
    static  int size=0;
    class Node{
        int data;
        Node next=null;
        Node(int data){
            this.data=data;
        }
     }
        void add(int data){
            Node newNo = new Node(data);
            size++;
            if(head==null){
            head = newNo;}
            else{
                newNo.next=head;
                head=newNo;
            }
        }
        void insert(int data,int index){
            Node newNo = new Node(data);
            size++;
            if(head==null && index==1){
                head = newNo;
//              
                
            }
            if(head==null && index != 1){
                System.out.println("List is empty");
                
            }
            
            else{
                   Node curNode = head;
                   Node temp=null;
                   for(int i=0;i<index-2;i++){
                       curNode=curNode.next;
                   }
                   temp=curNode.next;
                   curNode.next = newNo;
                   newNo.next = temp;
            }
        }
        
        Node removeFirst(){
            if(head==null){
                System.out.println("List is Empty");
                return null;
            }
            Node temp=head;
            head=head.next;
            size--;
            return temp;
        }
        Node remove(int index){
            if(head==null){
                System.out.println("List is Empty");
                return null;
            }
            if(index==1){
                size--;
                return removeFirst();
                
            }
            if(size+1<index){
                return removeFirst();
            }
            else{
                Node secondLast=head;
                Node last=secondLast.next;
                for(int i=1;i<index-1;i++){
                    
                    secondLast=secondLast.next;
                    last=last.next;
                }
                Node del=last;
                secondLast.next=last.next;
                size--;
                return del;
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
        int peekAt(int index){
            if(head==null){
                System.out.println("List is Empty");
                return -1;
            }
            Node curNode=head;
            int i=1;
            while(i<index){
//                System.out.print(curNode.data+"->");
                i++;
                curNode=curNode.next;
            }
            return curNode.data;
        }
       static  void ListSort(sortLinkedList list){
            int n=size;
            for(int i=1;i<=n-1;i++){
                for(int j =1;j<=n-1-(i-1);j++){
                    if(list.peekAt(j)>list.peekAt(j+1)){
                        Node temp = list.remove(j);
                        list.insert(temp.data,j+1);
                     }
                }
            }
           
        }   
        
    

    public static void main(String args[]) {
        
       sortLinkedList list = new sortLinkedList();
       list.add(10);
       list.add(15);
       list.add(12);
       list.add(18);
       list.print();
       sortLinkedList.ListSort(list);
       list.print();
       
    }
}
      
     
               
             

   


    

