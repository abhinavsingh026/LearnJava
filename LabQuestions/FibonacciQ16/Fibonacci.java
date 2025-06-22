package FibonacciQ16;
public class Fibonacci {
    public static void generate(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci series up to "+n+" terms: ");
        for (int i = 1; i <= n; i++) {
        System.out.print(a+ " ");
        int c = a + b;
        a = b;
        b = c;
        }  
    System.out.println();
    }
}