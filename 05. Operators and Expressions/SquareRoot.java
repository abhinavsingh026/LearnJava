import java.util.*;
class SquareRoot {
    public static void main(String[]args) {
        float a,b,c;
        double d,r1,r2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Co-effiencts of x²,x & constant: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        d = Math.sqrt(b*b-4*a*c);
        // r1 = -(b+d)/2*a;
        r2 = -(b-d)/2*a;
        r1 = -(b+Math.sqrt(b*b-4*a*c))/2*a;
        System.out.print("Roots of the Equation is:"+r1+" and "+r2);

    }
}