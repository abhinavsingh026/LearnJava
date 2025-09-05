class Rectangle {
    int length;
    int breadth;
    int x = 10;

    public Rectangle(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
}
class Cuboid extends Rectangle {
    int height;
    int x = 20;

    public Cuboid(int length,int breadth,int height) {
        super(length,breadth); //refers to the set of properties coming from parent class//
        this.height = height;
    }

    void display() {
        System.out.println(super.x); //refers to the set of properties coming from parent class//
        System.out.println(x);
    }
}
public class Super {
    public static void main(String []args) {
        Cuboid c1 = new Cuboid(15,12,13);
        c1.display();
    }
}