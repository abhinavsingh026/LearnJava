import java.util.Scanner;
public class StudChallenge {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary No: ");
        String str1 = String.valueOf(sc.next());
        if(str1.matches("[01]+"))
            System.out.println("Valid Binary NO. "+str1);
        else
            System.out.println("Invalid Binary NO. "+str1);
        sc.nextLine(); // Clearing newline character from the buffer
        System.out.print("Enter HexaDecimal No: ");
        String str2 = sc.nextLine();
        if(str2.matches("[a-f0-9]+"))
            System.out.println("Valid HexaDecimal NO. "+str2);
        else
            System.out.println("Invalid HexaDecimal NO. "+str2);
    }
}