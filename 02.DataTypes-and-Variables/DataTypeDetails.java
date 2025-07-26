import java.util.*;
class DataTypeDetails {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal No. : ");
        int n = sc.nextInt();
        System.out.println("Given No. in Binary is: "+Integer.toBinaryString(n));
        System.out.println("Given No. in Octal is: "+Integer.toOctalString(n));
        System.out.println("Given No. in Hexadecimal is: "+Integer.toHexString(n));
    }
}