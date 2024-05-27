
package Queue;

import java.util.Stack;

/* A Queue is also implemented by 2 stack ;
   we can use 2 stack further 2 ways :-
   1. push() time comlexity is O(n) & pop(),peek() O(1)    <-- more efficient then 2nd way
   2. push() O(1) & pop(),peek() O(n)
*/

public class $2stackQ {
   static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    
  /*========================================================================================== 
    1. push() time comlexity is O(n) & pop(),peek() O(1)    <-- more efficient then 2nd way
    ==========================================================================================*/
    static class QStack1{
        boolean isEmpty(){
            return s1.isEmpty();
        }
        void add(int data){
            while(!s1.isEmpty()){
                int n = s1.pop();
                s2.push(n);
            }
            s1.push(data);
            while(!s2.isEmpty()){
                int n = s2.pop();
                s1.push(n);
            }
         }
        int remove(){
            return s1.pop();
        }
        int peek(){
            return s1.peek();
        }
    } 
    
     /*========================================================================================== 
    2. push() O(1) & pop(),peek() O(n)
    ==========================================================================================*/
    
    static class QStack2{
        boolean isEmpty(){
            return s1.isEmpty();
        }
        void add(int data){
            s1.push(data);
        }
        int remove(){
            while(!s1.isEmpty()){
                int d = s1.pop();
                s2.push(d);
            }
            int n=s2.pop();
            while(!s2.isEmpty()){
                int d = s2.pop();
                s1.push(d);
            }
            return n;
        }
        int peek(){
           while(!s1.isEmpty()){
                int d = s1.pop();
                s2.push(d);
            }
           int n= s2.peek();
           while(!s2.isEmpty()){
                int d = s2.pop();
                s1.push(d);
            }
           return n;
        }
    }
        
    public static void main(String[] args) {
        QStack1 Q1 = new QStack1();
         QStack2 Q2 = new QStack2();
         Q1.add(10);
        Q1.add(15);
        Q1.add(45);
        Q1.add(20);
        Q1.remove();
        Q1.add(25);
        while(!Q1.isEmpty()){
            System.out.println(Q1.peek());
            Q1.remove();
        }
        
        Q2.add(10);
        Q2.add(15);
        Q2.add(45);
        Q2.add(20);
        Q2.remove();
        Q2.add(25);
        while(!Q2.isEmpty()){
            System.out.println(Q2.peek());
            Q2.remove();
        }
    }
    
    
}
