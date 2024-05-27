package DynamicPrograming.MatrixChainMult;
import java.util.Arrays;
// @author Akash singh

/*====================================================================================================================================================================================================================================
    Problem:-
              2*3, 3*4,4*5  
              so we need to cal culate minimum cost of multipication
  ====================================================================================================================================================================================================================================*/
public class MCM {
    static int tab[][];
    
            static int min=Integer.MAX_VALUE;

    public static int solve(int arr[],int i,int j){
        if(i>=j)return 0;
        if(tab[i][j]!=-1)return tab[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int temp=solve(arr,i ,k)+solve(arr,k+1,j)+arr[i-1]*arr[k]*arr[j];
            min=Math.min(temp,min);
        }
        return tab[i][j]=min;
    }  
    public static void main(String[] args) {
        int arr[]={40,20,30,20};
        tab = new int[5][5];
        for(int i[]:tab)Arrays.fill(i,-1);
        System.out.println(solve(arr,1,arr.length-1));

    }
}
