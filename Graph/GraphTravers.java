 
package Graph;

import java.util.*;

public class GraphTravers {
    /*===============================================================================================================
                                               Graph created using Adjacency List
   ================================================================================================================*/
   static class Graph{ 
       static LinkedList<Integer>[] adj;
       static int v;
       Graph(int v){
           this.v=v;
           adj=new LinkedList[v];
           for(int i=0;i<v;i++){
               adj[i]=new LinkedList<Integer>();
           }
       }
       static void addEdge(int source,int dest){
           adj[source].add(dest);
           adj[dest].add(source);
       }
       static void print(){
           for(int i=0;i<v;i++){
               System.out.print("\nhead "+i+" ");
               for(int j=0;j<adj[i].size();j++){
                   System.out.print("->"+adj[i].get(j));
               }
               System.out.println();
           }
       }
       /*===============================================================================================================
                                               Graph Traversal using BFS(Breadth First Search) is equl to the LevelOrder traverse of A TREE
       Queue data Structure is use
      Time complexity for BFS traverse of Adjacecny List:-O(2E)=  O(E);<<<2E for degree of each node visited but we add only unvisited node in Queue
       Time complexity for BFs traverse of Adjacency Matrix :-O(N^2)
      its use for finding sortest path between 2 nodes 
   ================================================================================================================*/
       public static int bfs(int source,int dest){
           boolean visited[]=new boolean[adj.length];
           int parent[]=new int[adj.length];
           Queue<Integer> q = new LinkedList<>();
           q.add(source);
           parent[source]=-1;
           visited[source]=true;
           while(!q.isEmpty()){
               int curVertix=q.poll();
               if(curVertix==dest) break;
               for(int i=0;i<adj[curVertix].size();i++){
                   if(!visited[adj[curVertix].get(i)]){
                   q.add(adj[curVertix].get(i));
                   visited[adj[curVertix].get(i)]=true;
                   parent[adj[curVertix].get(i)]=curVertix;
                   }
               }
           }
           int cur = dest;
           int distance=-1;
           while(cur!=-1){
               System.out.print(cur+"-> ");
               distance++;
               cur=parent[cur];
           }
           return distance;
           
       }
       /*===============================================================================================================
                                               DFS(Depth First Search)
   ================================================================================================================*/
       static boolean dfs(int src,int dest){
           boolean[] vist=new boolean[adj.length];
           Stack<Integer> s = new Stack<>();
           s.push(src);
           vist[src]=true;
           while(!s.isEmpty()){
               int cur = s.pop();
               if(cur==dest)return true;
               for(int i=0;i<adj[cur].size();i++){
                   if(!vist[adj[cur].get(i)]){
                       vist[adj[cur].get(i)]=true;
                       s.push(adj[cur].get(i));
                   }
               }
               
           }
           return false;
       }
       /*===============================================================================================================
                                               Dfs algo by akash   is equl to the PreOrder  traverse of A TREE
       Stack use
       List=time(O(E));
       Matrix=time(O(N^2):
       to get path is avilabel or not
   ================================================================================================================*/
       static boolean DFS(int src,int dest){
           Stack<Integer> S = new Stack<>();
           boolean vist[]= new boolean[adj.length];
           S.push(src);
           vist[src]=true;
           while(!S.isEmpty()){
               int curNode=S.peek();
               System.out.print("->"+S.peek());
               if(curNode==dest)return true;
               for(int i=0;i<adj[curNode].size();i++){
                   if(!vist[adj[curNode].get(i)]){
                       
                       S.add(adj[curNode].get(i));
                       vist[adj[curNode].get(i)]=true;
                       break;
                   }
                   if(i==adj[curNode].size()-1){
                       S.pop();
                   }
               }
           }
           
           return false;
       }
       
       /*===============================================================================================================
                                               Dfs algo by resursion AKASH
   ================================================================================================================*/
//   under construction
//      static boolean DFSR(int src,int dest){
//           boolean vst[] = new boolean[adj.length];
//           return DFSRHelper (src,dest,vst);
//          
//      }
//          
//    
////    boolean vst[] = new boolean[adj.length];///it will give u an error so use another function to pass the aray each functon call
//      
//   static boolean DFSRHelper(int src,int dest,boolean vst[]){
//       if(src==dest){
//           System.out.println("->"+src);
//           return true;
//       }
//       System.out.print("->"+src);
//       vst[src]=true;
//       for(int i=0;i<adj[src].get(i);i++){
//           if(!vst[adj[src].get(i)]){
//               vst[adj[src].get(i)]=true;
//               DFSR(adj[src].get(i),dest);
//           }
//           if(i==adj[src].size()-1){
//               return DFSR(adj[src].get(i),dest);
//           }
//       }
//       
//      return false;
//   }
       /*===============================================================================================================
                                               Connected Compenent
       Time comlexity ( O(n)+O(E))== O(N+E);
   ================================================================================================================*/
         int count=0;
        int concom(){
            boolean visit[]=new boolean[adj.length];
     
           for(int i=0;i<adj.length;i++){
               if(!visit[i]){
                   cdfs(i,visit);
                   System.out.println();
                   count++;
                 
                   
               }
           }
           return count;
       }
       void cdfs(int src ,boolean visit[]){
           Stack<Integer> s=new Stack<>();
           s.push(src);
           visit[src]=true;
           while(!s.isEmpty()){
               int top=s.peek();
               System.out.print("->"+top);
               for(int i = 0;i<adj[top].size();i++){
                   if(!visit[adj[top].get(i)]){
                       s.push(adj[top].get(i));
                       visit[adj[top].get(i)]=true;
                       break;
                   }
                   if(i==adj[top].size()-1){
                       s.pop();
                   }
               }
           }
       }
}
   
    public static void main(String[] args) {
        Graph G = new Graph(10);
       G.addEdge(0,6);
       G.addEdge(1,2);
       G.addEdge(6,3);
       G.addEdge(6,4);
       G.addEdge(5,3);
              G.addEdge(1,4);
              G.addEdge(2,5);
    G.addEdge(1,5);
    G.addEdge(5,6);
    G.addEdge(7,8);
    G.addEdge(9,9);

//       G.print();
//        System.out.println("destination is : "+G.bfs(5,5));
        System.out.println(G.dfs(0,7));
        System.out.println(G.DFS(0,7));
//                System.out.println(G.DFSR(5,1));
//        System.out.println(G.concom());
        

    }
}
