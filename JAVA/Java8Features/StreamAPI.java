
package JAVA.Java8Features;
//StramAPI is introduced in java 1.8 version its is use to process collection obj or group of objects
//It reduced the length of code , it contains lots of method , pack>  java.util.stream.Stram

//One Stream OBJect can be  used only fo one times

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//    Stram is a Interface

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(1,5,8,4,9,10);// this list will be immutable(any change will throw an exception;
        List<String> SList = List.of("Akash","Aman","Aarti","Gopal","Sarika","Deepika");
        
      
        Stream<String> obj =SList.stream();
//        List<String> S = obj.filter(i->i.endsWith("ka")).collect(Collectors.toList());
//        System.out.println(S);
//        System.out.println(obj.map(i->i.concat("Hello world")).collect(Collectors.toList()));
//            obj.forEach(System.out::print);
            obj.forEach(i->System.out.print(i+" "));
//        list1.add(5);
        List<Integer> list2 = Arrays.asList(5,4,8,1,10,15,9,75);// this list will be immutable;
        List<Integer> list3=list2.stream().filter(i->i>=15).collect(Collectors.toList());
        List<Double> list4 = list1.stream().map(i->Math.pow(i, 2)).collect(Collectors.toList());
        System.out.println();
        
        System.out.println(list1.stream().max((a,b)->a.compareTo(b)).get().intValue());
        Stream<Integer> s=Stream.empty();
        s.forEach(System.out::println);
      
    }
}
