package DynamicPrograming.MatrixChainMult;

// @author Akash singh

import java.util.Arrays;

public class EggDrop {
    static int tab[][];
    public static int solve(int e ,int f){
        if(e==1||f==1||f==0){
            return f;
        }
//        if(tab[e][f]!=-1)return tab[e][f];
        int min=Integer.MAX_VALUE;
        for(int k=1;k<=f;k++){
            int Break,NBreak;
            if(tab[e-1][k-1]!=-1){
                Break=tab[e-1][k-1];
            }
            else{
                Break=solve(e-1,k-1);
                tab[e-1][k-1]=Break;
            }
            if(tab[e][f-k]!=-1){
                NBreak=tab[e][f-k];
            }
            else{
                NBreak=solve(e,f-k);
                tab[e][f-k]=NBreak;
            }
            int temp=1+Math.max(Break,NBreak);
            min=Math.min(temp,min);
        }
        return tab[e][f]= min; 
    }
    public static void main(String[] args) {
        int egg=3;
        int floor=4;
         tab=new int[egg+1][floor+1];
        for(int i[]: tab)Arrays.fill(i,-1);
         System.out.println(solve(egg,floor));
         
    }
}
