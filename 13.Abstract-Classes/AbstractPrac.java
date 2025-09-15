abstract class Super {
    public Super() {
       System.out.println("Super Constructor");
    }
    public void meth1() {
        System.out.println("Super Meth-1");
    }
    abstract public void meth2();
}
class Sub extends Super {
    public void meth2() {
        System.out.println("Sub Meth-2");
    }
}
public class AbstractPrac {
    public static void main(String []args) {
        Super s = new Sub();
        s.meth1();
        s.meth2();
    }
}