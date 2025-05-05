import java.util.Scanner;
class A{
    int x,y;
    public int add(int a,int b){
        x=a;
        y=b;
        return(x+y);
    }
}
class B extends A{
    public int sub(int x,int y){
    return(x-y);
    }
}
class C extends B{
    public int mul(int x,int y){
    return(x*y);
    }
}
class D extends C{
    public int div(int x,int y){
    return(x%y);
    }
}
class Inheritence{
    public static void main(String[]args){
        int a,b;
        Scanner sc = new Scanner(System.in);
        D obj = new D();
        System.out.print("\n Enter Two Numbers:- ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Sum of the No. is:- "+obj.add(a,b));
        System.out.println("Subtraction of the No. is:- "+obj.sub(a,b));
        System.out.println("Multiplication of the No. is:- "+obj.mul(a,b));
        System.out.println("Division of the No. is:- "+obj.div(a,b));
    }
}