
import static java.lang.Character.getNumericValue;
import java.util.ArrayList;
import java.util.Stack;


public class ASTR {
    static int i=-1;
    static Stack sc=new Stack();
      static ArrayList<Integer> sn= new ArrayList<>();
    public static void astr(String str){
        i++;
        
        if(str.charAt(i)==']'){
            return;
        }
        char c=str.charAt(i);
         if(c>=48 && c<=57){

            sn.add(getNumericValue(c));
           
        }

        astr(str);
        if(c>=97 && c<=122){

            sc.push(c);
            return;
        }
        
        if(c=='['){
            int num=0;
            String st ="";
//            int num =getNumericValue(c);
           for(int i=0;i<sn.size();i++){
               num+=sn.get(i)*(Math.pow(10, (sn.size()-1)-i));
           }
           sn.clear();
//            System.out.println(num);
            while(!sc.isEmpty()){
               st=st.concat(sc.pop()+"");
            }
            for(int i =0;i<num;i++){
            System.out.print(st);}
            if(i<str.length()-1){
            astr(str);}
        }
        
        return;
    }
    public static void main(String[] args) {

        String str ="2[abc]3[cd]ef";
        astr(str);
//        System.out.println(sn);
    }
}
