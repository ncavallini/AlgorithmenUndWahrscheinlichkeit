import algorithms.*;

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
        int k = In.readInt();
        
        double[] p = new double[n+1];
        double[][] dp = new double[n+1][n+1];
        dp[0][0] = 1.0d;
        double result = 0.0d;
        
        for(int i=1; i<=n; i++) {
          p[i] = In.readDouble();
        }
        

        for(int i=0; i<=n; i++) {
          for(int j=0; j<=n; j++) {
            if(i == j && i == 0) dp[i][j] = 1.0d;
            else if(i == 0) dp[i][j] = 0.0d;
            else if(j == 0) dp[i][j] = dp[i-1][j] * (1.0d-p[i]);
            else dp[i][j] = dp[i-1][j-1] * p[i] + dp[i-1][j] * (1.0d-p[i]);
            
          }
        }
        // Output using Out.java class
        
        for(int i=k; i<=n; i++) {
          result += dp[n][i];
        }
        
        
        Out.println(formatDouble(result, 3));        
    }
    
    private static String formatDouble(double d, int decimals) {
      Double D = Double.valueOf(d);
      String s = D.toString();
      String f = "%." + decimals + "f";
      return String.format(f, D);
    }
}
