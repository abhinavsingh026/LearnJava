import java.util.Scanner;
class Question6 {
    public static void main(String[]args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter any Integer: ");
            int n = sc.nextInt();
            for(int i=1;i<=n;i++) {
                if(n%i == 0)
                count++;
        }
        if(count == 2)
        System.out.print(n+" is a Prime Number");
        else
        System.out.print(n+" is not a Prime Number");
    }
}