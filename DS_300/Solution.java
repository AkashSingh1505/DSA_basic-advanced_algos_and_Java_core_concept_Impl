
import java.util.HashMap;
import java.util.Stack;

public class Solution {
        public static Stack<Character> st = new Stack<>();
    public static void solve(char[] ch,HashMap<Character,Integer> map,HashMap<Character,Boolean> vist){
        for(int i =0;i<ch.length;i++){
            char c=ch[i];
            if(!vist.get(c)){
                if(st.isEmpty()){
                    st.push(c);
                    vist.put(c,true);
                    continue;
                }
                if(c<st.peek()){ 
                    System.out.println("hi");
                    while(!st.isEmpty() && c<st.peek() && map.get(st.peek())>1){
                        char tp=st.pop();
                        vist.put(tp,false);
                        map.put(tp,map.get(tp)-1);
                    }
                    st.push(c);
                            System.out.println(st.peek());
                    vist.put(c,true);
                }
                else{
                    st.push(c);
                    vist.put(c,true);
                    
                }
            }
        }
    }
    public static String removeDuplicateLetters(String s) {
        char ch[] = s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }
               else{
                   map.put(ch[i],1);
               }
        } 
        HashMap<Character,Boolean> vist = new HashMap<>();
        for(int i=0;i<ch.length;i++){
            if(vist.containsKey(ch[i])){
              
            }
               else{
                   vist.put(ch[i],false);
               }
        } 
        solve(ch,map,vist);
        
          String r ="";
        while(!st.isEmpty()){
            r=st.pop()+r;}
        return r;
        
    }
    public static void main(String[] args) {
        String str ="bcabc";
        System.out.println(removeDuplicateLetters(str));
       
    }
}