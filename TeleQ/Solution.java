
package TeleQ;

import java.util.Stack;

public class Solution {
    public String decodeString(String s) 
    {
        String cha;  // To Store Characters inside bracket
        String num;  // To store how many times we have to repeat that character
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==']')
            {
                cha="";     // Every Time Initialize empty string
                num="";
                while(st.peek()!='[')
                    cha=st.pop()+cha;  // Storing the Characters
                
                
                st.pop();
                
                while(!st.isEmpty() && Character.isDigit(st.peek()))
                    num=st.pop()+num;  // Storing the digit before 
                
                int t=Integer.parseInt(num);  // convert char digit to int
                while(t-->0)
                {
                    for(int k=0;k<cha.length();k++)
                        st.push(cha.charAt(k));
                }
                    
            }
            else
                st.push(s.charAt(i));    // to store character in stack
        }
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty())
            sb.append(st.pop());   // push all characters from stack to mutable string 
        
        return sb.reverse().toString(); // reverse string and convert it to immutable string
         
    }
    public static void main(String[] args) {
        String s ="3[c]2[b]";
        Solution o = new Solution();
        System.out.println(o.decodeString(s));
        System.out.println(o.decodeString("3[a2[c]]"));
    }
}
