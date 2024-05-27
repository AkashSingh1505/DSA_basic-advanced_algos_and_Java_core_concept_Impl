package Queue;
public class DequeueArray{

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
        static void addFirst(int n){
            if(isFull()){
                System.out.println("over flow");
                return;
            }
            if(rear ==-1){
                rear=front=0;
            }
            if(front==0){
                front=size-1;
            }
            else{
            front=(front-1);}
            arr[front]=n;
            
        }
         static void addLast(int n){
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
        static int removeFirst(){
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
        static int removeLast(){
            if(isEmpty()){
                System.out.println("underflow");
                return -1;
            }
            int result=arr[rear];
            if(front==rear){
                front=-1;
                rear=-1;
            }
           else{
                if(rear==0){
                    rear=size-1;
                }
                else{rear=rear-1;}
                
            }
            return result;
        }
        static int peekFront(){
            if(isEmpty()){
                System.out.println("underflow");
                return -1;
            }
            return arr[(front)];
        }
        static int peekRear(){
            if(isEmpty()){
                System.out.println("underflow");
                return -1;
            }
            return arr[(rear)];
        }
                
    }
    public static void main(String[] args) {
        
         CQueue co=new CQueue(7);
        
        co.addLast(10);
        co.addLast(15);
        co.addLast(16);
        co.addLast(18);
        co.addLast(17);
//        System.out.println(co.arr[0]);
//        System.out.println(co.removeFirst());
        co.addFirst(17);
        co.addFirst(20);
        co.addLast(25);
         
   while (!CQueue.isEmpty()) {
           System.out.println( CQueue.peekFront());
           CQueue.removeFirst();
            
        }

         
    }
    
}
       
        
       
        
    



          

 
