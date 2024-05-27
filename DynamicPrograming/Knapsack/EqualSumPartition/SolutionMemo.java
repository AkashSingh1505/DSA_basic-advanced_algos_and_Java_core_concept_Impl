
package DynamicPrograming.Knapsack.EqualSumPartition;
import java.util.Arrays;

/*===============================================================================================================
  pro> find that the array can be devid into 2 qual sum  parts
   ================================================================================================================*/
public class SolutionMemo {
    static boolean tab[][];
    static boolean solve(int arr[],int sum,int n){
        if(n>=0&&sum==0)return true;
        if(n==0&&sum>0)return false;
        if(tab[n][sum]!=false)return tab[n][sum];
        if(arr[n-1]<=sum){
            return tab[n][sum]=solve(arr,sum-arr[n-1],n-1)||solve(arr,sum,n-1);
        }  
        else{
            return solve(arr,sum,n-1);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,5,2,3,15};
        int n =arr.length;
        int sum=0;
        for(int a:arr)sum+=a;
        tab=new boolean[n+1][(sum/2)+1];
        for(boolean k[]:tab)Arrays.fill(k,false);
        if(sum%2!=0)System.out.println(false);
        else System.out.println(solve(arr,sum/2,n));
    }
}
