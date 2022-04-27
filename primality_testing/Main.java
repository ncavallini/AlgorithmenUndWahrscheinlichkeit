import algorithms.*;
import java.math.BigInteger;
import java.util.*;
class Main {
  private static final int NUM_ITERATIONS = 100;
    public static void main(String[] args) {
        int t = In.readInt();
        for (int i = 0; i < t; i++) {
            testCase();
        }
    }

    public static void testCase() {
        // Input using In.java class
        long n = In.readLong();
      
        // Output using Out.java class
        String answer = isPrime(n) ? "yes" : "no";
        Out.println(answer);
        // try {Thread.sleep(50);}
        // catch (Exception e) {}
    }
    
    private static boolean isPrime(long n) {
      
      if(n == 0 || n == 1) return false;
      if(n == 2) return true;
      if(n % 2 == 0) return false;
      
      long d = n - 1;
      while(d % 2 == 0) {
        d/=2;
      }
      
      Random rand = new Random();
      for(int i=0; i<NUM_ITERATIONS; i++) {
        long r = Math.abs(rand.nextLong());
        long a = r % (n-1) + 1;
        long t = d;
        BigInteger N = BigInteger.valueOf(n);
        BigInteger A = BigInteger.valueOf(a);
        BigInteger T = BigInteger.valueOf(t);
        BigInteger MP = A.modPow(T, N); // MP = modPow
        BigInteger NMinusOne = N.subtract(BigInteger.ONE);
        while(!(T.equals(NMinusOne)) && !MP.equals(BigInteger.ONE) && !MP.equals(NMinusOne)) {
          MP = MP.modPow(BigInteger.TWO, N);
          T = T.multiply(BigInteger.TWO);
        } // end while
        
        if(!MP.equals(NMinusOne) && T.mod(BigInteger.TWO).equals(BigInteger.ZERO)) {
          return false;
        } // end if
      } // end for
    return true;
  } // end isPrime() 
} // end class
