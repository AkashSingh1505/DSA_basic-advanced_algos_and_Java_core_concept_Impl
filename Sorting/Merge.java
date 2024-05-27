 
package Sorting;
   /*===============================================================================================================
                                               Merge sort
* Divide and conqure:-
                       if there is a large problem then divide it into the subproblem and then solve those small problem
                       then conqure them to get the solution of main problem

                       Time complexity for divideing is log(n) and conquere is 0(n)
                       Total time com. for sorting is o( nlog(n) )

  Time complexity calculation :
                                      arr0[]
                              arr[1]           arr[2]
                         arr[3]   arr[4]     arr[5]   arr[6]

                         *  here we can in the merge sort the main array  0  divided into sub array like a tree
                            so it will take time log(n) to fully divide
                         
                         *  at the last we need to conqure the sub array to get the solution  for n time
                            
                         do time complex   O(nlog(n)) in all cases like worst average,best







   ================================================================================================================*/

public class Merge {
    
    public static void conqure(int arr[],int lb,int mid,int ub){
        int tempArr[]= new int[ub-lb+1];
        int lix = lb;///starting index of left side array picturize it first
        int rix = mid+1;
        int x=0;
        while(lix<=mid && rix<=ub){
            if(arr[lix]<=arr[rix]){
                tempArr[x++]=arr[lix++];
            }
            else{
                tempArr[x++]=arr[rix++];
            }
        }
        while(lix<=mid){
            tempArr[x++]=arr[lix++];
        }
        while(rix<=ub){
          tempArr[x++]=arr[rix++];  
        }
        for(int i=0,j=lb;i<tempArr.length;i++,j++){
            arr[j]=tempArr[i];
        }
           
            
    }
    public static void Divide(int arr[],int lb,int ub){
        if(lb==ub){
            return;
        }
        int mid=lb+(ub-lb)/2;
         Divide(arr,lb,mid);
        Divide(arr,mid+1,ub);
        conqure(arr,lb,mid,ub);
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,1,3,9,7};
        int n = arr.length;
        Divide(arr,0,n-1);
        for(int m:arr){
            System.out.print(m+" ");
        }
        
    }
    
}
