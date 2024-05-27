package DS_300;

import java.util.HashMap;

class Exp{
    public static String horigental(String[] arr){
        if(arr.length==0)return "";
        //horigental
        String x=arr[0];
        for(int i=1;i<arr.length;i++){
            while(arr[i].indexOf(x)!=0){
                x=x.substring(0,x.length()-1);
                if(x.isEmpty())return "";
            }
        }
        return x;
    }
    public static String vertical(String[] arr){
        if(arr.length==0)return "";
        for(int i=0;i<arr[0].length();i++){
            char c = arr[0].charAt(i);
            for(int k=1;k<arr.length;k++){
                if(i==arr[k].length()||arr[k].charAt(i)!=c){
                    return arr[0].substring(0,i);
                }
            }
        }
        return arr[0];
    }
    public static String devide_con(String[] arr,int lb,int ub){
        if(lb==ub)return arr[lb];
        int mid=lb+(ub-lb)/2;
        String l=devide_con(arr,lb,mid);
        String r =devide_con(arr,mid+1,ub);
        return concure(l,r);
    }
    private static String concure(String l,String r){
        String temp=l;
        while(r.indexOf(temp)!=0){
            temp=temp.substring(0,temp.length()-1);
            if(temp.isEmpty())return "";
        }
        return temp;
        
        /* or ->*/
//       int n = Math.min(l.length(),r.length());
//       for(int i=0;i<n;i++){
//          if(l.charAt(i)!=r.charAt(i)){
//              return l.substring(0,i);
//          }
//       }
//       return l.substring(0,n);
    }
    public static String bybinarysearch(String[] arr){
        if(arr.length==0)return "";
        int min=Integer.MAX_VALUE;
        for(String i:arr){
             min=Math.min(min,i.length());}
        int lb=1;
        int ub=min;
        while(lb<=ub){
            int mid=(lb+ub)/2;
            if(isCommon(arr,mid)){
                lb=mid+1;
            }
            else{
                ub=mid-1;
            }
        }
        return arr[0].substring(0,(ub));
        
    }
    private static boolean isCommon(String[] arr,int len){
        String temp=arr[0].substring(0,len);
        
        for(int i=1;i<arr.length;i++){
            if(!arr[i].startsWith(temp)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
      String[] arr={"flower","flow","flight","flop"};
//      String[] arr={};
        System.out.println(horigental(arr));
        System.out.println(vertical(arr));
        System.out.println(devide_con(arr,0,arr.length-1));
        System.out.println(bybinarysearch(arr));
    }
}