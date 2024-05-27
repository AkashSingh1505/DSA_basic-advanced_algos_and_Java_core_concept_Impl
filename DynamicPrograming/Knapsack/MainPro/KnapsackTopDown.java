
package DynamicPrograming.Knapsack.MainPro;

import java.util.Arrays;

public class KnapsackTopDown {
   static int knapsack(int val[],int wt[],int w,int n){
        //construct a table and initialize it with zeros(java default variable is zero but (static and instance variable not local var)
        int tab[][] = new int[n+1][w+1];
        for(int a[]:tab)Arrays.fill(a, 0);
        
        for(int i=1;i<n+1;i++){
            for(int j=1;j<w+1;j++){
                
                if(wt[i-1]<=j){
                    tab[i][j]=Math.max(val[i-1]+tab[i-1][j-wt[i-1]],tab[i-1][j]);
                }
                else{
                    tab[i][j]=tab[i-1][j];
                }
         
            }
        }
        return tab[n][w];
    }
    public static void main(String[] args) {
        int value[]={4,10,6,2,7,3,1};
        int weight[]={6,4,4,6,2,4,1};
        int w=12;
        int n = value.length;
        System.out.println(knapsack(value,weight,w,n));
    }
}
