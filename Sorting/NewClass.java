
package Sorting;


public class NewClass {
    public static String concure(String l,String r){
        String result=l;
        while(r.indexOf(result)!=0){
            result=result.substring(0,result.length()-1);
            if(result.isEmpty()){
                return "";
            }
        }
        return result;
        
    }
    public static String devide(String[] arr,int lb,int ub){
        if(lb==ub)return arr[lb];
        int mid=lb+(ub-lb)/2;
        String lstring=devide(arr,lb,mid);
        String rstirng=devide(arr,mid+1,ub);
        return concure(lstring,rstirng);
    }
    public static void main(String[] args) {
        String strs[]={"flower","flow","flopr","flight"};
        System.out.println(devide(strs,0,strs.length-1));
        
    }
}
