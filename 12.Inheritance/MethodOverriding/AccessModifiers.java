class Super {
    private void display() {
        System.out.println("Super Display");
    }
}//method overriding works on same(excluding private) and relaxing access modifiers//
class Sub extends Super {
    protected void display() {
        System.out.println("Sub Display");
    }
}
public class AccessModifiers {
    public static void main(String []args) {
        Sub s = new Sub();
        s.display();
    }
}