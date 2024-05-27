
package JAVA;

public class MyThread  {
   static int c=0;
 /*synchronized */static void fun(){
//      System.out.println("i ");
       synchronized(new MyThread()){
           c++;
       }
       return ;  
    }
    public static void main(String[] args) throws Exception{
       Thread t1 = new Thread(new Runnable(){
           public void run(){
               for(int i =0;i<200;i++){
               fun();}
           }
       });
       Thread t2 = new Thread(new Runnable(){
           public void run(){
               for(int i =0;i<200;i++){
               fun();};
           }
       });
       t1.start();
      
       t1.sleep(152);
       t2.start();
       t1.join();
        System.out.println(c);
    }
}
