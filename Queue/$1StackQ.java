
package Queue;

import static Stack.StackBottemPush.pushBottem;
import java.util.Stack;

public class $1StackQ {
    Stack<Integer> s = new Stack<>();
//     $1StackQ o= new $1StackQ();
    boolean isEmpty(){
        return s.isEmpty();
    }
    void push(int data){
        pushBottem(data,s);
    }
    int pop(){
        return s.pop();
    }
    int peek(){
        return s.peek();
    }
    
    public static void main(String[] args) {
        $1StackQ o= new $1StackQ();
        o.push(2);
        o.push(10);
        o.push(20);
        while(!o.isEmpty()){
            System.out.println(o.peek());
        }
    }
}
