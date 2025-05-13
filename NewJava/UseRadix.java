import java.lang.*;
import java.util.Scanner;
class UseRadix {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number:- ");
        sc.useRadix(2);
        //The no. given in radix is the base of that number system and it will auto convert into integer since there is nextInt(); Ex-1010 output - 10(in decimal system)
        int x = sc.nextInt();
        System.out.println(x);
    }
}