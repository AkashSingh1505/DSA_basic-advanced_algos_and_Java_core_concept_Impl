/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.CollectionJ;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.TreeSet;

/**
 *
 * @author user
 */
//By Default Priority Q Add the data in acending order;
class Employee{
    String name;
    int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", salary=" + salary + '}';
    }
    
}
public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> qq = new PriorityQueue<>();
        qq.add(50);
        qq.add(100);
        qq.add(500);
        qq.add(10);
        System.out.println(qq);
        TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                return b-a;
            }
        });
        ts.add(50);
        ts.add(500);
        ts.add(800);
        ts.add(50);
        System.out.println(ts);
        
       PriorityQueue<Employee>  q = new PriorityQueue<>(new Comparator<Employee>(){
           public int compare(Employee e1,Employee e2){
               return e2.salary-e1.salary;
           }
       });
       q.add(new Employee("aKASH", 20000));
       q.add(new Employee("aS", 30000));
       q.add(new Employee("aSASDF", 30));
        System.out.println(q.poll());
        
    }
    
}
