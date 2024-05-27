
package JAVA;

class Parent{
int fun(){
        System.out.println("i am a method in parent");
        return 5;
    }
    int funn(){
        return 3;
    }
}
class Child extends Parent{
  int fun(){
        System.out.println("i am in child class");
        return super.fun();
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Child o = new Child();
        o.fun();
    }
}
