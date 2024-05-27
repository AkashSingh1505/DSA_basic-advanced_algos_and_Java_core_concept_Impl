/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.Java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author user
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        for(int i=1;i<=100;i++){
            l.add(i);
        }
        System.out.println(l);
        List<Integer> newList= l.stream().filter(i->i%2==0).map(i->i*10).collect(Collectors.toList());
        System.out.println(newList);
        
    }
    
}
