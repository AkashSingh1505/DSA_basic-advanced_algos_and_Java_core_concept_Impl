
package Graph;

import java.util.Scanner;

/*===============================================================================================================
                                               Dyanamic programing(Algoes)
Dynamic:-
            this word refer to solve and take the action or decesion at run time 
            so Dynamic environment invole dynamic approches like use of dynamic data structure like Linked List

            In the graph Dyanmic shorts path algoes are present which are:-
                                                                        * Dikjstra algo( Single source shortest path )
                                                                        * Bellman algo( Single source shortest path )
                                                                        * Floyed Warshall algo( All pair shortst path )
            here i am also mention some greedy algoes for finding minimum spanning tree:-
                                                                        * Prims Algo
                                                                        * Kluskar Algo
   ================================================================================================================*/
public class Dyanmic_pro {
    static class GraphD{
       int V;
       int E;
       int mat[][];
       int infinity;//sum of  all edges weight to get infinty value for them
       Scanner input=new Scanner(System.in);
        GraphD(int V,int E){
           this.V=V;
           this.E=E;
           mat=new int[V][V];
           Azero();
           infinityFiller();
       }
       void Azero(){
           for(int i=0;i<E;i++){
                System.out.print("Enter for "+(i+1)+" Edge u ");
                int u=input.nextInt();
                System.out.print("Enter for "+(i+1)+" Edge v ");
                int v=input.nextInt();
                System.out.print("Enter for "+(i+1)+" Edge w ");
                int w=input.nextInt();
                addEdge(u-1,v-1,w);
                
           }
          
       }
       void addEdge(int u,int v,int w){
           infinity+=w;
          mat[u][v]=w;
       }
       void infinityFiller(){
           for(int i=0;i<V;i++){
               for(int j=0;j<V;j++){
                   if(i!=j && mat[i][j]==0 ){
                    mat[i][j]=infinity+1;
                }
               }
           }
       }
       void warshall(){
           for(int i=0;i<V;i++){
               for(int j=0;j<V;j++){
                   for(int l=0;l<V;l++){
                       mat[j][l]=Math.min(mat[j][l], mat[j][i]+mat[i][l]);
                       if(i==V-1){
                            System.out.print(mat[j][l]+" ");
                            if(l==V-1){
                                System.out.println();
                            
                                    
                       }
                   }
               }
           }
       }      
    }
}
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
     
       System.out.print("Enter number of vertix : ");
       int v=input.nextInt();
       System.out.print("Enter number of Edges : ");
       int e=input.nextInt();
       GraphD G = new GraphD(v,e);
      
       G.warshall();
       
               
    }
    
}
    
