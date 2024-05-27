package DynamicPrograming.MatrixChainMult;

// @author Akash singh

import java.util.HashMap;

/*===============================================================================================================
                                               writing a memoziation code with the help of hashmap;
   ================================================================================================================*/
public class Scrambled {
   static HashMap<String,Boolean> map=new HashMap<>();
    public static boolean solve(String a,String b){
        
        if(a.equals(b))return true;
        if(a.length()<=1)return false;
        if(map.containsKey(a+" "+b)){
            return map.get(a+" "+b);
        }
        boolean flag=false;
        int n=a.length();
        for(int i=1;i<n;i++){
            if((solve(a.substring(0, i),b.substring(n-i,n))&&solve(a.substring(i,n),b.substring(0,n-i))) || 
                    (solve(a.substring(0,i),b.substring(0,i))&& solve(a.substring(i,n),b.substring(i,n)))){
                        flag=true;
            }
        }
        map.put(a+" "+b, flag);
        return flag;
    }
    public static void main(String[] args) {
        String a="great";
        String b="ergta";
        boolean rt;
        if(a.length()!=b.length())rt=false;
        else if(a.isEmpty()&&b.isEmpty())rt=true;
        else{
            rt=solve(a,b);
        }
        System.out.println(rt);
        
        
    }
}
