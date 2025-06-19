import java.util.Scanner;
class Question7 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);
        int []arr = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++) {
            System.out.print("Enter "+n+" Integers: ");
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print("Sum is: "+sum);
    }
}