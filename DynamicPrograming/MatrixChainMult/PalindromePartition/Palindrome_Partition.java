package DynamicPrograming.MatrixChainMult.PalindromePartition;

// @author Akash singh

import java.util.Arrays;

/*====================================================================================================================================================================================================================================
    Problem:-   
              String = ABACACL
              Problem is to return the number of minimum partition by which every  sub string will be a palindrome
              
              String = ABA|CAC|L return 2
              Maximum partion will be A|B|A|C|A|C|L =6
                      
  ====================================================================================================================================================================================================================================*/
public class Palindrome_Partition {
    static int tab[][];
    public static boolean isPalindrome(String s,int i,int j){
        String ss = s.substring(i, j+1);
        StringBuilder str = new StringBuilder(ss);
        str=str.reverse();
        if(ss.equals(str.toString()))return true;
        return false;
    }
    static int min = Integer.MAX_VALUE;
    public static int solve(String s,int i,int j){
        if(i>=j)return 0;
        if(isPalindrome(s,i,j))return 0;
        if(tab[i][j]!=-1)return tab[i][j];
//        int min = Integer.MAX_VALUE;
        for(int k = i;k<j;k++){
            int temp=1+solve(s,i,k)+solve(s,k+1,j);
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
