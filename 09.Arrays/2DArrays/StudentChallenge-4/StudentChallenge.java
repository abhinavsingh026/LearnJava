public class StudentChallenge {
    public static void main(String []args) {
        AddingMatrix obj = new AddingMatrix();
        System.out.println("Display Matrix:- ");
        obj.matrixdisplay();
        System.out.println("Program for Addition of Matrix:- ");
        obj.matrixadd();
        MultiplyMatrix obj1 = new MultiplyMatrix();
        System.out.println("Program for Multiplication of Matrix:- ");
        obj1.matrixmultiply();
    }
}
class AddingMatrix {
    void matrixdisplay() {
        int A[][] = {{3,5,9},{7,6,2},{4,3,5}};
        int B[][] = new int[][] {{1,5,2},{6,8,4},{3,9,7}};
        System.out.println("Matrix A:- ");
        for(int r=0;r<A.length;r++) {
            for(int c=0;c<A[0].length;c++) {
                System.out.print(A[r][c]+" ");
            }
            System.out.println();
        }
        System.out.println("Matrix B:- ");
        for(int x[]:B) {
            for(int y:x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
    void matrixadd() {
        int [][]A = {{3,5,9},{7,6,2},{4,3,5}};
        int [][]B = new int[][] {{1,5,2},{6,8,4},{3,9,7}};
        int[][] sum = new int[3][3];
        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[0].length;j++) {
                sum[i][j] = A[i][j]+B[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of matrix is:- ");
        for(int x[]:sum) {
            for(int y:x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
class MultiplyMatrix {
    void matrixmultiply() {
        int [] A[] = {{3,5,9},{7,6,2},{4,3,5}};
        int[][] B;
        B = new int[][] {{1,1,1},{1,1,1},{1,1,1}};
        int[] C[];
        C = new int[3][3];
        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[0].length;j++) {
                for(int k=0;k<3;k++) {
                    C[i][j] += A[i][k]*B[k][j];
                }
            }
        }
        System.out.println("Multiplied Matrix is:- ");
        for(int x[]:C) {
            for(int y:x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
