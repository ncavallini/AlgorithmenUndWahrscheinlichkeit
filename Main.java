import algorithms.*;
import java.util.*;

class Main {
  public static void main(String[] args) {

    // Uncomment this line if you want to read from a file
    // In.open("public/test3.in");
    // Out.compareTo("public/test3.out");
    int t = In.readInt();

    // Iterate over the testcases and solve the problem
    for (int i = 0; i < t; i++) {
      testCase();
    }
  }

  public static void testCase() {

    int n = In.readInt();

    HashMap<String, ArrayList<String>> adj = new HashMap<String, ArrayList<String>>();
    HashMap<String, Integer> inDeg = new HashMap<String, Integer>();
    HashMap<String, Integer> outDeg = new HashMap<String, Integer>();

    for (int i = 0; i < n; i++) {
      String word = In.readWord(); //xyz
      String slice1 = word.substring(0, 2); //xy
      String slice2 = word.substring(1, 3); //yz
      
     

      if (!outDeg.containsKey(slice1) && !inDeg.containsKey(slice1)) {
        outDeg.put(slice1, 0);
        inDeg.put(slice1, 0);
      }
      if (!slice1.equals(slice2) && !outDeg.containsKey(slice2) && !inDeg.containsKey(slice2)) {
        outDeg.put(slice2, 0);
        inDeg.put(slice2, 0);
      }

      if (adj.containsKey(slice1) && !slice1.equals(slice2)) {
        adj.get(slice1).add(slice2);

        outDeg.put(slice1, outDeg.get(slice1) + 1);

        inDeg.put(slice2, inDeg.get(slice2) + 1);

        if (!adj.containsKey(slice2)) {
          adj.put(slice2, new ArrayList<String>());
        }

      } else {
        adj.put(slice1, new ArrayList<String>());

        if (!slice1.equals(slice2) && !adj.containsKey(slice2)) {
          adj.put(slice2, new ArrayList<String>());
          adj.get(slice1).add(slice2);

          outDeg.put(slice1, outDeg.get(slice1) + 1);

          inDeg.put(slice2, inDeg.get(slice2) + 1);
        } else if (!slice1.equals(slice2) && adj.containsKey(slice2)) {
          adj.get(slice1).add(slice2);

          outDeg.put(slice1, outDeg.get(slice1) + 1);

          inDeg.put(slice2, inDeg.get(slice2) + 1);
        }

      }

    } 


    int starts = 0;
    int ends = 0;
    int zeros = 0;
    int hasSameDegree = 0;

    Set set = adj.entrySet();
    Iterator iterator = set.iterator();
    while (iterator.hasNext()) {
      Map.Entry entry = (Map.Entry) iterator.next();
      String node = (String) entry.getKey();

      if (outDeg.get(node) == inDeg.get(node) + 1) {
        starts++;
      } else if (inDeg.get(node) == outDeg.get(node) + 1) {
        ends++;
      } else if (outDeg.get(node) == 0 && inDeg.get(node) == 0) {
        zeros++;
      }

      if ((outDeg.get(node) - inDeg.get(node)) == 0) {
        hasSameDegree++;
      }
    }

    if (starts == 1 && ends == 1 && hasSameDegree == adj.size() - 2) {
      Out.println("yes");
    } else if (starts > 1 || ends > 1) {
      Out.println("no");
    } else if (starts == 0 && ends == 0 && adj.size() > 1) {
      Out.println("no");
    } else if (starts == 0 && ends == 0 && adj.size() < 2) {
      Out.println("yes");
    }

  }

}
