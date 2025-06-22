package fibonacci;
import fibonacci.utils.*;
public class Generator {
    public static void generate(int n) {
        int a = 0, b = 1;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++) {
            int sum = Add.add(a,b);
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }
    }
}