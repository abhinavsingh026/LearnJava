import java.util.Scanner;
class A {
    int x,y;
    public int add(int x,int y){
        return(x+y);
    }
}
class B extends A {
    public int sub(int x,int y){
    return(x-y);
    }
}
class C extends B {
    public int mul(int x,int y){
    return(x*y);
    }
}
class D extends C {
    public int div(int x,int y){
    return(x%y);
    }
}
class Inheritence {
    public static void main(String[]args) {
        int x,y;
        Scanner sc = new Scanner(System.in);
        D obj = new D();
        System.out.print("\n Enter Two Numbers:- ");
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("Sum of the No. is:- "+obj.add(x,y));
        System.out.println("Subtraction of the No. is:- "+obj.sub(x,y));
        System.out.println("Multiplication of the No. is:- "+obj.mul(x,y));
        System.out.println("Division of the No. is:- "+obj.div(x,y));
    }
}