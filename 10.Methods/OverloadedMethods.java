import java.util.Scanner;
import java.lang.Math;
class OverloadedMethods {
// Overloaded Methods to Calculate Area //
    static float area(int a) {   // Area of Square //
        return a*a;
    }
    static float area(float l,float b) {   // Area of Rectangle //
        float ar = l*b;                    // Area of Parallelogram //
        return ar;
    }
    static float area(float a,float b,float h) {    // Area of Trapezium //
        return ((a+b)*h)/2;
    }
    static float area(float r) {   // Area of Circle //
        return (float)Math.PI*r*r; // Math.PI is double so type casting
    }
// Overloaded Methods to Reverse an Integer and Array //
    static int reverse(int num) {
        int rem;
        int n=0;
        while(num>0) {
        rem = num%10;
        n = n*10+rem;
        num = num/10;
        }
        return n;
    }
    static int[] reverse(int A[]) {
        int B[] = new int[A.length];
        for(int i=A.length-1,j=0;i>=0;i--,j++) {
            B[j] = A[i];
        }
        for(int x:B)
            System.out.print(x+" ");
        System.out.println();
        return B;
    }
// Overloaded Methods to validate name and age //
    boolean validate(String name) {
        return name.matches("[a-zA-Z]+");
    }
    boolean validate(int age) {
        if(age>3 && age<=8) return true;
            else return false;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of Square: ");
        int side = sc.nextInt();
        System.out.println("Area of Square is: "+area(side));

        System.out.print("Enter Length and Breadth of Rectangle: ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        System.out.println("Area of Rectangle is: "+area(length,breadth));

        System.out.print("Enter width and height of Parallelogram: ");
        float width = sc.nextInt();
        float height = sc.nextInt();
        System.out.println("Area of Parallelogram is: "+area(width,height));

        System.out.print("Enter both bases and height of Trapezium: ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float h = sc.nextFloat();
        System.out.println("Area of Trapezium is: "+area(a,b,h));

        System.out.print("Enter Radius of the Circle: ");
        float radius = sc.nextFloat();
        System.out.println("Area of Circle is: "+area(radius));

        System.out.print("Enter a No. to get it's reverse: ");
        int num = sc.nextInt();
        System.out.println(reverse(num));

        int X[] = {4,5,6,7,8};
        System.out.println("Normal array is:- ");
        for(int x:X) 
            System.out.print(x+" ");
        System.out.println();
        System.out.println(reverse(new int[]{4,5,6,7,8}));

        OverloadedMethods obj = new OverloadedMethods();
        System.out.print("Enter Username: ");
        String username = sc.nextLine();
        System.out.println(obj.validate(username));

        System.out.print("Enter age of child: "); // Age between 6 and 8 is true here //
        int age = sc.nextInt();
        System.out.println(obj.validate(age));
    }
}