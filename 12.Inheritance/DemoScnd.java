class Circle {
    public double radius;
    public double area() {
        return Math.PI*radius*radius;
    }
    public double perimeter() {
        return 2*Math.PI*radius;
    }
    public double circumference() {
        return perimeter();
    }
}
class Cylinder extends Circle {
    public double height;
    public double volume() {
        return area()*height;   //area() both available and {accessible - public Access modifier}//
    }
}
class DemoScnd {
    public static void main(String []args) {
        Cylinder c = new Cylinder();
        c.height = 10;      //using public access modifier - direct access//
        c.radius = 7;
        System.out.println("Area of Cylinder: "+c.area());
        System.out.println("Volume of Cylinder: "+c.volume());
    }
}