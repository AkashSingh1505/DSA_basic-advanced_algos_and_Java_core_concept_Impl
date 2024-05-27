/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JAVA.CollectionJ;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;


public class Hashmap {
    public static void main(String[] args) {
        Hashtable<Integer,String> map = new Hashtable<>();
        map.put(1, "akash");
        map.put(2, "singh");
        map.put(3, "morning");
//        map.put(null, "night");
        Set<Integer> set = map.keySet();
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            System.out.println(map.get(it.next()));
        }
        System.out.println("---------------------------------------------");
        Set<Entry<Integer,String>> es=map.entrySet();
        Iterator<Entry<Integer,String>> i = es.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        
    }
}
