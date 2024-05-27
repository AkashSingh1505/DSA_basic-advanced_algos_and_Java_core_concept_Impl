package DynamicPrograming.Longest_Common_SubSequence.LCSubSequence;
// @author Akash singh
public class LCSSequencePrint {
    public static void print(String x,String y,int n,int m){
        LCSubSequence_TD.solveTd(x,y,n,m);
        int tab[][]=LCSubSequence_TD.tab;
        int i=n,j=m;
        String str="";
        while(i!=0&&j!=0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                str=x.charAt(i-1)+str;
                i--;
                j--;
            }
            else{
                if(tab[i-1][j]>tab[i][j-1]){
                    str=x.charAt(i-1)+str;
                    i--;
                }
                else{
                    str=y.charAt(j-1)+str;
                    j--;
                }
            }
        }
        while(i>0){
            str=x.charAt(i-1)+str;
            i--;
        }
        while(j>0){
            str=y.charAt(j-1)+str;
            j--;
        }
        System.out.println(str);
    }
    public static void main(String[] args) {
        String x="abcdaf";
        String y="";
        print(x,y,x.length(),y.length());
    }
}
