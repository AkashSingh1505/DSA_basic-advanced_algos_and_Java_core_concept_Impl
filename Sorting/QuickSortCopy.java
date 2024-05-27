
package Sorting;

public class QuickSortCopy {
    private static int getIndex(int arr[],int lb,int ub){
        int pivot = arr[ub];
        int i=lb-1;
        for(int j =lb;j<ub;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i, j);
            }
        }
        i++;
        swap(arr, i, ub);
        return i;
    }
    private static void swap(int arr[],int i,int j){
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static void quickSort(int arr[],int lb,int ub){
        if(lb<ub){
            int pivot = getIndex(arr,lb,ub);
            quickSort(arr, lb, pivot-1);
            quickSort(arr, pivot+1, ub);
        }
    }
    public static void main(String args[]) {
        int arr[]={9,10,8,7,1,5,2,3};
        MergeCopy.print(arr);
        quickSort(arr,0,arr.length-1);
        MergeCopy.print(arr);
    }
}
