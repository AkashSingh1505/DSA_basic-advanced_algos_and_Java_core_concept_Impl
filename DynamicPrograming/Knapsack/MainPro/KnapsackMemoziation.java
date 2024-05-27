
package DynamicPrograming.Knapsack.MainPro;

import java.util.Arrays;


public class KnapsackMemoziation {
    static int[][] tab;
    static int knapsack(int val[],int wt[],int n,int w){
        if(n==0||w==0)return 0;
        if(tab[n][w]!=-1)return tab[n][w];
        if(wt[n-1]<=w){
            return tab[n][w]=Math.max(val[n-1]+knapsack(val,wt,n-1,w-wt[n-1]), knapsack(val,wt,n-1,w));
        }
        else{
            return knapsack(val,wt,n-1,w);
        }
    }
    public static void main(String[] args) {
        int value[]={4,10,6,2,7,3,1};
        int weight[]={6,4,4,6,2,4,1};
        int w=12;
        int n = value.length;
        tab = new int[n+1][w+1];
        for(int a[]:tab)Arrays.fill(a,-1);//initialize the table with '-1'
        System.out.println(knapsack(value,weight,n,w));

        
  
    }
}
