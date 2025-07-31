import java.util.Scanner;
public class StudentChallenge {
    public static void main(String []args) {
        MultiplicationTable obj = new MultiplicationTable();
        obj.table();
        NumberSum obj1 = new NumberSum();
        obj1.sumofnumbers();
        FactorialNum obj2 = new FactorialNum();
        obj2.factorial();
    }
}
class MultiplicationTable {
    void table() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. : ");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++) {
            System.out.println(num+"*"+i+"= "+num*i);
        }
    }
}
class NumberSum {
    void sumofnumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. to find sum of: ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i=1;i<=num;i++) {
            sum = sum + i;
        }
        System.out.println("Sum of "+num+" numbers is: "+sum);
    }
}
class FactorialNum {
    void factorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a No. to find factorial: ");
        int num = sc.nextInt();
        long fact = 1;
        for(int i=1;i<=num;i++) {
            fact = fact*i;
        }
        System.out.print(fact);
    }
}