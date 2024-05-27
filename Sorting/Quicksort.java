
 /*===============================================================================================================
                                               Quick sort 
pivot:- it is a point around its all things is happen
    
Approch:- we select a pivot in an array and all the element which less then pivot set left side of it,when all satteld then
          at the last we will ask the space provider to move one more stap where pivot will set , and now the index of pivot is
          return , now u can say that pivot is at its right poisiton
          
          if u want to do this for rest element then call that function for FUN(lower,pivot-1) and then FUN(pivot+1,high) it will happen recusively
space provider:-
          it is nothing but itteratin first it set at -1 or lower index-1 initial
          then we traverse the array by any indexr like int j=lower;j<pivot;j++
          and whenever arr[j] is meet lower the the pivot then its order to space provider
          space provider move one stap sp++ ane swap the vale by its value  Swap(arr[j],arr[sp]);

Time complexity:-
                in Average case time com is O(nlogn);
                in worst case Quick sort time com. is o(n^2)
what is worst case for quick sort:
                                    assume we get an array   1=[1,2,3,4] or 2=[5,4,3,2,1]
                                    so it is also possible that we can get those kind of array in the middle of recursion so in that what happen:
              in 1 array let we take last element as pivot :
                                            so array traversed for checking (arr[i]<4) but 4 is already set on its right place
                                            it will run                  n             time
       second time [1,2,3] where 3 will already set but it wil run       n-1           time
       third  time [1,2]                                                 n-2           time
       .               
       .
       .                                                                  1             time
                                                            Total will be = n+n-1+n-2+.....1
                                                                          = n(n-1)2
                                                                          O(n^2)
       so it is a worst case it happen rarely
   **********************************    Merge/Quick
       so we choose Quice sort where we dont have extra memory to make helper Array like merge sort
       but the worst case shoud me in mind ki ha esa bhi ho skta hai rarily
       and merge sort use where space is aviable for hellper array and only want o(nlog(n) in every case
   ================================================================================================================*/
package Sorting;

public class Quicksort {
    public static int partition(int arr[],int lb,int ub){
       int pivot=arr[ub];//i am assuming the ub bound or the last element of the array as a piovt(piveeet) some coder take initail element,midian
       int i=lb-1;//it is our space provider
       for(int x=lb;x<ub;x++){
           //seting the smaller then pivot
           if(arr[x]<pivot){
               i++;
               int temp=arr[i];
               arr[i]=arr[x];
               arr[x]=temp;
               
           }
        }
           //now set the povot
           i++;
           int temp=arr[i];
           arr[i]=pivot;
           arr[ub]=temp;
           
           return pivot;
    }
    public static void sort(int arr[],int lb,int ub){
        if(lb<ub){
            int pix=partition(arr,lb,ub);//pix is index of piviot which is return by partion method
            sort(arr,lb,pix-1);
            sort(arr,pix+1,ub);
        }
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,9,3,7,0,8,4};
        int n = arr.length;
        sort(arr,0,n-1);
        //print
        for(int m: arr){
            System.out.print(m+" ");
        }
    } 
    
}
