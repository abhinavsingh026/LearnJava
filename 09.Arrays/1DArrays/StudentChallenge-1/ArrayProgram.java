import java.util.Scanner;
public class ArrayProgram {
    public static void main(String []args) {
        System.out.println("Program to print Sum of elements of Array:- ");
        SumElements obj = new SumElements();
        obj.sumofelements();
        System.out.println("Program to print Maximum element of an Array:- ");
        MaxElement obj2 = new MaxElement();
        obj2.maximumelement();
        System.out.println("Program to print Second Largest element of an Array:- ");
        SecondLargest obj3 = new SecondLargest();
        obj3.findelement();
        System.out.println("Program to search for an element in Array:- ");
        SearchElements obj1 = new SearchElements();
        obj1.searchofelements();
    }
}
class SumElements {
    void sumofelements() {
        int arr[] = {3,9,7,8,12,6,15,5,4,10};
        int sum=0;
        for(int x:arr) {
            sum = sum+x;
        }
        System.out.println("Sum of all Elements of Array is: "+sum);
    }
}
class MaxElement {
    void maximumelement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int B[] = new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter "+i+" element: ");
            B[i] = sc.nextInt();
        }
        int max = B[0]; // max = 0 not used as not good for -ve value in array
        for(int j=0;j<n;j++) {
            if(B[j]>max)
                max = B[j];
        }
        System.out.println("Max Element in the Array is: "+max);
    }
}
class SecondLargest {
    void findelement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int n = sc.nextInt();
        int C[];
        C = new int[n];
        for(int i=0;i<n;i++) {
            System.out.print("Enter "+i+" element of Array: ");
            C[i] = sc.nextInt();
        }
        int max1,max2;
        max1 = max2 = C[0];
        for(int j=0;j<n;j++) {
            if(C[j]>max1) {
                max2=max1;
                max1=C[j];
            }
            else if(C[j]>max2) 
                max2=C[j];
        }
        System.out.println("Second Maximum element of Array is: "+max2);
    }
}
class SearchElements {
    void searchofelements() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Key: ");
        int key = sc.nextInt();
        int A[] = {3,9,7,8,12,6,15,5,4,10};
        for(int i=0;i<A.length;i++) {
            if(key==A[i]) {
                System.out.println("Key found at index: "+i);
                System.exit(0);
            }
        }
        System.out.println("Key = "+key+" NOT found in Array");
    }
}