class A{} 
class B extends A{}

class Super {
    public A display() {
        System.out.println("Super Display");
        return new A();
    }
}//if a method is returning an object of Super class(A) then overrided method can return object of its subclass(B) or same class(A)//
class Sub extends Super {
    public B display() {
        System.out.println("Sub Display");
        return new B();
    }
}
public class DosDonts {
    public static void main(String []args) {
        Sub s = new Sub();
        s.display();
    }
}