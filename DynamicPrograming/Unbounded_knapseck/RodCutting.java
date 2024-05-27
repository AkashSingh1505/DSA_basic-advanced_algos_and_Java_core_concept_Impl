
package DynamicPrograming.Unbounded_knapseck;

import java.util.Arrays;

/*====================================================================================================================================================================================================================================
    Problem:-
              you have a fix length rod ,a length_price array which have price according to road length 
              then find the maximum profit in by cutting the rod(if needed)
  ====================================================================================================================================================================================================================================*/
public class RodCutting {
    public static int solutionTD(int lt[],int p[],int L,int n){
        int tab[][]=new int [n+1][L+1];
        for(int f[]:tab)Arrays.fill(f, 0);
        for(int i=1;i<n+1;i++){
            for(int j=1;j<n+1;j++){
                if(lt[i-1]<=j){
                    tab[i][j]=Math.max(p[i-1]+tab[i][j-lt[i-1]],tab[i-1][j]);
                }
                else{
                    tab[i][j]=tab[i-1][j];
                }
            }
        }
        return tab[n][L];
    }
    
    public static void main(String[] args) {
       int length[]={1,2,3,4,5,6,7,8};
       int price[]={1,5,8,9,10,11,6,3}; //2len+3len.+3len=21max pro
       
       int RodLength=8;
       int n = length.length;
        System.out.println(solutionTD(length,price,RodLength,n));
       
    }
}
