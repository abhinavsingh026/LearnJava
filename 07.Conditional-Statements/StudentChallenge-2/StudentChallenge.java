import java.util.Scanner;
public class StudentChallenge {
    public static void main(String []args) {
        FindRadix obj = new FindRadix();
        obj.display();
        LeapYear obj1 = new LeapYear();
        obj1.display();
    }
}
class FindRadix {
    Scanner sc = new Scanner(System.in);
    void display() {
    System.out.print("Enter any NO: ");
    String str = sc.next();
    if(str.matches("[01]+"))
        System.out.println("Radix of the NO is 2-(Binary)");
    else if(str.matches("[0-7]+"))
        System.out.println("Radix of the NO is 8-(Octal)");
    else if(str.matches("[0-9]+"))
        System.out.println("Radix of the NO is 10-(Decimal)");
    else if(str.matches("[0-9a-fA-F]+"))
        System.out.println("Radix of the NO is 16-(Hexadecimal)");
    else
        System.out.println("The NO is invalid");
    }
}
class LeapYear {
    Scanner in = new Scanner(System.in);
    void display() {
        System.out.print("Enter any Year: ");
        int year = in.nextInt();
        if(year%4==0) {
            if(year%100==0) {
                if(year%400==0) {
                    System.out.println("Given Year is a Leap Year");
                }
                else
                    System.out.println("Given Year is NOT a Leap Year");
            }
            else
                System.out.println("Given Year is a Leap Year");
        }
        else
            System.out.println("Given Year is NOT a Leap Year");
    }
}