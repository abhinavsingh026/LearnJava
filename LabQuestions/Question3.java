import java.util.Scanner;
class Question3 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.print("Enter " +size+ " Elements: ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
}