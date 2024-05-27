package DynamicPrograming.Longest_Common_SubSequence.LCSubSequence;

// @author Akash singh

import java.util.Arrays;

public class LCSubSequence_TD {
    public static int tab[][];
    static String str="";
    public static int solveTd(String x,String y ,int n,int m){
        tab= new int[n+1][m+1];
        for(int i[]:tab)Arrays.fill(i,0);

        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){

                if(x.charAt(i-1)==y.charAt(j-1)){
                    tab[i][j]=tab[i-1][j-1]+1;
                }
                else{
                    tab[i][j]=Math.max(tab[i-1][j], tab[i][j-1]);
                }
            }

        }
        return tab[n][m];
    }

    public static void main(String[] args) {
        String x="afgmihn";
        String y="aflmonhg";
        int LCM =solveTd(x,y,x.length(),y.length());//Longest common sub sequence method
        System.out.println(LCM);
        for(int i[]:tab){
            for(int j:i){System.out.print(j+" ");}
            System.out.println();
        }
    }
}
