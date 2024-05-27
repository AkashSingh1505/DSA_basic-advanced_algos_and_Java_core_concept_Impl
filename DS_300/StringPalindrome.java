
package DS_300;

public class StringPalindrome {
//    
//    public static  boolean isPalindrome(String s) {
//        s.toLowerCase();
//        System.out.println(s);
//        StringBuilder str = new StringBuilder(s);
//        for(int i=0;i<str.length();i++){
//            if(str.charAt(i)>=97 || str.charAt(i)<=122){
//                continue;
//            }
//            else{
//                str.deleteCharAt(i);
//            }
//        }
//        String simple = str.toString();
//        System.out.println(simple);
//        StringBuilder rev = new StringBuilder(simple);
//        rev.reverse();
//        String a=rev.toString();
//        int i=simple.compareTo(a);
//        System.out.print(a);
//        
//        if(i!=-1){
//            return true;
//        }
//        else return false;
//    }
    public static void main(String[] args) {
//        String s="hello ,This is akash";
//        isPalindrome(s);
        String st = "hello213hi";
//        StringBuilder r = new StringBuilder(st);
        for(int i=0;i<st.length();i++){
            if((st.charAt(i)>=97 && st.charAt(i)<=122)){
//                int l=st.charAt(i);
//                System.out.print(l+" ");
//                continue;
            }
            
            else{
//                int l=r.charAt(i);
//                System.out.print(l+" ");
                st.replace(""+st.charAt(i)+"", "");
            }
        }
//        System.out.println(r.charAt(6));
        System.out.println(st);
    }
}

