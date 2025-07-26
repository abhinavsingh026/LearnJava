import java.util.Scanner;
public class ValidCheck {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary No: ");
        String str1 = String.valueOf(sc.nextInt());
        if(str1.matches("[01]+"))
            System.out.println("Valid Binary NO. "+str1);
        else
            System.out.println("Invalid Binary NO. "+str1);
        System.out.print("Enter HexaDecimal No: ");
        String str2 = sc.next();
        if(str2.matches("[0-9a-fA-F]+"))
            System.out.println("Valid HexaDecimal NO. "+str2);
        else
            System.out.println("Invalid HexaDecimal NO. "+str2);
        System.out.print("Enter Date: ");
        String str3 = sc.next();
        System.out.print("Enter Month: ");
        String str4 = sc.next();
        System.out.print("Enter Year: ");
        String str5 = sc.next();
        boolean validDay = str3.matches("[0-3][0-9]");
        boolean validMonth = str4.matches("0?[0-9]|1[0-2]");
        boolean validYear = str5.matches("\\d{4}");
        if(validDay && validMonth && validYear)
            System.out.println("Valid Format of dd/mm/yyyy");
        else
            System.out.println("Invalid Format of dd/mm/yyyy");
    }
}