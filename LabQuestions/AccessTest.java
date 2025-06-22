class sample {
    public int x = 5;
    private int y = 10;
    final int z = 20;
    void PrintY() {
        System.out.println("Private y: "+y);
    }
    void modifyObject(Sample obj) {
        obj.x += 10;
    }
    void modifyPrimitive(int a) {
        a += 10;
        System.out.println("Inside modifyPrimitive: "+a);        
    }
}
public class AccessTest {
    public static void main(String[]args) {
        Sample s = new Sample();
        System.out.println("Public X: "+s.x);
        s.printY();
        int a = 50;
        s.modifyPrimitive(a);
        System.out.print("After modifyPrimitive "+a);
        s.modifyObject(s);
        System.out.print("After modifyObject, X: "+s.x);
    }
}