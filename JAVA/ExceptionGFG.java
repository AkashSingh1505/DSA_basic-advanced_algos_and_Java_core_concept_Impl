package JAVA;
/*===============================================================================================================
                                         Object
                                         Throwable
                     Exception                                  Error

        userdefined            Builtin                        VirtualmemoryError

                        checked       unchecked          1 memory Out Of Bound error 2 stack overflow    
   ================================================================================================================*/


/*===============================================================================================================
                                               Exception
Exception:-unwanted and unexpected event which occure during the program execution at run time which break the noraml flow
            of program which is prevent by Excption handling concept are called as Exception.
           * when a Exception is occure in a method that method create an object of that exception and give it to the jvm
             that object contain the info about the object such as the name of that Exception and the description and the
             status of the program where this exception is occured
           * Excption class method:-
                                       1 printStackTrace();
                                       2 toString();
                                       3 getMessage();
           *types
                    * user defined (which defined by inheritate the Exception class)
                    * BuiltIn Exception
           *Built In Exception:-
                                those Exception which are already defined in java libary
                types:-
                       1 checkedException:-(which are checked by compiler at cmpile time to convince the compiler we use throws keyword)
                                            FileNotFoundException
                                            ClassNotFoundException
                                            SQLException
                                            IOException
                                            InteruuptException  
                       2 UncheckedException:-
                                            ArrayIndexOutOfBoundsException
                                            NullPointerException
                                            ArithmeticException
                                            
   ================================================================================================================*/
 /*===============================================================================================================
                                               DefaultExceptionhandler
    when a Exception is occure in a method that method create an object of that exception and give it to the JVM
    that object contain the info about the object such as the name of that Exception and the description and the
    status of the program where this exception is occured .
    What JVM does next?
                        now jvm have the object now its start to serarch the Exception handler in CALLSTACK from that
                        victim method(where the error is occure) to its caller and then caller of that caller and so 
                        on.. in reverse order of stack. if JVM found an Exception handler (block of code in which we 
                        use try-cathc)which type is same as the obj which jvm have(which is provided by the victim mehtod)
                        then JVM give it to that Exception Handler else JVM give it to the DEFAULT exception handler which in jvm.

Note:-       DEFAULT EXCEPTION HANDLER  print the exception but terimate the program abnormaly because its is not handle
             by the user.



                                              UserException handling
    user handle the Exception by 6 keyword (try,catch,finally,throw,throws)
Finally:-
        * finally block can be use with try_catch and single try also
        * finally block always execute whether the exception is cathched or not
        * if in a function in try catch return statement hai to bhi finally wala block chlega by code with harry

throw:-
        * it is use to throw the Exceptinon(userdefined or builtin) by this syntex
                                                                          *  throw new ExceptionClassName();
        * after throwing the exception jvm serach for its handling
          if no appropriate exception handler is present then jvm default handler handl this exception and abnormal terminate(jvm throw the error which throw says)
 
throws:-
           * throws is keyword in java which is used in the signature of method to indicate that this method might throw one  of 
             the listed type exception. the caller to these methods has to handle the exception using a try-cathc block

           * throws is keyword in java which is a sigunature o a mehtod to indicate its caller method that i cann throw an listed 
             exception u r my caller and u have to handle it using try catch
*throws keyword is required only for checked exception and usage of throws keyword for unchecked exception is meaningless.
*throws keyword is required only to convince compiler and usage of throws keyword does not prevent abnormal termination of program.
*By the help of throws keyword we can provide information to the caller of the method about the exception.
================================================================================================================*/
 
 
public class ExceptionGFG {
   
    static void fun()/*throws NullPointerException*/{
        int a=2,b=0,c;
//        c=a/b;
        throw new NullPointerException();
    }
    
    public static void main(String[] args){
//        int arr[]={1,2,3};
//        try{
//        if(arr[2]==3){
//            System.out.println("hahah");
//            throw new ArithmeticException("descrption");
////there is no statement allow under the throw bcz hm khud janke yha error throw krre to niche likhne ka koi mtlb nhi hai likhoge to run time erroe aaega na ki jo apne throw kiiya hai wo
//        }
//        }
//        catch(NullPointerException e){
//            System.out.println("please help me");
//         
//        }
////        finally{
////        System.out.println("i am in finally");
////    }
//        System.out.println("i am outside");
try{
        fun();
        System.out.println("noo");}
catch(NullPointerException e){
    System.out.println(e);
}
    }
    
}
