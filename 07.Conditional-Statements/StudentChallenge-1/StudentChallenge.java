import java.util.Scanner;
public class StudentChallenge {
    public static void main(String []args) {
        OddEven obj = new OddEven();
        obj.display();
        YoungOld obj1 = new YoungOld();
        obj1.display();
        GradesMarks obj2 = new GradesMarks();
        obj2.display();
    }
}
class OddEven {
    Scanner sc = new Scanner(System.in);
    void display() {
        System.out.print("Enter any Integer: ");
        int num = sc.nextInt();
        if(num%2==0)
            System.out.println("Entered NO is Even");
        else
            System.out.println("Entered NO is Odd");
    }
}
class YoungOld {
    Scanner sc = new Scanner(System.in);
    void display() {
        System.out.print("Enter Age(0-100): ");
        int age = sc.nextInt();
            if(age>0 && age<=19)
                System.out.println("You are a Teen");
            else if(age>=20 && age<=50)
                System.out.println("You are Young");
            else if(age>=51 && age<=80)
                System.out.println("You are Old");
            else
                System.out.println("You Dead Bruh!");        
    }
}
class GradesMarks {
    Scanner sc = new Scanner(System.in);
    void display() {
        float math,science,computer;
        System.out.print("Enter Marks received in Math(0-100): ");
         math = sc.nextFloat();
        System.out.print("Enter Marks received in Science(0-100): ");
        science = sc.nextFloat();
        System.out.print("Enter Marks received in Computer(0-100): ");
        computer = sc.nextFloat();
        float totalmarks = math+science+computer;
        System.out.println("Total Marks: "+totalmarks);
        float avgmarks = math+science+computer/3;
            if(avgmarks>0.00f && avgmarks<=30)
                System.out.println("You got 3rd Grade");
            else if(avgmarks>=31 && avgmarks<=60)
                System.out.println("You got 2nd Grade");
            else if(avgmarks>=61 && avgmarks<=90)
                System.out.println("You got 1st Grade");
            else
                System.out.println("You got A++ Grade");
    }
}