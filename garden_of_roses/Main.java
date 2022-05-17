import algorithms.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // Uncomment this line if you want to read from a file
 //       In.open("public/test1.in");
 //       Out.compareTo("public/test1.out");

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
        ArrayList<Point> roses = new ArrayList<>(n);
        ArrayList<Point> weeds = new ArrayList<>(m);
        
        for(int i=0; i<n; i++) {
          roses.add(new Point(In.readInt(), In.readInt()));
        }
        
        for(int i=0; i<m; i++) {
          weeds.add(new Point(In.readInt(), In.readInt()));
        }
        
        // Output using Out.java class
        
        ArrayList<Point> hull = convexHull(roses, n);
        solve(hull, weeds);
    }
    
    
    public static void solve(ArrayList<Point> hull, ArrayList<Point> weeds) {
      for(Point weed : weeds) {
        Out.print(checkIsInside(weed, hull) ? "y" : "n"); 
      }
      Out.println();
    }
    
    public static boolean checkIsInside(Point weed, ArrayList<Point> hull) {
      for(int i=0; i<hull.size() - 1; i++) {
        if(orientation(weed, hull.get(i), hull.get(i+1)) == 1) return false;
      }
      return true;
    }
    
    public static ArrayList<Point> convexHull(ArrayList<Point> P, int n) {
      ArrayList<Point> hull = new ArrayList<>();
      
      int l = 0;
      for(int i=1; i<n; i++) {
        if(P.get(i).x < P.get(l).x) l = i;
      }
      
      int p = l;
      int q = 0;
      do {
        hull.add(P.get(p));
        q = (p + 1) % n;
        for(int i=0; i<n; i++) {
          if(orientation(P.get(p), P.get(i), P.get(q)) == 2) q = i;
        }
        p = q;
      } while(p != l);
      hull.add(P.get(l));
      return hull;
    }
    
    public static int orientation(Point p, Point q, Point r) {
      // returns 0 if p, q, r are collinear
      // returns 1 if p, q, r are clockwise
      // returns 2 if p, q, r are counter-clockwise
      
      int det = (q.y - p.y) * (r.x - q.x) -
                  (q.x - p.x) * (r.y - q.y);
                  
      if(det == 0) return 0;
      return (det > 0) ? 1 : 2;
    }
    
  
}
