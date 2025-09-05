class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length,int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void display() {
        System.out.println("Length = "+this.length);
        System.out.println("Breadth = "+this.breadth);
    }
}
public class This {     //this is a reference to the current object//
    public static void main(String []args) {
        Rectangle r1 = new Rectangle(10,20);
        r1.length = 50; //referring specifically to r1 objects length//
        r1.display();
        Rectangle r2 = new Rectangle(30,40);
        r2.display();
    }
}