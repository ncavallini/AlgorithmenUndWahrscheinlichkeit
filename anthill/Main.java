import algorithms.*;

class Main {
  private final static int MAX = 500;
    public static void main(String[] args) {
        // Uncomment this line if you want to read from a file
      In.open("public/test2.in");
      Out.compareTo("public/test2.out");

        int t = In.readInt();
        for (int i = 0; i < t; i++) {
            testCase();
        }
        
       In.close();
    }

    public static void testCase() {
        // Input using In.java class
        int n = In.readInt();
        int s = In.readInt();
        int d = In.readInt();
        Graph g = new Graph (n);

        for (int i = 0; i < s; i++) {
          int u = In.readInt();
          int v = In.readInt();
          g.addEdge(u, v, MAX);
          g.addEdge(v, u, MAX);
        }
        
        for (int i = 0; i < d; i++) {
          int u = In.readInt();
          int v = In.readInt();
          g.addEdge(u, v, 1);
          g.addEdge(v, u, 1);
        }
           
        int maxFlow = g.computeMaximumFlow(0, n- 1);

        int sun = maxFlow / MAX;
        int shade = maxFlow % MAX; 

        Out.println(sun + " " + shade);
    }
}
