import algorithms.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // Uncomment this line if you want to read from a file
        In.open("public/test1.in");
        Out.compareTo("public/test1.out");

        int t = In.readInt();
        for (int i = 0; i < t; i++) {
            testCase();
        }
        
        // Uncomment this line if you want to read from a file
        // In.close();
    }

    public static void testCase() {
        // Input using In.java class
        int n = In.readInt();
        int m = In.readInt();
        final int numVer = 2*(n+1);
        Graph g = new Graph(numVer);
        int total = 0;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i<n; i++) {
          int p = In.readInt();
          int f = In.readInt();
          total += f;
          g.addEdge(n*2, i, p); 
          g.addEdge(i, n*2 + 1, f);
          g.addEdge(i, n+i, p);
          adj.add(new ArrayList<Integer>());
          adj.get(i).add(p);
          adj.get(i).add(f);
        }
        
        for(int i=0; i<m; i++) {
          int u = In.readInt();
          int v = In.readInt();
          g.addEdge(n+u, v, adj.get(u).get(0));
        }
        
        
      final int source = 2*n;
      final int sink = 2*n+1;
      final int maxFlow = g.computeMaximumFlow(source, sink);
      
        
        Out.println(maxFlow == total ? "yes" : "no");
    }
}
