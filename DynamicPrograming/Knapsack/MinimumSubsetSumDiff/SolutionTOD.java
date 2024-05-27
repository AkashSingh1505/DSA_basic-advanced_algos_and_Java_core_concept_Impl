
package DynamicPrograming.Knapsack.MinimumSubsetSumDiff;
import DynamicPrograming.Knapsack.SubSetSumPro.SolutionTD;
import java.util.*;

/*===============================================================================================================
    Pro. find the minimimus subset sum difference in an array
    
    range-2s=minimum
   ================================================================================================================*/
public class SolutionTOD {
    public static int currentsolve(int arr[],int n,int range){
        List<Integer> l = new ArrayList<>();
        SolutionTD.solve(arr, n, range );
        for(int i=0;i<=range/2;i++){
            if(SolutionTD.tab[n][i]==true)l.add(i);
        }
        return range-2*Collections.max(l);
    }
    public static void main(String[] args) {
        int arr[]={1,6,11};
        int n = arr.length;
        int range=0;
        for(int k: arr)range+=k;
        System.out.println(currentsolve(arr,n,range));
        
        

        
        
    }
}
