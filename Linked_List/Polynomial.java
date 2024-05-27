
package Linked_List;

public class Polynomial {
     static class PEquation{
         Node head=null,tail=null;
        static class Node{
            int coefficient;
            int exponent;
             Node next;
            char ch;
            Node(int c,char ch,int e){
            coefficient=c;
            exponent=e;
          
            this.ch=ch;
            next=null;
            }
        }
         boolean isEmpty(){
            return head==null;
        }
        void e(int c,char ch,int e){
            Node newNode = new Node(c,ch,e);
            if(head==null){
                head=tail=newNode;
                return;
            }
            tail.next=newNode;
            tail=newNode;
        }
         void print(){
            if(isEmpty()){
                System.out.println("Equation is not found");
                return;
            }
            Node temp=head;
        
            while(temp!=null){
            System.out.printf("%+d%c^%d",temp.coefficient,temp.ch,temp.exponent);
            temp=temp.next;
            }
        System.out.println();
        }
         void remove(Node t1){
             Node temp=head;
             if(head==t1){
                 head=head.next;
                 return;
             }
             
             while(temp.next!=t1){
                 temp=temp.next;
             }
             temp=t1.next;
         }

    }
    static class Operation{
        void add(PEquation p1,PEquation p2,PEquation result){
         Polynomial.PEquation.Node temp1 = p1.head;
            Polynomial.PEquation.Node temp2 =p2.head;
            while(!(temp2==null)){
                while(!(temp1==null)){
                    if(temp1.ch==temp2.ch && temp1.exponent==temp2.exponent){
                    result.e(temp1.coefficient+temp2.coefficient, temp1.ch, temp1.exponent);
                    p1.remove(temp1);
                    p2.remove(temp2);
                     temp1 = p1.head;
                     temp2 = p2.head;
                    }
                    else{ 
                    temp1=temp1.next;}
                }
                result.e(temp2.coefficient, temp2.ch, temp2.exponent);
                temp2=temp2.next;
                 
            }
           Polynomial.PEquation.Node temp=result.head;
           while(temp!=null){
               temp=temp.next;
           }
           temp=p1.head;
            
        }   
    }        
    public static void main(String[] args) {
        PEquation p1 = new PEquation();
        p1.e(2, 'x', 2);
        p1.e(3, 'x', 3);
//         p1.e(5, 'x', 0);
        

        PEquation p2 = new PEquation();
        p2.e(2, 'x', 3);
        p2.e(4, 'x', 2); 
//        p2.e(7, 'x', 3);

        
            
    
       
//        
        PEquation result = new PEquation();
        Operation op = new Operation();
        op.add(p1,p2,result);
        
        p1.print();
        p2.print();
        result.print();

        
        
       

        
//        p.e(2, 'x', 2);
//        p.e(3,'x',4);
    }
}
