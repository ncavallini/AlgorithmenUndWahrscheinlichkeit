import algorithms.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // Uncomment this line if you want to read from a file
        // In.open("public/sample.in");
        // Out.compareTo("public/sample.out");

        int t = In.readInt();
        for (int i = 0; i < t; i++) {
            testCase();
        }
        
        // Uncomment this line if you want to read from a file
        // In.close();
    }

    public static void testCase() {
        // Input using In.java class
        int n = In.readInt(); // vertices
        int m = In.readInt(); // edges
        int v = In.readInt(); // start
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<n; i++) {
          adj.add(new ArrayList<Integer>());
        }
        
        for(int i=0; i<m; i++) {
          int a = In.readInt();
          int b = In.readInt();
          adj.get(a).add(b);
          adj.get(b).add(a);
        }
        
        int[] d = getDistance(adj, v);
        for(int i=0; i<n; i++) {
          Out.print(d[i] + " ");
        }
        
        Out.println();
      
        
    }
    
    static int[] getDistance(ArrayList<ArrayList<Integer>> adj, int u) {
      // BFS
      Queue Q = new LinkedList<Integer>();
      int n = adj.size();
      boolean[] visited = new boolean[n];
      int[] distances = new int[n];
      Arrays.fill(distances, -1);
      
      Q.add(u);
      visited[u] = true;
      distances[u] = 0;
      
      while(!Q.isEmpty()) {
        int x = (int)Q.poll();
        
        for(int i=0; i<adj.get(x).size(); i++) {
          if (visited[adj.get(x).get(i)])
                    continue;
      
                distances[adj.get(x).get(i)] = distances[x] + 1;
                Q.add(adj.get(x).get(i));
                visited[adj.get(x).get(i)] = true;
            }
        }
      
      
      return distances;
      
      
    } 
}
