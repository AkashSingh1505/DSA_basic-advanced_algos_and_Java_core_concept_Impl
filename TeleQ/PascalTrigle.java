
package TeleQ;

//@author Akash singh
public class PascalTrigle {
    static int z;
    static int fact(int n){
        if(n==1|| n==0)return 1;
        else{
            z=n*fact(n-1);
            return z;
        }
    }
    static  int ncr(int n,int r){
        return fact(n)/(fact(n-r)*fact(r));
    }
    static void pascal(int l){
        for(int i=1;i<=l;i++){
            for(int k=l-i;k!=0;k--){
                System.out.print(" ");
            }
            for(int j =0;j<i;j++){
                System.out.print(ncr(i-1, j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N=1;
        pascal(N);
    
    }
}
