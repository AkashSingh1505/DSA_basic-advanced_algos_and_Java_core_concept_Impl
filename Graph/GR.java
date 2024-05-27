
package Graph;

import java.util.LinkedList;
import java.util.Queue;


public class GR {
    static LinkedList<Integer>[] adjList;
    static int v;
    GR(int v){
        this.v= v;
        adjList=new LinkedList[v];
        for(int i=0;i<v;i++){
            adjList[i]=new LinkedList();
        }
    }
    static void addEdge(int src,int dest){
        adjList[src].add(dest);
        adjList[dest].add(src);
    }
    static void print(){
        for(int i=0;i<v;i++){
               System.out.print("\nhead "+i+" ");
               for(int j=0;j<adjList[i].size();j++){
                   System.out.print("->"+adjList[i].get(j));
               }
               System.out.println();
        }
    }
    static int bfs(int src,int dest){
        boolean visit[]=new boolean[v];
        int parent[]=new int[v];
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        visit[src]=true;
        parent[src]=-1;
        while(!q.isEmpty()){
            int temp = q.poll();
            if(temp==dest)break;
            for(int i = 0;i<adjList[temp].size();i++){
                int n =adjList[temp].get(i);
                if(!visit[n]){
                    q.add(n);
                    visit[n]=true;
                    parent[n]=temp;
                }
            }
        }
        int c = dest;
        int len=0;
        while(c!=src){
            len++;
            System.out.print(c+"->");
            c=parent[c];
        }
        
        return len;
    }
    
    public static void main(String args[]) {
        GR Graph = new GR(6);
        addEdge(0, 3);
        addEdge(0, 1);
        addEdge(0, 4);
        addEdge(1, 2);
        addEdge(2, 5);
        addEdge(4, 5);
        print();
        int n=bfs(3, 5);
        System.out.println("length is : "+n);
        
    }
}
