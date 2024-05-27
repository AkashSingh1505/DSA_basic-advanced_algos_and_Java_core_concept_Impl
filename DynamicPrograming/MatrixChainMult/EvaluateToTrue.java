package DynamicPrograming.MatrixChainMult;

// @author Akash singh

import java.util.Arrays;

public class EvaluateToTrue {
    static int tab[][][];
//    static int ans=0;
    public static int solve(String s , int i ,int j ,int bool){
        if(i>j)return 0;
        if(i==j){
            if(bool==1){
                return (s.charAt(i)=='T')?1:0 ;
            }
            else{
                return (s.charAt(i)=='F')?1:0;
            }
        }
        int ans=0;
        if(tab[i][j][bool]!=-1)return tab[i][j][bool];
        for(int k = i+1;k<j;k=k+2){
            int lt=solve(s,i,k-1,1);
            int lf=solve(s,i,k-1,0);
            int rt=solve(s,k+1,j,1);
            int rf=solve(s,k+1,j,0);
             
            if(s.charAt(k)=='&'){
                if(bool==1){
                    ans=ans+(lt*rt);
                }
                else{
                    ans=ans+(lf*rt)+(lt*rf)+(lf*rf);
                }
            }
           else if(s.charAt(k)=='|'){
                if(bool==1){
                    ans=ans+(lf*rt)+(lt*rf)+(lt*rt);
                }
                else{
                    ans=ans+(lf*rf);
                }
            }
           else if(s.charAt(k)=='^'){
                if(bool==1){
                    ans=ans+(lf*rt)+(lt*rf);
                }
                else{
                    ans=ans+(lf*rf)+(lt*rt);
                }
            }
        }
        return tab[i][j][bool]= ans;
    }
    public static void main(String[] args) {
//        String s ="T|F&T^F";
//        String s="T|T&F^T"; 
        String str[]={"T|T&F^T","T|F&T^F",
"TF^F&TF^F^F^TT&T^TF^T^F&F^TT^F"};
        System.out.println(str.length);
//        
      
////        System.out.println(solve(s,0,s.length()-1,1));
        for(int i=0;i<2;i++){
            tab=new int[8][8][2];
              for(int k[][]:tab){
            for(int j[]:k)Arrays.fill(j,-1);
        }
            System.out.println(solve(str[i],0,6,1));
        }
    }
}
