
package JAVA;
class A implements Cloneable{
    int i;
    int j;
    void print(){
        System.out.println(i+" , "+j);
    }
    
    public Object clone()throws CloneNotSupportedException{
        System.out.println(super.clone());
        return super.clone();
    }
}
public class CLONE {
    public static void main(String[] args)throws CloneNotSupportedException {
        A obj = new A();
        obj.i=5;
        obj.j=7;
        //Shallow copy(in this two reference point the same object
//        A objc = obj;
//        obj.print();
//        obj.i=10;
//        objc.print();
//        obj.print();
        
        // deep cloning(its take too much time to copy all felds value
        
//        A objc = new A();
//        objc.i=obj.i;
//        objc.j=obj.j;
//        objc.print();

           //Cloning method
           A objc=(A)obj.clone();
           obj.print();
           obj.i=8;
           obj.print();
           objc.print();
    }
    
}
