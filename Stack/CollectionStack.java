
package Stack;

import java.util.ArrayList;
import java.util.LinkedList;


public class CollectionStack {
    
/*    =========Stack implementation by LinkedList framework========== */
    
    
    
//    LinkedList LL= new LinkedList();
//    boolean isEmpty(){
//        return LL.isEmpty();
//    }
//    void push(Object data){
//        LL.addFirst(data);
//    }
//    
//     Object pop(){
//        
//        return (Object) LL.removeFirst();
//    }
//    void peek(){
//        System.out.println(LL.peek());
//    }
    
    
    
    
    /*=============Stack implementaion by ArrayList framework============*/
    
    
    
    
    ArrayList<Integer> AA = new ArrayList<>();
    boolean isEmpty(){
        return AA.size()==0;
    }
    void push(int data){
        AA.add(data);
    }
    int pop(){
         if(isEmpty()){
           System.out.println("Stack is under Flow");
           return -1;}
        int d=AA.get(AA.size()-1);
        AA.remove(AA.size()-1);
        return d;
    }
   void peek(){
       if(isEmpty()){
           System.out.println("Stack is under Flow");
           return;}
       System.out.println(AA.get(AA.size()-1));
        
    }  
   
   
   //=====================================================================
   
   
   public static void main(String[] args) {
        CollectionStack s = new CollectionStack();
        

        s.push(2);
        s.push(10);
//        s.push("i am enter");
        s.push(15);
        
       
        s.push(50);
//        s.push("akash");
        while(!s.isEmpty()){
            s.peek();
            s.pop();
        }
    }
} 
    
    
    
    
    
    
    
    
   
    
    

