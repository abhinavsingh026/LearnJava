import java.util.Scanner;
public class SwitchCase {
    public static void main(String []args) {
        SwitchDay obj = new SwitchDay();
        obj.display();
        SwitchMonth obj1 = new SwitchMonth();
        obj1.display();
        Webtype obj2 = new Webtype();
        obj2.display();
    }
}
class SwitchDay {
    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Day No. (1-7): ");
        int daynum = sc.nextInt();
        switch(daynum)
        {
            case 1: System.out.println("Monday");
                    break;
            case 2: System.out.println("Tuesday");
                    break;
            case 3: System.out.println("Wednesday");
                    break;
            case 4: System.out.println("Thrudsay");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("Saturday");
                    break;
            case 7: System.out.println("Sunday");
                    break;
            default: System.out.println("Enter a valid Number");
        }
    }
}
class SwitchMonth {
    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Month No. (1-12): ");
        int monthnum = sc.nextInt();
        switch(monthnum)
        {
            case 1: System.out.println("January");
                    break;
            case 2: System.out.println("February");
                    break;
            case 3: System.out.println("March");
                    break;
            case 4: System.out.println("April");
                    break;
            case 5: System.out.println("May");
                    break;
            case 6: System.out.println("June");
                    break;
            case 7: System.out.println("July");
                    break;
            case 8: System.out.println("August");
                    break;
            case 9: System.out.println("September");
                    break;
            case 10: System.out.println("October");
                    break;
            case 11: System.out.println("November");
                    break;
            case 12: System.out.println("December");
                    break;
            default: System.out.println("Enter a valid Number");
        }
    }
}
class Webtype {
    void display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Website Address\nEx-https://www.google.com : ");
        String str = sc.nextLine();
        str = str.substring(str.lastIndexOf('.')+1);
        switch(str)
        {
            case "com": System.out.println("Commercial");
                    break;
            case "biz": System.out.println("Business");
                    break;
            case "org": System.out.println("Organisation");
                    break;
            case "gov": System.out.println("Government");
                    break;
            case "net": System.out.println("Network");
                    break;
            default: System.out.println("Unknown Website type");
        }
    }
}