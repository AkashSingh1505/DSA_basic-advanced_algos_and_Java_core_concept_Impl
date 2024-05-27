
package DynamicPrograming.Unbounded_knapseck;

import java.util.Arrays;

/*====================================================================================================================================================================================================================================
    Problem:-
              you have a note(8 rupees note)and you have to give the total no of max way (chutta krne ke trike kitte hai)
              you have changecoin Array: jisse chutta kroge;
                      
  ====================================================================================================================================================================================================================================*/
public class CoinChangeMaxWay {
    public static int solutionTD(int coin[],int note,int n){
        int tab[][]=new int[n+1][note+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<note+1;j++){
                if(i>=0&&j==0)tab[i][j]=1
                        ;
                if(i==0&&j>0)tab[i][j]=0;
            }
        }
        for(int i =1;i<n+1;i++){
            for(int j=1;j<note+1;j++){
                if(coin[i-1]<=j){
                    tab[i][j]=tab[i][j-coin[i-1]]+tab[i-1][j];
                }
                else{
                    tab[i][j]=tab[i-1][j];
                }
            }
        }
        return tab[n][note];
    }
    public static void main(String[] args) {
        int coin[]={1,3,4,6};
        int note=5;
        int n=coin.length;
        System.out.println(solutionTD(coin,note,n));
    }
}
