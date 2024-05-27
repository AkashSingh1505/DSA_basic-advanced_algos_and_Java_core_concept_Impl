package DynamicPrograming.MatrixChainMult.PalindromePartition;

// @author Akash singh

import java.util.Arrays;

public class PalindromePartOptimize {
        static int tab[][];
    public static boolean isPalindrome(String s,int i,int j){
        String ss = s.substring(i, j+1);
        StringBuilder str = new StringBuilder(ss);
        str=str.reverse();
        if(ss.equals(str.toString()))return true;
        return false;
    }
    public static int solve(String s,int i,int j){
        if(i>=j)return 0;
        if(isPalindrome(s,i,j))return 0;
        int min = Integer.MAX_VALUE;
        int left,right;
        for(int k = i;k<j;k++){
            if(tab[i][k]!=-1){
                 left=tab[i][k];
            }
            else{
                left=solve(s,i,k);
                tab[i][k]=left;
            }
            if(tab[k+1][j]!=-1){
                right=tab[k+1][j];
            }
            else{
                right=solve(s,k+1,j);
                tab[k+1][j]=right;//for further use;6 
            }
            int temp=1+left+right;
            min=Math.min(temp,min);
        }
        return tab[i][j]=min;
    }
    public static void main(String[] args) {
        String s = "nitik";
        tab=new int[s.length()+1][s.length()+1];
        for(int i[]:tab)Arrays.fill(i,-1);
        System.out.println(solve(s,0,s.length()-1));

    }
}
