class ClassRectangle {
    public float length;            //properies of rectangle//
    public float breadth;

    public float area() {
        return length*breadth;
    }
    public float perimeter() {          //calculations in rectangle//
        return 2*(length+breadth);
    }
    public boolean isSquare() {
        return length==breadth;     //automatically if yes true else false//
    }
    public static void main(String []args) {
        ClassRectangle r1 = new ClassRectangle();
        r1.length = 4.2f;
        r1.breadth = 5.7f;
        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
        System.out.println("Rectangle is a Square: "+r1.isSquare());
    }
}