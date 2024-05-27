
package Graph;

public class AdjacencyMultiL {
    static boolean arr[]= new boolean[5];
    static void fun(){
        arr[2]=true;
    }
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println(i);
            if(i==3)break;
            System.out.println("i am "+i);
        }
    }
}


