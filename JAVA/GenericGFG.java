
package JAVA;

/*===============================================================================================================
                                               Generic class
  Generic class are use to genearlize the fields or method wit h the parameter Example(T) type where  T can be Integer ,String,Double,...user Defind
          class can have the one generalize paramter or many too
Generic class:-
                *generic class is a class in which fields and mehods are  generalize with parameter type parameter  example<T>
                 here the t can wbe Integer,double,Float,Char,String,usertdefined...
                *generic class stracture is defined similer to the normal classes except in thoseclasses Class name is followed by
                 type parameter which is enclose by Angle<> bracket 
                *type parameter can be more then one in case the are differenciate with comma(,)
                *Example:- Collection Framwork in java
Where to use:-
                we can use Generic Class when we want to use same logic code which is written in generic class with different dataType
                it prevent us by re -writing the same code in case of just different data type
                
Advantage:-
           typecasting is not required:- in generic class  we dont need to type cast again and again
            Type safity:-one can hold only a single type of object in generics(it can hold n number of objec only where n= no of type parameter
            complie time checking:-   its check all error related to dataType

   ================================================================================================================*/

public class GenericGFG {
//    static class BoundedType<T extends Number>.....it restric those data type which are not number type and its subclass type like(long,float,double,int)
    static class Gen<T,B>{
        T data;
        B input;
        Gen(T data){
            this.data=data;
        }
        void getter(){
            System.out.println(this.data);
        }
    }
    static <T> void print(T arr[]){
        for(T n : arr){
            System.out.print(n+" ");
        }
        
    }
    public static void main(String[] args) {
        Integer arr[]={1,2,5,6};
        String str[]={"akas","singh","re"};
        print(arr);
        System.out.println();
        print(str);
        Gen<Double,String> obj = new Gen<>(10.5);
        obj.getter();
        obj.input="5";
//        obj.input=5.2;
        System.out.println(obj.input);
    }
}
