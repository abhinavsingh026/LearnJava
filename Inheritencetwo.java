import java.util.*;
class A {
    int a,b;
    void get_data() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two elements:- ");
        a = in.nextInt();
        b = in.nextInt();
    }
    void show_data() {
        System.out.print("A = "+a);
        System.out.print("\nB = "+b);
    }
}
class B extends A {
    void add() {
        System.out.print("\nAddition = "+(a+b));
    }
}
class C extends A {
    void sub() {
        System.out.print("\nDifference = "+(a-b));
    }
}
class D extends A {
    void mul() {
        System.out.print("\nMultiplication = "+(a*b));
    }
}
class E extends A {
    void div() {
        System.out.print("\nDivision = "+(a/b));
    }
}
class Inheritencetwo {
    public static void main(String[]args) {
        B sum = new B();
        sum.get_data();
        sum.show_data();
        sum.add();
        C dif = new C();
        D pro = new D();
        E mod = new E();
        dif.a=pro.a=mod.a=sum.a;
        dif.b=pro.b=mod.b=sum.b;
        dif.sub();
        pro.mul();
        mod.div();
        System.out.println();
    }
}