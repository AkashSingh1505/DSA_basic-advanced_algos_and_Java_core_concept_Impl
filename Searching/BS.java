
package Searching;

import java.util.Scanner;

public class BS {
    static int search(int arr[],int key,int lb,int ub){
        
        while(lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(arr[mid]==key)return mid;
            else if(arr[mid]<key)lb=mid+1;
            else ub=mid-1;
        }
        return -1;
    }
    static int recursiveSearch(int arr[],int key,int lb,int ub){
        if(lb<=ub){
            int mid=(lb+ub)/2;
            if(arr[mid]==key)return mid;
            else if(arr[mid]<key)return recursiveSearch(arr, key, mid+1, ub);
            else return recursiveSearch(arr, key, lb, mid-1);
        }
        return -1;
    }

    public static void main(String args[]) {
        int arr[]={1,2,4,6,7,8,9,15};
        System.out.print("Enter the key : ");
        int key = new Scanner(System.in).nextInt();
        System.out.println("the key is foundaded at "+search(arr,key,0,arr.length-1));
        System.out.println("the key is foundaded at "+recursiveSearch(arr, key, 0,arr.length-1));
        
    }
}
