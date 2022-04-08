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
        double p = In.readDouble();
        double E = (double) Algorithms.binom(n, 3) * p*p*p;
        double V = E + 12 * Algorithms.binom(n,4) * Math.pow(p, 5) + 30 * Algorithms.binom(n, 5) * Math.pow(p, 6) + 20 * Algorithms.binom(n, 6) * Math.pow(p, 6) - (E*E);
        
        
        // Output using Out.java class
        Out.println(E + " " + V);
    }
}
