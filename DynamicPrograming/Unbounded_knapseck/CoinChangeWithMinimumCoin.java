
package DynamicPrograming.Unbounded_knapseck;

/*====================================================================================================================================================================================================================================
    Problem:-
              find the change of giving note by using minimum number of coins
Ex: we have a note of 5 rs
    and we have a array of coins  [ 1 , 3 , 4, 6]
    we need change  of 5
    so  no of total way for changing with the help of coins are: 1 1 1 1 1=5( by using 5 coins)
                                                                 1 1 3    =5( by using 3 coins)
                                                                 1 4      =5( by usnig 2 coins)  << Minimum
                      
  ====================================================================================================================================================================================================================================*/
public class CoinChangeWithMinimumCoin {
    public static int solutionTD(int coin[],int note,int n){
        int tab[][]=new int[n+1][note+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<note+1;j++){
                if(i==0&&j>=0)tab[i][j]=Integer.MAX_VALUE-1;
                if(i>0&&j==0)tab[i][j]=0;
                if(i==1&j>0){
                    if(j%coin[0]==0)tab[i][j]=j/coin[0];
                    else tab[i][j]=Integer.MAX_VALUE-1;
                }
            }
        }
        for(int i=2;i<n+1;i++){
            for(int j=1;j<note+1;j++){
                if(coin[i-1]<=j){
                    tab[i][j]=Math.min(tab[i][j-coin[i-1]]+1,tab[i-1][j]);
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
