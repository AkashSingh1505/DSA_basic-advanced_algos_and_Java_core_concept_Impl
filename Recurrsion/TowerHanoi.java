package Recurrsion;
// recursion is slower then loops because its overhead the fucntion call then the function Execution.
public class TowerHanoi{
//    private static int count;
public static int count=0;
    static void Hanoi(int n,String src,String aux,String dest){
        // public int count=0;
        if(n==1){
            System.out.println(src+"->"+dest);
            count++;
            return;
        }
        Hanoi(n-1,src,dest,aux);
        System.out.println(src+"->"+dest);
        Hanoi(n-1,aux,src,dest);        
        count++;
    }
    public static void main(String[] args) {
        int n=3;
        TowerHanoi.Hanoi(n,"S","A","D");
        System.out.println(TowerHanoi.count);
    }
}