package DynamicPrograming;

// @author Akash singh
public class KadanesAlgo {
    public static int solve(int arr[]){
        int cursum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cursum=Math.max(arr[i],cursum+arr[i]);
            maxsum=Math.max(maxsum,cursum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int arr[]={2,-3,4,2,-1};
        System.out.println(solve(arr));
    }
}
