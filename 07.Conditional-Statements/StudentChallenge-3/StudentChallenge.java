import java.util.Scanner;
public class StudentChallenge {
    public static void main(String []args) {
        DisplayDay obj = new DisplayDay();
        obj.daynum();
        WebsiteProtocol obj1 = new WebsiteProtocol();
        obj1.protocoltype();
    }
}
class DisplayDay {
    void daynum() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a No.(1-7): ");
    int num = sc.nextInt();
    if(num==1)
        System.out.println("Monday");
    else if(num==2)
        System.out.println("Tuesday");
    else if(num==3)
        System.out.println("Wednesday");
    else if(num==4)
        System.out.println("Thrudsay");
    else if(num==5)
        System.out.println("Friday");
    else if(num==6)
        System.out.println("Saturday");
    else if(num==7)
        System.out.println("Sunday");
    else
        System.out.println("Enter a No. Between 0-7");
    }
}
class WebsiteProtocol {
    void protocoltype() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a Website address\nEx-(https://www.google.com): ");
    String str = sc.nextLine();
    String protocol = str.substring(0,str.indexOf(':'));
    if(protocol.equals("https"))
        System.out.println("Hyper Text Transfer Protocol");
    else if(protocol.equals("ftp"))
        System.out.println("File Transfer Protocol");
    else
        System.out.println("Other Protocol than https and fts");
    String type = str.substring(str.lastIndexOf('.')+1);
    if(type.equals("com"))
        System.out.println("Commercial");
    else if(type.equals("org"))
        System.out.println("Organisation");
    else if(type.equals("biz"))
        System.out.println("Business");
    else if(type.equals("net"))
        System.out.println("Network");
    else if(type.equals("gov"))
        System.out.println("Government");
    else
        System.out.println("Unknown Website Type");
    }
}