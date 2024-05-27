
package Stack;

public class ArrayStack {
   static int arr[];
     static int Top;
    int size;
    ArrayStack(int size){
        this.size=size;
        arr=new int[size];
        Top=-1;
    }
    boolean isEmpty(){
        return Top==-1;
    }
    boolean isFull(){
        return Top==size-1;
    }
    void push(int data){
        if(isFull()){
            System.out.println("stack is overflow");
            return;
        }
        arr[++Top]=data;
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is underFlow");
            return;
        }
        
        Top--;
       
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is underFlow");
            return -1;
        }
        int p = arr[Top];
        return p;
    }
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.isFull();
        stack.isEmpty();
        stack.pop();
        stack.peek();
        stack.push(2);
        stack.push(10);
        stack.push(15);
        stack.pop();
        stack.push(50);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
        
        
    }
}        
    

