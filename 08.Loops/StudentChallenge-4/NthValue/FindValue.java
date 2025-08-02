import java.util.Scanner;
public class FindValue {
    public static void main(String []args) {
        ArithmeticValue obj = new ArithmeticValue();
        obj.apseriesvalue();
        GeometricValue obj1 = new GeometricValue();
        obj1.gpseriesvalue();
        FibonacciValue obj2 = new FibonacciValue();
        obj2.fiboseriesvalue();
    }
}
class ArithmeticValue {
    void apseriesvalue() {
        System.out.println("Program to Find Nth value of A.P. Series");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first No. (a): ");
        int a = sc.nextInt();
        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();
        System.out.print("Enter Position of the No. : ");
        int n = sc.nextInt();
        System.out.println("The No. at "+n+" Position is: "+(a+(n-1)*d));
    }
}
class GeometricValue {
    void gpseriesvalue() {
        System.out.println("Program to Find Nth value of G.P. Series");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first No. (a): ");
        int a = sc.nextInt();
        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();
        System.out.print("Enter Position of the No. : ");
        int n = sc.nextInt();
        System.out.println("The No. at "+n+" Position is: "+(int)(a*Math.pow(r,n-1)));
    }
}
class FibonacciValue {
    void fiboseriesvalue() {
        System.out.println("Program to Find Nth value of Fibonacci Series");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Position of the No. : ");
        int n = sc.nextInt();
        if(n==0 || n==1)
            System.out.println("The No. at "+n+" Position is: "+n);
        else 
            System.out.println("The No. at "+n+" Position is: "+((n-2)+(n-1)));
    }
}