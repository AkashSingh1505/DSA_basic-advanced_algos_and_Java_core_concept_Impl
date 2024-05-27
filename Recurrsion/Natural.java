package Recurrsion;
public class Natural{
    static int sum(int n){
        int total=0;
        if(n==0){
            return total;
        }
        total = n+sum(n-1);
        return total;
    }
    public static void main(String[] args) {
       System.out.println("total is :"+ sum(10));
    }
}