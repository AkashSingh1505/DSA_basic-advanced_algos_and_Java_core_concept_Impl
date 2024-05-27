 
package JAVA;

import java.util.Arrays;


public class ArrayA {
    public static void main(String[] args) {
//        array initialize
        int arr1d[]= {1,2,3};
        int []arr2d[]={{1,2,3},{2,3,5}};
        int k[]={4,2,7,1,9,6};
        Arrays.sort(k);
        for(int i:k){
            System.out.print(i+",");
        }
        
        int arrr1d[]=new int[3];
        int []arrr2d[]=new int[][]{{1,2,3},{2,3,5}};
        
//        array passing to method
//        fun(arr1d);
//          fun(new int[]{1,2,3});//anonymous array passing
//******************************************************************************************************

//        Jagged Array
//        if we create a 2d array which have odd no of column in atleast one row
           
//           1 2 3
//           4 5
//           6 7 8 9

//     initalization of jagged array
        int jaggedA[][]= new int[3][];
//        jaggedA[0]=new int[3];
//        jaggedA[1]=new int[2];
//        jaggedA[2]=new int[4];
//           ***** OR
// i am initialinze also bcz of my lazyness
        jaggedA[0]=new int[]{1,2,3};
        jaggedA[1]=new int[]{4,5};
        jaggedA[2]=new int[]{6,7,8,9};
//            ******oR
        int jaggedB[][]= new int[][]{{1,2,3},{4,5},{6,7,8,9}};
        
        //printg a jagged array;
        
//        for(int i = 0;i<jaggedA.length;i++){
//            for(int j=0;j<jaggedA[i].length;j++){
//                System.out.print(jaggedA[i][j]+" ");
//            }
//            System.out.println();
//        }

//       print by foreach loop
        for(int[] n:jaggedB){
            for(int a:n){
                System.out.print(a+" ");
            }
            System.out.println();
        }
// **********************************************************************************
//         array cloning
         int imclon[][]=jaggedB.clone();
//         jaggedB[1][1]=55555; it is shallow cloning
         for(int[] n:imclon){
            for(int a:n){
                System.out.print(a+" ");
            }
            System.out.println();
        }
         /*===============================================================================================================
                                               COpy array
   ================================================================================================================*/
         int copy[]={3,2};
         int c[]=new int[2];
         
          
          System.arraycopy(copy,0,c,0,1);
          System.out.println(c[0]+" "+c[1]);
    }
}
