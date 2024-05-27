
package Sorting;
/*===============================================================================================================
                                               Time comlexity for heap short is ( nlog(n) ) 
   ================================================================================================================*/

public  class Heap{
       static int heap[];
       static int arr[];
       Heap(int arr[]){
           this.arr=arr;
       }
        /*===============================================================================================================
                                                        MAX Heap
   ================================================================================================================*/
         void maxHeap(){
           heap= new int[arr.length]; 
           heap[0]=arr[0];
           for(int i=1;i<arr.length;i++){
               int n=i;
               
                heap[n]=arr[n];
                while(n>0){
                    
                    if(heap[(n-1)/2]<heap[n]){
                         swap(n);
                         
                         n=(n-1)/2;
                    }
                    else{
                        break;
                    }
                }
           }
            
        }
       static void swap(int ix){
           int temp=heap[(ix-1)/2];
           heap[(ix-1)/2]=heap[ix];
           heap[ix]=temp;
            
        }
        
       static void print(){
           for(int n: heap){
               System.out.print(n+" ");
           }
       }
        static int j=0;
        static int delete(){
            
            int n=0;
            int temp=heap[n];
            int HL=heap.length-1-j;//heap array updateted length
            if(HL==0){return temp;}
            heap[n]=heap[HL];
 
            
            while(!(HL<=(2*n+1)||HL<=(2*n+2) )){
                int max=Math.max(heap[(2*n)+1],heap[(2*n)+2]);
                if(heap[n]<max){
                    int temp1=heap[n];
                    if(max==heap[(2*n)+1]){
                        heap[n]=max;
                        heap[(2*n)+1]=temp1;
                        n=2*n+1;
                    }
                    else{heap[n]=heap[(2*n)+2];
                         heap[(2*n)+2]=temp1;
                        n=2*n+2;
                    }
                }
                else{
                    j++;
                    return temp;
                }
            }
            j++;
            return temp;   
        }
        
        
        static void heapSort(){
            for(int i=heap.length-1;i>=0;i--){
                heap[i]=delete();
            }
        }
    
            
    public static void main(String[] args) {
        int arr[]={10,20,15,30,40,2,50,12,55,1,70,0,18,100,150,7,3,58,37,43};
        Heap h = new Heap(arr);
        h.maxHeap();
        h.print();
        System.out.println();
        h.heapSort();
        h.print();
    }
}

    
    

