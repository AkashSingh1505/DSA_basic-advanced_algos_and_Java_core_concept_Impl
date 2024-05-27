
package DynamicPrograming.Knapsack.SubSetSumPro;

import java.util.Arrays;

/*===============================================================================================================
      In this problem we have to find the existence of sumbset that sum is equal to given sum
   ================================================================================================================*/

public class SolutionMemo {
    static boolean tab[][];
    public static boolean solve(int arr[],int n,int sum){
        if(n>=0&&sum==0)return true;
        if(n==0&&sum>0)return false;
        if(tab[n][sum]!=false)return tab[n][sum];
        if(arr[n-1]<=sum){
            return tab[n][sum]=solve(arr,n-1,sum-arr[n-1])||solve(arr,n-1,sum);
        }
        else{
            return solve(arr,n-1,sum);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,7,6};
        int sum = 3;
        int n = arr.length;
        tab = new boolean[n+1][sum+1];
        for(boolean b[]:tab)Arrays.fill(b,false);
        
        
        
        System.out.println(solve(arr,n,sum));
    }
    
}
