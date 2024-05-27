package Queue;
public class ArrayQueue {

    // Queue using array
    class Queue{
       
        static int arr[];
        static int size;
        static int rear;
        static int front;
        
        Queue(int size){
            this.size = size;
            arr = new int[size];
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static boolean isFull(){
            return rear == size-1;
        }
        public static void add(int data){
            if(isFull()){
                System.out.println("overFlow");
                return;
            }
            arr[++rear]=data;
        }
        static int del(){
            if(isEmpty()){
                System.out.println("QUeue is underFlow");
                return -1;
            }
           
            int front=arr[0];
            for(int i=0;i<rear;i++){
                    arr[i]=arr[i+1];
            }
            rear--;
            
            return front;
           
            
        }
        static int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
            }
            else{
                    front=arr[0];
            }
            return front;
        }
        
    }

    // circulart Queue using array
                // we used circular queue because in this time complexity for add,remove,peek is bid-O(1) so its fast
                // where  normal queue add method have O(1)and remove,peek method have O(n) time complexity;

    static class CQueue{
        static int rear;
        static int front;
        static int arr[];
        static int size;

        CQueue(int size){
            this.size=size;
            arr = new int[size];
            rear=-1;
            front=-1;
        }
        static boolean isEmpty(){
            return rear==-1 ;
        }
        static boolean isFull(){
            return (rear+1)%size==front;
        }
        static void add(int n){
            if(isFull()){
                System.out.println("over flow");
                return;
            }
            if(front ==-1){
                front=0;
            }
            rear=(rear+1)%size;
            arr[rear]=n;
        }
        static int remove(){
            if(isEmpty()){
                System.out.println("underflow");
                return -1;
            }
            int result=arr[front];
            if(front==rear){
                front=-1;
                rear=-1;
            }
           else{ front=(front+1)%size;}
            return result;
        }
        static int peek(){
            if(isEmpty()){
                System.out.println("underflow");
                return -1;
            }
            return arr[(front)];
        }
                
    }
    public static void main(String[] args) {
        ArrayQueue ob = new ArrayQueue();
       ArrayQueue.Queue obj =ob.new Queue(4);
        //   System.out.println(obj.isFull());
        //   obj.add(10);
        //   obj.add(11);
        //   obj.add(12);
        //   obj.add(13);
        // // //   System.out.println(obj.isFull());
        // //   System.out.println(obj.del());
        // // //   System.out.println(obj.peek());
        // // System.out.println(obj.arr[0]);
        // while (!Queue.isEmpty()) {
        //     System.out.println( Queue.peek());
        //     Queue.del();
             
        //  }

        CQueue co=new CQueue(4);
        
        co.add(10);
        co.add(15);
        co.add(16);
        co.add(18);
        co.add(17);
        System.out.println(co.arr[0]);
        System.out.println(co.remove());
        co.add(17);
        // System.out.println(co.peek());
        while (!CQueue.isEmpty()) {
           System.out.println( CQueue.peek());
           CQueue.remove();
            
        }
        
    



          

 
        
    }
    
}
