
package Stack;

import java.util.Stack;

public class ReverceStack {
    public static void pushBottem(int data,Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int Top = s.pop();
        pushBottem(data,s);
        s.push(Top);

    }
    static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int Top = s.pop();
        reverse(s);
        pushBottem(Top,s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        int arr[]={1,2,3,4};
        for(int i = 0;i<arr.length;i++){
            s.push(arr[i]);}
        
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }  
    }
    
}
