import algorithms.*;


class Main {
  
  private static final int INF = 10_000;
  
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
        int r = In.readInt();
        int a = In.readInt();
        int zoo = In.readInt();
        int hq = In.readInt();
        
        Graph g = new Graph(n);
        for(int i=0; i<m; i++) {
          int u = In.readInt();
          int v = In.readInt();
          int k = In.readInt();
          g.addEdge(u, v, k);
        }
        
        for(int i=0; i<r; i++) {
          g.addEdge(In.readInt(), In.readInt(), INF);
        }
        
        int aToZ = g.computeMaximumFlow(a, zoo);
        int zToHq = g.computeMaximumFlow(zoo, hq);
        // System.out.println(aToZ);
        // System.out.println(zToHq);
        
        int ans = 0;
        if(aToZ <= INF && zToHq < INF) ans = Math.min(aToZ, zToHq);
        else if(aToZ >= INF && zToHq < INF) ans = zToHq;
        else if(aToZ < INF && zToHq >= INF) ans = aToZ;
        else ans = -1;
        

        // Output using Out.java class
        Out.println(ans == -1 ? "RICH" : ans);
    }
}
