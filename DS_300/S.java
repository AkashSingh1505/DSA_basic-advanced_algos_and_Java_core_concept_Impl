
package DS_300;
//find th balance point of array where left and right sum is equal

public class S {
    static int heavy;
    static boolean balance(int arr[], int lb,int mid,int ub){
        int sum1=0,sum2=0;
        
       for(int i=0;i<mid;i++){
           sum1+=arr[i];
       }
       for(int i=mid+1;i<=ub;i++){
           sum2+=arr[i];
       }
       if(sum1==sum2){
           System.out.println("yes");
           return true;
       }
       if(sum1>sum2){
           heavy=0;
       }
       if(sum1<sum2){heavy=1;}
       return false;
        
    }
    public static void main(String[] args) {
        int [] arr={1,3,5,2,2,7,13};
         int n = arr.length;
        int lb=0;
        int ub=n-1;
        int mid=lb+(ub-lb)/2;
        int equal=mid+1;
        while(!balance(arr,lb,mid,ub)){
            if(heavy==0){
                mid=mid-1;
            }
            else if(heavy==1){
                mid=mid+1;
            }
            equal=mid+1;
        }
        System.out.println(equal);

    }
}
