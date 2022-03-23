import algorithms.*;
import java.util.*;
class Main {
    public static void main(String[] args) {
        // Uncomment this line if you want to read from a file
        // In.open("public/test2.in");
        // Out.compareTo("public/test2.out");

        int t = In.readInt();
        for (int i = 0; i < t; i++) {
            testCase();
        }
        
        // Uncomment this line if you want to read from a file
        // In.close();
    }

    public static void testCase() {
        // Input using In.java class
        int k = In.readInt();
        HashSet<Integer> nums = new HashSet<>();
        
        for(int i=0; i<k; i++) {
          nums.add(In.readInt());
        }
        

        // System.out.println(getPowerSet(nums));
       Out.println(count(nums));
        
        
        
        // Output using Out.java class
    }
    
    public static HashSet<HashSet<Integer>> getPowerSet(HashSet<Integer> nums) {
      HashSet<HashSet<Integer>> powerSet = new HashSet<HashSet<Integer>>();
      ArrayList<Integer> list = new ArrayList(nums);
      int k = list.size();
      for(long i=1; i< (1 <<k); i++) {
        HashSet<Integer> set = new HashSet<Integer>();
        for(int j=0; j<k; j++) {
          if((i >> j) % 2 == 1) set.add(list.get(j));
        }
        powerSet.add(set);
      }
      return powerSet;
    }
    
    public static long count(HashSet<Integer> nums) {
      long res = (long)Math.pow(10.0d,10.0d);
      long max = (long)Math.pow(10.0d,10.0d);
      
      HashSet<HashSet<Integer>> powerSet = getPowerSet(nums);
      
      for(HashSet set : powerSet) {
        int size = set.size();
        int factor = size % 2 == 0 ? 1 : -1;
        res = res + factor * (long)Math.floor(max/lcm(set));
      }
      
      return res;
    }
    
    public static long lcm(HashSet<Integer> set) {
      ArrayList<Integer> list = new ArrayList<Integer>(set);
      long lcm = list.get(0);
      for(int i=1; i<list.size(); i++) {
        lcm = (lcm * list.get(i))/Algorithms.gcd(lcm, list.get(i));
      }
      return lcm;
    }
    
   
} // end class
