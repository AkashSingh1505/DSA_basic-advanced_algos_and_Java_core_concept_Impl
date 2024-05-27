 

package Sorting;

public class BasicSort {
    static void print(int arr[]){
        for(int n: arr){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
//        int arr[]={2,1,8,4,7,5,6,3};
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        
        /*===============================================================================================================
                                               Bubble sort(O(n^2))
   ================================================================================================================*/
//            boolean swap=false;//by using swap the time complexity of bubble sort in best case became O(n)____when array is already sorted 
            
//        for(int i=0;i<n-1;i++){
//            
//            for(int j=0;j<n-1-i;j++){
//                if(arr[j]>arr[j+1]){
//                    int temp=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=temp;
//                    swap=true;
//                }
//            }
//            if(swap==false){
//                System.out.println("i am already sorted");
//                break;
//            }
//        }
//        print(arr);
        
        /*===============================================================================================================
                                               Selection sort(O(n^2)) in every case
      This algo in once cycle find the smallest element index throughout the array and when its find then swap it with assume smallest index
   ================================================================================================================*/
//        for(int i=0;i<n-1;i++){
//            int smallest =i;
//            for(int j=i+1;j<n;j++){
//                if(arr[smallest]>arr[j]){
//                    smallest=j;
//                }
//            }
//            int temp=arr[i];
//            arr[i]=arr[smallest];
//            arr[smallest]=temp;
//        }
//        print(arr);    
        
        /*===============================================================================================================
                                               Insetion sort( O(n^2) ) in best case O(N)
                                divide the array in two parts   sorted array +  Unsorted array
   ================================================================================================================*/
//       for(int i =1;i<arr.length;i++){
//             int j =i-1;
//             int current = arr[i];
//             while( j>=0&&current < arr[j]){
//                 arr[j+1]=arr[j];
//                 j--;
//             }
//             arr[j+1]=current;
//             
//         }
//         print(arr);
    }
    
}
