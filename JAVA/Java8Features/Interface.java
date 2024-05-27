/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.Java8Features;
interface Hardrive{
    static void show(){
        System.out.println("i am in");
    }
    default int score(){
        System.out.println("my score is 10");
        return 0;
    }
}
class A implements Hardrive{
    
}
public class Interface {
    public static void main(String[] args) {
        Hardrive.show();
        A obj = new A();
        obj.score();
    }
    
}
