import java.util.Scanner;
public class ArrayProgramNatural {
    public static void main(String []args) {
        ArrayRotation obj = new ArrayRotation();
        System.out.println("Program for Left Rotation of Array:-");
        obj.leftrotation();
        System.out.println("Program for Right Rotation of Array:-");
        obj.rightrotation();
        System.out.println("Program for Inserting an Element:-");
        ElementInsert obj1 = new ElementInsert();
        obj1.insertelement();
        System.out.println("Program for Deleting an Element:- ");
        ElementDelete obj2 = new ElementDelete();
        obj2.deletelement();
    }
}
class ArrayRotation {
    void leftrotation() {
        int A[] = {5,2,8,6,4,9,3,12,14,7};
        for(int x:A)
            System.out.print(x+" ");
        System.out.println();
        int temp = A[0];
        for(int i=1;i<A.length;i++) {
            A[i-1] = A[i];
        }
        A[A.length-1] = temp;
        System.out.println("Left Rotated Array :-");
        for(int x:A)
            System.out.print(x+" ");
        System.out.println();
    }
    void rightrotation() {
        int B[] = {5,10,9,8,12,7};
        for(int x:B)
            System.out.print(x+" ");
        System.out.println();
        int temp = B[B.length-1];
        for(int i=B.length-1;i>0;i--) {
            B[i] = B[i-1];
        }
        B[0] = temp;
        System.out.println("Right Rotated Array :-");
        for(int x:B)
            System.out.print(x+" ");
        System.out.println();
    }
}
class ElementInsert {
    void insertelement() {
        Scanner sc = new Scanner(System.in);
        int A[];
        A = new int[10];
        A[0] = 5;
        A[1] = 9;
        A[2] = 6;       //Uninitialized spaces contain by default 0//
        A[3] = 10; 
        A[4] = 7;
        int n = 5;
        for(int i=0;i<n;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.print("At what Index you want to insert Element: ");
        int index = sc.nextInt();
        System.out.print("Enter Element you want to insert: ");
        int element = sc.nextInt();
        for(int j=n;j>index;j--) {
            A[j] = A[j-1];
        }
        A[index] = element;
        for(int i=0;i<n;i++) {
            System.out.print(A[i]+" ");
        }
        System.out.println();
    }
}
class ElementDelete {
    void deletelement() {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[] {1,2,3,4,5,6,7,8,9,11};
        for(int x:A)
            System.out.print(x+" ");
        System.out.println();
        System.out.print("Enter index of element you want to Delete: ");
        int index = sc.nextInt();
        for(int j=index;j<A.length;j++) {
            A[j-1] = A[j];
        }
        A[A.length-1] = 0;
        for(int x:A)
            System.out.print(x+" ");
        System.out.println();
    }
}