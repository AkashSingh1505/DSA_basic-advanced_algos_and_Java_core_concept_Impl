
package DynamicPrograming.Knapsack.CountOfSubsetSum;

/*===============================================================================================================
      In this problem we have to find the count of sumset that sum is equal to given sum
   ================================================================================================================*/
public class SolutionTD {
    public static int solve(int arr[],int n,int sum){
        int tab[][]=new int[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i>=0&&j==0)tab[i][j]=1;
                if(i==0&&j>0)tab[i][j]=0;
            }
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    tab[i][j]=tab[i-1][j-arr[i-1]] + tab[i-1][j];
                }
                else{
                    tab[i][j]=tab[i-1][j];
                }
            }
                
        }
            return tab[n][sum];
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,3};
        int sum = 6;
        int n = arr.length;
        System.out.println(solve(arr,n,sum));
    }
}
