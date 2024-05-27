package DynamicPrograming.Longest_Common_SubSequence.LCSubSequence;


import java.util.Arrays;


public class LCSubSequence_Memo {
    static int tab[][];
    public static int solve(String x,String y,int n,int m){
        if(n==0||m==0)return 0;
        if(tab[n][m]!=-1)return tab[n][m];
        if(x.charAt(n-1)==y.charAt(m-1))return tab[n][m]= 1+solve(x,y,n-1,m-1);
        else{
            return tab[n][m]=Math.max(solve(x,y,n-1,m),solve(x,y,n,m-1));
        }
        
    }
    public static void main(String[] args) {
        String x="afgmihn";
        String y="aflmonhg";
        tab=new int[x.length()+1][y.length()+1];
        for(int i[]:tab)Arrays.fill(i,-1);
        int LCM =solve(x,y,x.length(),y.length());//Longest common sub sequence method
        System.out.println(LCM);
    }
}
