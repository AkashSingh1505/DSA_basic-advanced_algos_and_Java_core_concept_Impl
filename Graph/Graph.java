/*
Graph:- 
        Graph is a non linear data structure it is a set of vertices/nodes and set of Edges which connect two vertices ,edge work as a
        Linker it is write as G(V,E) where V{non empty finite set of vertices} and E{non empty finite set of edges}
        
        why we need a graph :-
                                we already have a non linear data structure Tree which but its have some limitation like in Tree 
                                it is not possible that every node connected to each and every node(Ex : root node cannot be the
                                child of its own leaf/or its child node.
                                But:-
                                    in Complte Graph(type of a graph) each node connect to every node

        There are lots of term we need to know first to understsand the graph(i am refering internet or pdf in my pc for it)
        
        Graph Representation in memory:_
                                        0. Sequencial Array(1D array of size (n+2e+1))
                                        1. Adjacecncy Matrix(Sequencial repr..)
                                        2. Adjacency List

*/
package Graph;

import java.util.ArrayList;
import java.util.LinkedList;


public class Graph {
    
    /*===============================================================================================================
                                               ADJACENCY MATRIX
    For Adjacency matrix we use 2d Array which size N*N (N=number of vertices in the graph)
        Directed Graph(Digraph): get the un_symatric matix
        UnDirected Graph: get Symatric matrix
    sapce and Timcomplexity( O(n^2) )
    ADT( create(),addEdge(),deleteedge(),deleteNode()....
   ================================================================================================================*/
    
    static class AdjencyMatrix{
        static int[][] create(int n){
            return new int[n][n];
        }
        static void addEdge(int arr[][],int i,int j){
            arr[i][j]=1;
            arr[j][i]=1;//because this is an undirected graph
        }
        static void print(int arr[][]){
            for(int i=0;i<arr.length;i++){
                System.out.print("head  "+i+" : ");
                for(int j=0;j<arr.length;j++){
                    System.out.print(arr[i][j]+"->");
                }
                System.out.println();
            }
        }
    }

    static class AdjacencyList{
    /*===============================================================================================================
                                               ADJACENCY LIST
    For Adjacency List we can use Linked list or ArrayList 
        ArrayList and LinkedList both are dynamic lis but linked list is more memory efficient cause of pointer were arraylist will use sequencial memory
       
    for Arraylist Graph we need to make ArrayList<ArrayList<Integer>>   (Arraylist which store anothe arraylist)
    for LinkedList Graph we need to make LinkedList(LinkedList<Integer>> (LinkedList which store another Linked list)
    
    space and time complexity of Adjacency List is O(n)
    
    here i am going to use java collection frame work we can also make with own
  
   ================================================================================================================*/
    
//     By ArrayList: 
        static class ArrayListGraph{
            static ArrayList<ArrayList<Integer>> create(int n){
                ArrayList<ArrayList<Integer>> AL = new ArrayList<>();
                for(int i=0;i<n;i++){
                    AL.add(new ArrayList<Integer>());
                }
                return AL;
            }
            static void addEdge(ArrayList<ArrayList<Integer>> AL,int i,int j){
                AL.get(i).add(j);
                AL.get(j).add(i);
            }
   
            static void print(ArrayList<ArrayList<Integer>> AL){
                for(int i=0;i<AL.size();i++){
                    System.out.print(" \nhead "+i+" : ");
                    for(int j=0;j<AL.get(i).size();j++){
                        System.out.print("->"+AL.get(i).get(j));
                        
                    }
                    System.out.println();
                }
            }
        }     
      

// By LinkedList
        static class LinkedListGraph{
            static LinkedList<LinkedList<Integer>> create(int v){
                LinkedList<LinkedList<Integer>> LL = new LinkedList<>();
                for(int i =0;i<v;i++){
                    LL.add(new LinkedList<Integer>());
                }
                return LL;
            }
            static void addEdge(LinkedList<LinkedList<Integer>> LL,int i,int j){
                LL.get(i).add(j);
                LL.get(j).add(i);
            }
            static void print(LinkedList<LinkedList<Integer>> LL){
                for(int i=0;i<LL.size();i++){
                    System.out.print(" \nhead "+i+" : ");
                    for(int j=0;j<LL.get(i).size();j++){
                        System.out.print("->"+LL.get(i).get(j));

                    }
                    System.out.println();
                }
            }
        }
                
    }
    static class LinkedListArray{
       private static  LinkedList<Integer> [] adj;
       static int v;
       LinkedListArray(int v){
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
               System.out.print("\nhead "+i+" : ");
               for(int j=0;j<adj[i].size();j++){
                    System.out.print("->"+adj[i].get(j));
                   
               }
           }
       }
    }
    public static void main(String[] args) {
        
// ***************************************       Adjacency Matrix work********************
        int V1 = 4;
        int arr[][];
      AdjencyMatrix G = new AdjencyMatrix();
        arr=G.create(V1);
        G.addEdge(arr,0,1);
        G.print(arr);


// ***************************************       Adjacency List work********************

      AdjacencyList.ArrayListGraph GAL =new AdjacencyList.ArrayListGraph();
      AdjacencyList.LinkedListGraph GLL =new AdjacencyList.LinkedListGraph();
      int V=5;
      ArrayList<ArrayList<Integer>> AL;
      LinkedList<LinkedList<Integer>> LL;

        
//       ArrayList graph method          
      AL=GAL.create(V);
      GAL.addEdge(AL,1,2);
      GAL.addEdge(AL,0,3);
      GAL.addEdge(AL,1,3);
      GAL.addEdge(AL,2,4);
      GAL.addEdge(AL,3,3);
      GAL.print(AL);
      
      //Linkedlist graph mehtod
 
      LL=GLL.create(V);
      GLL.addEdge(LL,1,2);
      GLL.addEdge(LL,0,3);
      GLL.addEdge(LL,1,3);
      GLL.addEdge(LL,2,4);
      GLL.addEdge(LL,3,3);
      GLL.print(LL);
      
      
      
      //LinkedListArray graph
      
      LinkedListArray LA = new LinkedListArray(5);
      LA.addEdge(1,2);
      LA.addEdge(0,3);
      LA.addEdge(1,3);
      LA.addEdge(2,4);
      LA.addEdge(3,3);
      LA.print();
    }
}
