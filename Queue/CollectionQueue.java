
package Queue;

import java.util.*;

public class CollectionQueue {
    public static void main(String[] args) {
        Queue<Integer> QL= new LinkedList<>();
        Queue<Integer> QA= new ArrayDeque<>();
        
       
        QL.add(10);
        QL.add(15);
        QL.add(45);
        QL.add(20);
        while(!QL.isEmpty()){
            System.out.println(QL.peek());
            QL.remove();
        }
        
        QA.add(10);
        QA.add(15);
        QA.add(45);
        QA.add(20);
        while(!QA.isEmpty()){
            System.out.println(QA.peek());
            QA.remove();
        }
        
    }
    
}
