import java.util.Scanner;
public class StudentChallenge {
    public static void main(String []args) {
        Arithmetic obj = new Arithmetic();
        obj.apseries();
        Geometric obj1 = new Geometric();
        obj1.gpseries();
        Fibonacci obj2 = new Fibonacci();
        obj2.fiboseries();
    }
}
class Arithmetic {
    void apseries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print A.P. Series:-");
        System.out.print("Enter 1st No. of series: ");
        int num = sc.nextInt();
        System.out.print("Enter common difference no. of series: ");
        int diff = sc.nextInt();
        System.out.print("Enter No. of Numbers you want to display: ");
        int totalnum = sc.nextInt();
        for(int i=1;i<=totalnum;i++) {
            System.out.print(num+",");
            num += diff;
        }
        System.out.println();
    }
}
class Geometric {
    void gpseries() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program to print G.P. Series:-");
        System.out.println("Enter 'a','r' and 'n': ");
        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            System.out.print(a+",");
            a=a*r;
        }
        System.out.println();
    }
}
class Fibonacci {
    void fiboseries() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Program to display Fibonacci Series:-");
        int num = sc.nextInt();
        int a=0,b=1;
        int c;
        System.out.print(a+","+b+",");
        for(int i=1;i<=num-2;i++) {
            c = a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }

}