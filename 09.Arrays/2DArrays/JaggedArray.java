import java.util.Scanner;
public class JaggedArray {
    public static void main(String []args) {
        int A[][] = new int[3][];
        A[0] = new int[2];
        A[1] = new int[4];
        A[2] = new int[3];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[i].length;j++) {
                System.out.print("Enter "+i+" Row "+j+" Column Element: ");
                A[i][j] = sc.nextInt();
            }
        }
        for(int x[]:A) {
            for(int y:x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}