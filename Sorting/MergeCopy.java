/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Sorting;

public class MergeCopy {
   public static void print(int arr[]){
        for(int i:arr)System.out.print(i+",");
        System.out.println();
    }
    static void mergeSort(int arr[]){
        devide(arr, 0, arr.length-1);
    }
    static void conqure(int arr[],int lb,int mid,int ub){
        int i = lb;
        int j=mid+1;
        int temp[]=new int[ub-lb+1];
        int t=0;
        while(i<=mid && j<=ub){
            if(arr[i]<=arr[j]){
                temp[t++]=arr[i++];
            }
            else{temp[t++]=arr[j++];
            }
        }
        while(i<=mid){
            temp[t++]=arr[i++];
        }
        while(j<=ub){
            temp[t++]=arr[j++];
        }
        for(int k=lb,p=0;p<temp.length;k++,p++){
            arr[k]=temp[p];
        }
        
    }
    static void devide(int arr[],int lb,int ub){
        if(lb==ub){
            return;
        }
        int mid=lb+(ub-lb)/2;
        devide(arr,lb,mid);
        devide(arr,mid+1,ub);
        conqure(arr,lb,mid,ub);
    }
    
  
    public static void main(String args[]) {
        int arr[]={7,1,5,4,3,2,8,9};
        print(arr);
        mergeSort(arr);
        print(arr);
        
    }
}
