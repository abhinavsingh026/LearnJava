import java.util.Scanner;
class StudentChallenge {
    static boolean isprime(int n) {
        for(int i=2;i<n/2;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
    static int gcdhcf(int m,int n) {
        while(m!=n) {
            if(m>n)m=m-n;
            else n=n-m;
        }
        return m;
    }
    int maximum(int A[]) {
        int max = A[0];
        for(int i=0;i<A.length;i++) {
            if(A[i]>max)
                max = A[i];
        }
        System.out.println("Max Element in Array is: "+max);
        return max;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number to check Prime: ");
        int numprime = sc.nextInt();
        System.out.println(isprime(numprime));
        System.out.print("Enter two no.s to find GCD: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        System.out.println("GCD of the No. is: "+gcdhcf(n1,n2));
        int A[] = {2,3,4,5,6,7};
        StudentChallenge obj = new StudentChallenge();
        System.out.println(obj.maximum(A));
    }
} 