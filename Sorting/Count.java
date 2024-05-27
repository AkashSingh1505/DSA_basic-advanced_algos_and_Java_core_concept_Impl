  
package Sorting;
    /*===============================================================================================================
                                               Count sort
    * it is not a comparison-based sorting algo like all
    *it time complexity is O(n+k) where n is no of element is input array
                                        k is the max element of which size we make a count array to store the count
    
    *Drawback:-
                * The range or max element should we know pre for implement this
                * its space consuming like ex:- 1,1,2000,3,2 for shorting this ita take 2000 size array
    
   ================================================================================================================*/
    
    public class Count{
        static void sort(int arr[]){
            int max=0;
            //finding the max Range of input array
            for(int i=0;i<arr.length;i++){
                max=Math.max(max, arr[i]);
            }
//            diclearing the count array
            int count[]= new int[max+1];
            //count the number of all elemenets of input array and store into count array
            for(int i =0;i<arr.length;i++){
                count[arr[i]]++;
            }
            // modify the count array by adding precvious index count to get the possiont of numbers in output array
            for(int i=1;i<max+1;i++){
                count[i]+=count[i-1];
            }
            //now make the output array of size of input array and arrange it 
            
            int output[]= new int[arr.length];
            for(int i = 0;i<arr.length;i++){
                output[--count[arr[i]]]=arr[i];
            }
            // copy the output array to input array
            for(int i=0;i<arr.length;i++){
                arr[i]=output[i];
        }
        }
    
    
    public static void main(String[] args) {
        int arr[]={1,2,1,3,1,5,4,2,7,3};
        Count obj= new Count();
        obj.sort(arr);
        
        for(int n: arr){
            System.out.print(n+" ");
        }
    }
}
        



