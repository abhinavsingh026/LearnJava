public class StudentChallenge {
    public static void main(String []args) {
        System.out.println("Program for coping of Array:- ");
        ArrayCopy obj = new ArrayCopy();
        obj.copingarray();
        System.out.println("Program for Reverse coping of Array:- ");
        ArrayReverseCopy obj1 = new ArrayReverseCopy();
        obj1.reversecopingarray();
        System.out.println("Program for Increasing size of Array:- ");
        ArraySizeIncrease obj2 = new ArraySizeIncrease();
        obj2.sizeincrease();
        System.out.println("Program for Decreasing size of Array:- ");
        ArraySizeDecrease obj3 = new ArraySizeDecrease();
        obj3.sizedecrease();
    }
}
class ArrayCopy {
    void copingarray() {
        int A[] = {8,6,10,9,2,15,7,13,14,11};
        int B[] = new int[10];
        for(int i=0;i<A.length;i++) {
            B[i] = A[i];
        }
        for(int x:B)
            System.out.print(x+" ");
        System.out.println();
    }
}
class ArrayReverseCopy {
    void reversecopingarray() {
        int A[] = {8,6,10,9,2,15,7,13,14,11};
        int B[] = new int[10];
        for(int i=A.length-1,j=0;i>=0;i--,j++) {
            B[j] = A[i];
        }
        for(int x:B)
            System.out.print(x+" ");
        System.out.println();
    }
}
class ArraySizeIncrease {
    void sizeincrease() {
        int A[] = {8,6,10,9,2,15};
        int B[] = new int[10];
        for(int i=0;i<A.length;i++) {
            B[i] = A[i];
        }
        for(int x=0;x<B.length;x++) {
            System.out.print(B[x]+" ");
        }
        System.out.println();
        System.out.println("Length before: "+A.length);
        System.out.println("Length After: "+B.length);
    }
}
class ArraySizeDecrease {
    void sizedecrease() {
        int A[] = {8,6,10,9,2,15};
        int B[] = new int[4];
        for(int i=0;i<4;i++) {
            B[i] = A[i];
        }
        for(int x=0;x<B.length;x++) {
            System.out.print(B[x]+" ");
        }
        System.out.println();
        System.out.println("Length before: "+A.length);
        System.out.println("Length After: "+B.length);
    }
}