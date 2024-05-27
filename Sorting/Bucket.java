
package Sorting;

import java.util.ArrayList;

/*===============================================================================================================
                                               Bucket Sort
              * Bucket sort is also non comparison algo
              * It use to sort the float no [0,1]
              * in  this Sorthing algo buckets are created to put elemets into them.
              * then we apply some soring alfo (insertion sort) to sort the elements in each bucket
              * and at the end we join them to a single array
              * number of bucket n = Maxinmum of input array
   ================================================================================================================*/
public class Bucket {
   static  ArrayList<Double> b[];
   static int m;
   static int p=0;
   
    static void sort(double arr[],int n){
        m=n;
        b = new ArrayList[n];
        for(int i =0;i<n;i++){
            b[i]=new ArrayList<Double>();
        }
        // now we will put the element into the buckets;
        for(int i = 0;i<arr.length;i++){
            int ix=(int)(10*arr[i]);
//            System.out.println(ix);
            b[ix].add(arr[i]);
            
        }
        
        // short the each list
        for(int i = 0;i<n;i++){
            insertionSort(b[i]);
        }
//       
        //join
        
        int i=0;
        while(i<n){
            for(int j=0;j<b[i].size();j++){
                arr[p]=b[i].get(j);
                p++;
            }
            i++;
        }
        
    }
//    static void print(){
//         int i=0;
//         while(i<m){
//        for( double d: b[i]){
//         System.out.print(d+" ");
//     }
//        i++;
//         }
//    }
       
    
        static void insertionSort(ArrayList<Double> arr){
            for(int i=1;i<arr.size();i++){
                int j=i-1;
                double curNum=arr.get(i);
                while(j>=0&&curNum<arr.get(j)){
                    arr.set(j+1, arr.get(j));
                    j--;
                }
                arr.set(j+1, curNum);
            }
        }
    
    
    public static void main(String[] args) {
        double arr[]={0.78,0.17,0.39,0.26,0.72,0.94,0.21,0.12,0.23};
        double max=0.0;
        for(int i = 0;i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }

        sort(arr,(int)(10*max+1));

for(double n:arr){
    System.out.print(n+" ");
}
        
    }
}
