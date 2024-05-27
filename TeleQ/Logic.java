import java.util.*;
import java.lang.Integer.*;
public class Logic {
    static Stack<String> s=new Stack<>();
//    static Stack<String> fs=new Stack<>();
static boolean end;
    static String temp="";
    static int i=-1;
    static String fs="";
    static int num;
    public static void dcode(String str){
        i++;
        String st="";
        if(str.charAt(i)==']'){return;}
        if(Character.isDigit(str.charAt(i))){
            int j =i;
            while(Character.isDigit(str.charAt(j))){
                st+=str.charAt(j)+"";
                j++;
            }
//            num=Integer.parseInt(nums);
            i=j-1;
            
        }
        else{ st =str.charAt(i)+"";}
        dcode(str);
        if(st.compareTo("[")!=0&& !Character.isDigit(st.charAt(0))){
            s.push(st);
            return;
            
        }
        if(st.compareTo("[")==0){
            while(!s.isEmpty()){
                temp+=s.pop();
            }
            return;
        }
        String Stemp="";
        for(int i =0;i<Integer.parseInt(st);i++){
            Stemp+=temp;
        }
        temp="";
        st=Stemp;
        
        System.out.println(st);
        s.push(st);
        if(i!=(str.length()-1)){
        dcode(str);
//        s.push(st);
        }
//        fs.push(st);
//        System.out.println(fs);
//        String t=st;
        fs=st;
//        return;
        
    }
    public static void main(String[] args) {
        String str = "3[a]2[b]";
        dcode(str);
//        while(!fs.isEmpty()){
//            System.out.print(fs.peek());
//            fs.pop();
//        }
        System.out.println(fs);
    }
}
