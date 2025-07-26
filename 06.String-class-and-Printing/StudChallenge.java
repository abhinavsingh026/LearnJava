import java.util.Scanner;
public class StudChallenge {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer for Binary: ");
        String str1 = Integer.toBinaryString(sc.nextInt());
        System.out.println(str1);
        System.out.print("Enter Integer for HexaDecimal: ");
        String str2 = Integer.toHexString(sc.nextInt());
        System.out.println(str2);
    }
}