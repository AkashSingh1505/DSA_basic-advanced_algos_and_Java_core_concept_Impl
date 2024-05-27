
package JAVA;
/*  
   Sigleton class is a  class of which only one instance is allow to create so its restrict the user two create more then one object
    it is fone by creating the constructor private
*/


public class SingletonClass {
    private static  SingletonClass obj = null;
    private SingletonClass(){
        System.out.println("hello");
    }
    public SingletonClass getInstance(){
        if(obj == null){
            return obj=new SingletonClass();
        }
        return obj;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       SingletonClass obj1 = new SingletonClass();//this is alow  bcoz we are in same class 
        System.out.println(obj1);
//       SigletonClass obj2 = new SigletonClass();
    }
}
