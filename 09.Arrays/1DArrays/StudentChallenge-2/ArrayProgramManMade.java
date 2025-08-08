import java.util.Scanner;
public class ArrayProgramManMade {
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
        int A[] = {2,5,10,9,4,7,2,16,24};
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
        int B[] = {5,10,9,8,12};
        for(int x:B)
            System.out.print(x+" ");
        System.out.println();
        int temp = B[B.length-1];
        for(int i=0,j=2;i<B.length-1;i++,j++) {
            B[B.length-1-i] = B[B.length-j];
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
        int arr[];
        arr = new int[10];
        // arr[0] = 5;
        // arr[1] = 9;
        // arr[2] = 6;
        // arr[3] = 10;     // Uninitialized spaces contain by default 0
        // arr[4] = 12;
        // arr[5] = 7;
        // arr[6] = 16;
        for(int i=0;i<5;i++) {
            System.out.print("Enter "+i+" Element of Array: ");
            arr[i] = sc.nextInt();
        }
        for(int x:arr)
            System.out.print(x+" ");
        System.out.println();
        System.out.print("At what Index you want to insert Element: ");
        int index = sc.nextInt();
        System.out.print("Enter Element you want to insert: ");
        int element = sc.nextInt();
        for(int j=0;j<arr.length-index;j++) {
            arr[arr.length-1-j] = arr[arr.length-2-j];
        }
        arr[index] = element;
        for(int x:arr)
            System.out.print(x+" ");
    }
}
class ElementDelete {
    void deletelement() {
        Scanner sc = new Scanner(System.in);
        int A[] = new int[] {1,2,3,4,5,6,7,8,9,11};
        // for(int i=0;i<10;i++) {
        //     System.out.print("Enter "+i+" element of Array: ");
        //     A[i] = sc.nextInt();
        // }
        for(int x:A)
            System.out.print(x+" ");
        System.out.println();
        System.out.print("Enter index of element you want to Delete: ");
        int index = sc.nextInt();
        A[index] = 0;
        for(int j=index;j<A.length-1;j++) {
            A[j] = A[j+1];
        }
        if(A[8]==A[9])
            A[9] = 0;
        for(int x:A)
            System.out.print(x+" ");
    }
}