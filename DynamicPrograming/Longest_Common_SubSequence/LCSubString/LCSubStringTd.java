 package DynamicPrograming.Longest_Common_SubSequence.LCSubString;

// @author Akash singh

import java.util.Arrays;

public class LCSubStringTd {
    static int max=0;
    public static int solveTd(String x,String y,int n,int m){
        int tab[][]=new int[n+1][m+1];
        for(int i[]:tab)Arrays.fill(i,0);
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                System.out.print(tab[i-1][j-1]+" ");
                if(x.charAt(i-1)==y.charAt(j-1)){
                    tab[i][j]=tab[i-1][j-1]+1;
                    max=Math.max(max,tab[i][j]);
                }
                else{
                    tab[i][j]=0;
                }
            }
            System.out.println();
        }
        return max;
    }
    public static void main(String[] args) {
        String x="afgmopkhn";
        String y="aflmopknhg";
        int LCM =solveTd(x,y,x.length(),y.length());//Longest common sub sequence method
        System.out.println(LCM);
        
    }
}
