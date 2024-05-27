package Stack;
import java.util.*;
public class StackBottemPush {
    public static void pushBottem(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int Top = s.pop();
        pushBottem(data,s);
        s.push(Top);

    }
    
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushBottem(4,s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }        
    }
}
