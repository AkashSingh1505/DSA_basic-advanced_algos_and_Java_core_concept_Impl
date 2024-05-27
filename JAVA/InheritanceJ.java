package JAVA;
class Bike{
    
   private void fast(){//if  it protected the remember the concept of obj cloneing
        System.out.println("I am fast");
    }
  static   void efficient(){
        System.out.println("i am efficient");
    }
}
class MountainBike extends Bike{
   static void efficient(){
        System.out.println("i m in subclass");
    }
   void fast(){
       System.out.println("i am fast but in sub class");
   }
}
public class InheritanceJ {
    public static void main(String[] args) {
        Bike obj = new MountainBike();
//        obj.Fly();
        obj.efficient();
//        obj.fast();
       
    }
}
