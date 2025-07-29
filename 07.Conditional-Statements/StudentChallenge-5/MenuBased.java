import java.util.Scanner;
public class MenuBased {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("===");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("Enter 2 Numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Option from the Menu: ");
        String option = sc.nextLine();
        switch(option) 
        {
            case "ADD": System.out.println("Sum is: "+(n1+n2));
                    break;
            case "SUB": System.out.println("Subtraction is: "+(n1-n2));
                    break;
            case "MUL": System.out.println("Multiplication is: "+(n1*n2));
                    break;
            case "DIV": System.out.println("Ratio is: "+(n1/n2));
                    break;
            default: System.out.println("Invalid Option");
        }
    }
}