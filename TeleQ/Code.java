
package TeleQ;

public class Code {
    static int i=-1;
    static String decode(String str){
       i++;
       String st="";
     
       if(i==str.length()||str.charAt(i)==']' ){return "";}//this is the base cond of recur.
       if(Character.isDigit(str.charAt(i))){
            int j =i;
            while(Character.isDigit(str.charAt(j))){
                st+=str.charAt(j)+"";
                j++;
            }
            i=j-1;
        }
        else{ st =str.charAt(i)+"";}
       String rts=decode(str);//rts mean return string by fun
       if(st.compareTo("[")!=0&& !Character.isDigit(st.charAt(0))){
            st+=rts;
            return st;
        }
        if(st.compareTo("[")==0){
            return rts;
        }
       
        if(Character.isDigit(st.charAt(0))){
            int num = Integer.parseInt(st);
            String temp="";
            while(num-->0){
                temp+=(rts);
            }
            st=temp;
        }
            if(i==str.length()-1){
                return st;
            }
            else{
              return st+decode(str);
            }
    }
    public static void main(String[] args) {
        String str ="3[a2[cb]]n";
        System.out.println(decode(str));
    }
}
