import java.util.Scanner;
class Question5 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Decimal Number: ");
        int n = sc.nextInt();
        System.out.print("The Given No. in Binary is: "+Integer.toBinaryString(n));
    }
}