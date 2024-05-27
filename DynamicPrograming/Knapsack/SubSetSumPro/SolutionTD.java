
package DynamicPrograming.Knapsack.SubSetSumPro;

/*===============================================================================================================
      In this problem we have to find the existence of sumbset that sum is equal to given sum
   ================================================================================================================*/
public class SolutionTD {
    public static boolean tab[][];
    public static boolean solve(int arr[],int n,int sum){
         tab=new boolean[n+1][sum+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                if(i>=0&&j==0)tab[i][j]=true;
                if(i==0&&j>0)tab[i][j]=false;
            }
        }
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                if(arr[i-1]<=j){
                    tab[i][j]=tab[i-1][j-arr[i-1]] || tab[i-1][j];
                }
                else{
                    tab[i][j]=tab[i-1][j];
                }
            }
                
        }
            return tab[n][sum];
    }
    public static void main(String[] args) {
        int arr[]={1,5,4,7,6};
        int sum = 12;
        int n = arr.length;
        System.out.println(solve(arr,n,sum));
    }
}
