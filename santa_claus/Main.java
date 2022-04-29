import algorithms.*;

class Main {

    public static void main(String[] args) {
        // In.open("public/test1.in");
        // Out.compareTo("public/test1.out");
        
        // Read the number of testcases to follow
        int t = In.readInt();

        // Iterate over the testcases and solve the problem
        for (int i = 0; i < t; i++) {
            testCase();
        }
    }

    public static void testCase() {
        // Read the input
      int n = In.readInt();
      int m = In.readInt();
      Out.println(solve(n,m) ? "yes" : "no");
    }
    
    private static boolean solve(int n, int m) {
      if(n == 0 && m == 0) return false; // Graph is empty
      int numPresent = 0; // total number of toys
      int V = n+m+2; // Vertices are children + type of toys + 2 (to avoid self-loops)
      Graph g = new Graph(V); 

    for (int i = 1; i < n + 1; i++) {
      int d = In.readInt();
      g.addEdge(0, i, d); // 0 == source. Each kid can get max. d toys (capacity)
      numPresent = numPresent + d;
      for (int j = n+1; j < V-1; j++) {
        g.addEdge(i,j,1);
      }
    }
    
    for (int i = n+1; i < V-1; i++) {
      int c = In.readInt();
      g.addEdge(i, n+m+1, c);
    }
    int flow = g.computeMaximumFlow(0, V-1); // V-1 == sink
    
      return flow == numPresent;
    }

}
