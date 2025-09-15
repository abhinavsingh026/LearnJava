abstract class Shape {
    abstract public double perimeter();
    abstract public double area();
}
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return 2*Math.PI*radius;
    }
    public double area() {
        return Math.PI*radius*radius;
    }
}
class Rectangle extends Shape {
    double length;
    double breadth;

    Rectangle(double length,double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double perimeter() {
        return 2*(length+breadth);
    }
    public double area() {
        return length*breadth;
    }
}
public class AbstractShape {
    public static void main(String []args) {
        Shape s1 = new Circle(4);
        System.out.println("Area of Scircle: "+s1.area());
        System.out.println("Perimeter of Scircle: "+s1.perimeter());

        Shape s2 = new Rectangle(4,5);
        System.out.println("Area of Srectangle: "+s2.area());
        System.out.println("Perimeter of Srectangle: "+s2.perimeter());        

        Circle c1 = new Circle(7);
        System.out.println("Area of Circle: "+c1.area());
        System.out.println("Perimeter of Circle: "+c1.perimeter());

        Rectangle r1 = new Rectangle(2,3);
        System.out.println("Area of Rectangle: "+r1.area());
        System.out.println("Perimeter of Rectangle: "+r1.perimeter());
    }
}