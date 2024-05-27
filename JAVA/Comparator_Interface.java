 package JAVA;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

  class Com implements Comparator<Integer>{
         public int compare(Integer x,Integer y){
            if(x%10>y%10){return 1;}
            return -1;
        }
     }

public class Comparator_Interface {

    
    public static void main(String[] args) {
      List<Integer> l = new ArrayList<>();
    int arr[]={100,502,103,207,311,708,804};
    for(int i=0;i<7;i++){
        l.add(arr[i]);
//    l.sort(arr[i]);
    }
//    Mycom c= new Mycom();
//    Collections.sort(l, c);
    Collections.sort(l, new Comparator<Integer>(){
        public int compare(Integer x,Integer y){
            if(x%10>y%10){return 1;}
            return -1;
        }
    });
        System.out.println(Collections.min(l));
//    Collections.reverse(l);
        System.out.println(l);

    
    }
    
}
