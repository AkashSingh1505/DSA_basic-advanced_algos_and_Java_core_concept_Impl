package JAVA;
public class INTEGER {
    int data;
    INTEGER(int n){
        this.data=n;
    }
    int intValue(){
        return data;
    }
    public static void main(String[] args) {
        
        INTEGER num = new INTEGER(4);
        System.out.println(num.intValue());
//        Integer n=54;
       String str="12";
       int n = Integer.parseInt(str);
        System.out.println(n);
        String s = "Akas*@jh_%";
        s=s.replaceAll("[^a-zA-Z0-9]", " ");
        System.out.println(s);
        
                
    }
    
}
