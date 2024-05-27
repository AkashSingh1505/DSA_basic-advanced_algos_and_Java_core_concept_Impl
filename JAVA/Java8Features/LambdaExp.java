
package JAVA.Java8Features;
//here we are discussing two concept  first is lambda exp second is foreach method 

//Lambda exp is use when we have only one method in interface then in case we can use Lambda exp to reduce the code length;
//(with out lambda exp we need to use either a implementing class or a anonymous class so do  this by just using labda exp)

//foreach method take obj of Consumer interface which have only one method (public void accept(T t))
//so we can also use lambda emp here too

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


interface I{
    void show(int i);
}
public class LambdaExp {
    public static void main(String[] args) {
        
//        first i am showing the implemntaion of interface using annoymous class
             I obj;
//        obj = new I(){
//          public void show(){
//              System.out.println("I am in");
//          }  
//        };
        
//        lets do the same thing with lambda exp;
       
        obj = i->System.out.println("i am in "+i);
        obj.show(2);
        
//          ******************************* ForEach method in java 1.8****************
//    befor  the java 1.8 we travers collection list  with external loops(while,for,for each)....which is slow
//      in java 1.8 foreach method comes in roll which do internal iteration in  a List (faster then other)
     
        List<Integer> value = Arrays.asList(1,2,5,7,8);
        value.forEach(new Consumer<Integer>(){
            public void accept(Integer i){
                System.out.println(i);
            }
        });
//        value.forEach(i->System.out.println(i));
    }
}
