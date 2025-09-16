interface Test1 {
    void meth1();
    void meth2();
}
class Test2 implements Test1 {
    public void meth1() {
        System.out.println("Interface Implemented Meth-1 Overrided");
    }
    public void meth2() {
        System.out.println("Interface Implemented Meth-2 Overrided");
    }
}
public class InterfacePrac {
    public static void main(String []args) {
        Test1 t = new Test2();
        t.meth1();
        t.meth2();
    }
}