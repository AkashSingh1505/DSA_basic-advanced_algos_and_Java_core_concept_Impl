
package Array;
// 1 4 3 5 0
public class Array {
    static void insert(int arr[],int item,int index,int presentElement){
        int k=presentElement;
       while(index<=k){
        arr[k+1]=arr[k];
        k--;
       }
       arr[index]=item;
       presentElement++;
    }

    static int delete(int arr[], int index,int size){
        int k=size;
        int num=arr[index];
        while(index<k-1){
            arr[index]=arr[index+1];
            index++;
          
        }
        size--;
        
        return num;
    }
    public static void main(String args[]) {
        int size=5;
       int arr[]=new int[size];
       arr[0]=1;
       arr[1]=4;
       arr[2]=3;
       insert(arr,5,2,3);
       
       for(int k: arr){
        System.out.print(k+" ");
       }
       System.out.println();
       delete(arr, 2, size);
       for(int k: arr){
        System.out.print(k+" ");
       }
       
    }
}
