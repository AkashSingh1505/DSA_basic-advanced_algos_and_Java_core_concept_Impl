
package TeleQ;



public class Solutiona { 

    static int i=0,j=0;
    public static void setZeroes(int[][] matrix) {
        
       
            int k,l;
            int m=matrix.length;
            int n=matrix[0].length;
        System.out.println(m+" "+n);
           // if(i==m+1&&j=0){
           //     return;
           // } 
            
            while(i<matrix.length && j<matrix[0].length){
                System.out.println("yes i am"); 
                if(matrix[i][j]==0){
                    k=i;
                    l=j;
                     System.out.print(i);
                    if(j!=n-1){j++;}
                    else{
                        i++;
                        j=0;
                    }
                    setZeroes(matrix);
                    for(int i=0;i<n;i++){
                        matrix[k][i]=0;
                    }
                    for(int i=0;i<m;i++){
                        matrix[i][l]=0;
                    }
                    return;                    
                }
                else{
                    if(j!=n-1){j++;}
                    else{
                        i++;
                        j=0;
                    }
                    System.out.println(j+""+i);
                }
                
        }
                return;   
            
        
    }
    public static void main(String[] args) {
       int matrix[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
       setZeroes(matrix);
       for(int n[]:matrix){
           for(int p:n){
           System.out.print(p+" ");}
           System.out.println();
       }
    }
}   
