import java.util.Scanner;
public class StudentChallenge {
    public static void main(String []args) {
        DisplayDigits obj = new DisplayDigits();
        obj.digitdisplay();
        ReverseNumber obj1 = new ReverseNumber();
        obj1.numbereverse();
    }
}
class DisplayDigits {
    void digitdisplay() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int num2 = num;
        int rem = 0, count = 0;
        int sum = 0;
        System.out.println("Digits of the No. are:- ");
        while(num>0) {
            rem = num%10;
            sum = sum+(rem*rem*rem);
            num = num/10;
            count++;
            System.out.println(rem);
        }
        System.out.println("Count of digits in the number is: "+count);
        System.out.println("num value after loop: "+num); // num = 0 after the loop
        if(sum == num2)
            System.out.println(num2+" is a Armstrong Number"); //Ex - 153, 370, 371
        else
            System.out.println(num2+" is not a Armstrong Number");
    }
}
class ReverseNumber {
    void numbereverse() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number for Reversing: ");
        int num = sc.nextInt();
        int num2 = num;
        int rev = 0, rem = 0;
        while(num>0) {
            rem = num%10;
            rev = (rev*10)+rem;
            num = num/10;
        }
        System.out.println(rev);
        if(num2 == rev)
            System.out.println("The No is a Palindrome");
        else
            System.out.println("The No is not a palindrome");
    }
}