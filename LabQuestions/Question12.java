class Sample {
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
public class Question12 {
    public static void main(String[] args) {
        Sample s1 = new Sample();
        System.out.println("Public X: "+s1.x);
        s1.PrintY();
        int a = 50;
        s1.modifyPrimitive(a);
        System.out.println("After modifyPrimitive "+a);
        s1.modifyObject(s1);
        System.out.println("After modifyObject, X: "+s1.x);
    }
}