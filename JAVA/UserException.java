package JAVA;
public class UserException{
    static class MyException extends Exception{
//        String desc;
        MyException(String desc){
            super(desc);
                    }
        public String toString(){
            return "devide by zero akash";
        }
     
    }
    public static void main(String[] args)throws MyException{
//        MyException o = new MyException();
        int a=2,b=0,c;
//        try{
//              c=a/b;
            if(b==0){
                throw new MyException("this is wrong bro");
            }
//        }
//        catch(MyException o){
//            System.out.println(o.getMessage());
//        }
//System.out.println("hi ");
    }
}
