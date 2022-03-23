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
        int n = In.readInt(); // |V|
        int m = In.readInt(); // |E|
        int r = In.readInt(); // Best friend
        
        
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<n; i++) {
          adj.add(new ArrayList<Integer>());
        }
        
        for(int i=0; i<m; i++) {
          addEdge(adj, In.readInt(), In.readInt());
        }
        
        // You want to check if graph is 2-colorable using BFS
        
        int[] colors = isTwoColorable(adj, n, r);
        if(colors.length == 0) Out.println("no");
        else {
          for(int i=0; i<n; i++) {
            if(colors[i] == colors[r]) {
              Out.print(i + " ");
            }
          }
          Out.println();
        }
        
    }
    
    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int from, int to) {
        
        adj.get(from).add(to);
        adj.get(to).add(from);
            
    }
    
    public static int[] isTwoColorable(ArrayList<ArrayList<Integer>> adj, int n, int r) {
     
      int[] colors = new int[n]; // Array containing the color of each vertex
                                     // either 'R' (red) or 'B' (blue)
      Arrays.fill(colors, -1);
      boolean[] visited = new boolean[n];
      int[] level = new int[n];
      Queue<Integer> queue = new LinkedList<Integer>();
      queue.add(r);
      colors[r] = 0;
      visited[r] = true;
      while(!queue.isEmpty()) { 
      int v = queue.poll();
      for(Integer f : adj.get(v)) {
        if(colors[f] == colors[v]) return new int[0];
        if(!visited[f]) {
          colors[f] = 1 - colors[v];
          visited[f] = true;
          queue.add(f);
        }
      }
    }
    
      
      return colors;
      
    }
}
