class Circle {
    private double radius;
    public Circle() {
        radius = 0.0;
    }                   //Doesn't have height Available or Accessible//
    public double area() {return radius;} 
    public double perimeter() {return radius;}
}
class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        height = 0.0;   //Does have radius Available//
    }                   //Doesn't have radius directly Accessible//
    public double volume() {return height;}
}
public class DemoFirst {
    public static void main(String []args) {
        Circle c1 = new Circle(); //it called the circle constructor only//
        System.out.println(c1.area());
        Cylinder c2 = new Cylinder(); //it called both the circle and cylinder constructor//
        System.out.print(c2.volume());
    }
}