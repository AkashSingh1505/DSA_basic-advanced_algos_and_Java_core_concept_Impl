/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DS_300;

import java.util.ArrayList;

/**
 *
 * @author Akash singh
 */
public class Sort {


    public static  boolean binarysearch(int arr[],int key){
        int lb = 0;
        int ub=arr.length-1;
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(key==arr[mid])return true;
            if(key<arr[mid])ub=mid-1;
            if(key>arr[mid])lb=mid+1;
        }
        return false;
    }
    static ArrayList<Integer> commonElements(int A[], int B[], int C[], int n1, int n2, int n3) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        int temp=0;
        int max=B[n2-1];
        boolean first = true; 
        for(int i =0; i<n1 && A[i]<=max;i++){
            if(A[i]>=B[0]){
                if(binarysearch(B,A[i])){
                    if(first){
                        temp=A[i];
                        list.add(A[i]);
                        first=false;
                        continue;
                    }
                    if(temp!=A[i]){
                        list.add(A[i]);}
                }
            }
        }
        int i=0;
        System.out.println(list);
        if(!list.isEmpty()){
            while(i<list.size()){
                
                if(!binarysearch(C,list.get(i))){
                    System.out.println("i am false"+list.get(i));
                    list.remove(i);
                    continue;
                    
                }
                i++;
            }
        }
        return list;
        
    }
    public static void main(String[] args) {
        int a[]={15,88,48,-69,-68,-39,-25,-6,18,33,39,42,46,52,55,55,64,71};
        int b[]={-97,-92,-90,-90,-87,-85,-82,-77,-77,-77,-75,-71,-67,-64,-60,-59,-58,-52,-49,-48,-48,-47,-47,-46,-41,-36,-35,-29,-28,-26,-25,-20,-19,-14,-13,-13,-11,-10,-6,-4,2,3,9,12,15,17,20,22,23,24,27,29,36,36,37,38,39,42,45,47,48,48,50,52,52,53,57,59,60,63,63,64,64,65,68,70,71,76,76,77,83,83,84,85,86,89,97,97};
        int c[]={-95,-95,-86,-83,-70,-67,-57,-53,-52,-35,-33,-32,-30,-20,-16,-15,-15,-11,-10,-10,-4,0,4,15,18,34,36,37,39,41,43,43,48,49,50,51,58,63,64,67,69,77,79,84,84,94,95,97};
//        int c[]={55};
        ArrayList<Integer> l = commonElements(a,b,c,15,88,48);
        System.out.println(l);
//        System.out.println(binarysearch(c, -6));
    }
}