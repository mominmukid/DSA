import java.util.*;

public class Graph {
   public static class edge {
      int src;
      int ds;
      int wt;

      edge(int s, int d, int w) {
         this.src = s;
         this.ds = d;
         this.wt = w;
      }
   }

   public static void creatgraph(ArrayList<edge> graph[]) {
      for (int i = 0; i < graph.length; i++) {
         graph[i] = new ArrayList<>();
      }
      // graph[0].add(new edge(0, 1, 1));
      // graph[0].add(new edge(0, 2, 1));

      // graph[1].add(new edge(1, 3, 1));
      // graph[1].add(new edge(1, 0, 1));

      // graph[2].add(new edge(2, 0, 1));
      // graph[2].add(new edge(2, 4, 1));

      // graph[3].add(new edge(3, 1, 1));
      // graph[3].add(new edge(3, 4, 1));
      // graph[3].add(new edge(3, 5, 1));

      // graph[4].add(new edge(4, 3, 1));
      // graph[4].add(new edge(4, 2, 1));
      // graph[4].add(new edge(4, 5, 1));

      // graph[5].add(new edge(5, 3, 1));
      // graph[5].add(new edge(5, 4, 1));
      // graph[5].add(new edge(5, 6, 1));

      // graph[6].add(new edge(6, 5, 1));

     


      // un cyclic grapg

      // graph[0].add(new edge(0, 1, 1));
      // graph[0].add(new edge(0, 2, 1));

      // graph[1].add(new edge(1, 3, 1));

      // graph[2].add(new edge(2, 4, 1));
      // graph[2].add(new edge(2, 6, 1));

      // cyclic grap  
      // graph[1].add(new edge(1, 0, 1));
      // graph[1].add(new edge(1, 2, 1));

      // graph[0].add(new edge(0, 1, 1));
      // graph[0].add(new edge(0, 2, 1));
      // graph[0].add(new edge(0, 3, 1));


      // graph[2].add(new edge(2, 1, 1));
      // graph[2].add(new edge(2, 0, 1));

      // graph[3].add(new edge(3, 0, 1));
      // graph[0].add(new edge(3, 4, 1));



      // uncycle graph 

      // graph[0].add(new edge(0, 1, 1));
      // graph[0].add(new edge(0, 2, 1));
      // graph[0].add(new edge(0, 3, 1));

      //  non bartite graph
        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));

        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));

        graph[3].add(new edge(3, 1, 1));
      //   graph[3].add(new edge(3, 4, 1));

        graph[4].add(new edge(4, 2, 1));
      //   graph[4].add(new edge(4, 3, 1));



   }

   // public static void BFS(ArrayList<edge>[] graph) {
   //    boolean vis[] = new boolean[graph.length];
   //    for (int i = 0; i < graph.length; i++) {
   //       if (!vis[i]) {
   //          BFSUtil(graph, vis);
   //       }
   //    }
   // }

   // public static void BFSUtil(ArrayList<edge> graph[], boolean visited[]) {
   //    Queue<Integer> q = new LinkedList<>();
   //    q.add(0);
   //    while (!q.isEmpty()) {
   //       int curr = q.remove();
   //       if (!visited[curr]) {
   //          System.out.print(curr + " ");
   //          visited[curr] = true;
   //          for (int i = 0; i < graph[curr].size(); i++) {
   //             edge e = graph[curr].get(i);
   //             q.add(e.ds);
   //          }
   //       }

   //    }

   // }

   // public static void DFS(ArrayList<edge> graph[]) {
   //    boolean vis[] = new boolean[graph.length];
   //    for (int i = 0; i < graph.length; i++) {
   //       if (!vis[i]) {
   //          DFSUtil(graph, i, vis);

   //       }
   //    }
   // }

   // public static void DFSUtil(ArrayList<edge> graph[], int curr, boolean vis[]) {
   //    System.out.print(curr + " ");
   //    vis[curr] = true;
   //    for (int i = 0; i < graph[curr].size(); i++) {
   //       edge e = graph[curr].get(i);
   //       if (!vis[e.ds]) {
   //          DFSUtil(graph, e.ds, vis);
   //       }
   //    }

   // }

   // public static boolean hasPath(ArrayList<edge> graph[], int dest, int src, boolean vis[]) {

   //    if (src == dest) {
   //       return true;
   //    }
   //    vis[src] = true;
   //    for (int i = 0; i < graph[src].size(); i++) {
   //       edge e = graph[src].get(i);
   //       if (!vis[e.ds] && hasPath(graph, dest, e.ds, vis)) {
   //          return true;
   //       }

   //    }
   //    return false;
   // }

   // public static boolean isCycle(ArrayList<edge>graph[],int curr,boolean vis[]){
   //    if(vis[curr]){
   //       return true;
   //    }
   //    vis[curr]=true;
   //    for (int i = 0; i < graph[curr].size(); i++) {
   //       edge e = graph[curr].get(i);
         
   //          return isCycle(graph, e.ds, vis);
      
   //    }
   //    return false;
   // }

   public static boolean isBartite(ArrayList<edge>graph[]){
      // boolean vis[] = new boolean[graph.length];
      int col[]=new int [graph.length];
     Arrays.fill(col, -1);
      Queue<Integer>q=new LinkedList<>();
      for (int i = 0; i < graph.length; i++) {
        if(col[i]==-1){
         q.add(i);
         col[i]=0;
         while (!q.isEmpty()) {
            int curr=q.remove();
            for(int j=0;j<graph[curr].size();j++){
               edge e=graph[curr].get(j);
               if(col[e.ds]==-1){
                  int nextcol=col[curr]==0?1:0;
                  col[e.ds]=nextcol;
                  q.add(e.ds);

               }else if(col[curr]==col[e.ds]){
                  return false;
               }
            }
         }
        }
      }
      return true;
   }
  
   public static void main(String[] args) {

      int v = 7;
      ArrayList<edge>[] graph = new ArrayList[v];
      creatgraph(graph);
      // DFS(graph,0,new boolean[v]);
      // System.out.println(hasPath(graph, 5, 0, new boolean[v]));
      // DFS(graph);

      // int arr[]={2,2,1,2,1};
      // System.out.println(maxNum(arr));
    
      System.out.println(isBartite(graph));
     

   }

}
