
package Sorting;

import java.util.ArrayList;


public class Bsort {
    static ArrayList<Double> L[]=new ArrayList[10];
    static double[] bsort(double arr[]){
       for(int i=0;i<10;i++){
           L[i]=new ArrayList<Double>();
       }
       for(int i=0;i<arr.length;i++){
           L[(int)arr[i]*10].add(arr[i]);
       }
       for(int i=0;i<10;i++){
           insertion(L[i]);
       }
       //join
        double result[]=new double[arr.length];
        int k=-1;
        for(int i=0;i<10;i++){
            for(int j=0;j<L[i].size();j++){
                result[++k]=L[i].get(j);
            }
        }
        
        return result;
    }
    
    static void insertion(ArrayList<Double> list){
        int n=list.size();
        for(int i =1;i<n;i++){
            int j=i-1;
            double cur = list.get(i);
            while(j>=0 && cur<list.get(j)){
                list.set(j+1, list.get(j));
                j--;
            }
            list.set(j+1, cur);
        }
    }
    static void print(double a[]){
        for(double i:a)System.out.print(i+",");
        System.out.println();
    }
    
    public static void main(String args[]) {
     double arr[]={0.78,0.17,0.39,0.26,0.72,0.94,0.21,0.12,0.23};
        print(arr);
     
     arr=bsort(arr);
        print(arr);
    }
}
