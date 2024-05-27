/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Stack;
import java.util.Stack;

public class S {
    static Stack<Integer> stack;
    static void bottomPush(int data){
        if(stack.isEmpty()){
            stack.push(data);
            return ;}
        int d = stack.pop();
        bottomPush(data);
        stack.push(d);
        return ;
    }

    
    public static void main(String args[]) {
        stack = new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(11);
        bottomPush(4);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
                System.out.println(stack.peek());

    }
}
