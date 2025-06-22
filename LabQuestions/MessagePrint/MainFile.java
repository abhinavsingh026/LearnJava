import java.util.Scanner;
public class MainFile {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your message: ");
        String msg = sc.nextLine();
        MessagePrinter.print(msg);
        sc.close();
    }
}