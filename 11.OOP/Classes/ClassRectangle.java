class ClassRectangle {
    public float length;            //properies of rectangle//
    public float breadth;

    public float area() {
        return length*breadth;
    }
    public float perimeter() {          //calculations in rectangle//
        return 2*(length+breadth);
    }
    public static void main(String []args) {
        Rectangle r1 = new Rectangle();
        r1.length = 4.2f;
        r1.breadth = 5.3f;
        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
    }
}