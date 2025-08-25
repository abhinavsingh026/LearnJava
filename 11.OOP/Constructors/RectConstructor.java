class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {        //Non-Parameterised Constructor//
        length = 1;
        breadth = 1;
    }
    public Rectangle(double l,double b) {       //Parameterised Constructor//
        setLength(l);   //validating length & breadth from setter method//
        setBreadth(b);
    }
    public Rectangle(double s) {    //single parameter constructor//
        setSide(s);
    }

    public double getLength() {
        return length;
    }
    public void setLength(double l) {
        if(l>0)length = l;
        else length = 0;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double b) {
        if(b>0)breadth = b;
        else breadth = 0;
    }
    public double getSide() {
        return length;      //Both length and breadth same in this case//
    }
    public void setSide(double s) {
        if(s>0)length=breadth=s;
        else length=breadth=0;
    }

    public double area() {
        return getLength()*getBreadth();
    }
    public double perimeter() {
        return 2*(getLength()+getBreadth());
    }
    public boolean isSquare() {
        return length==breadth;
    }
}
class RectConstructor {
    public static void main(String []args) {
        Rectangle r1 = new Rectangle();         //calling Non-parameterised constructor//
        Rectangle r2 = new Rectangle(10,6);     //calling parameterised constructor//
        Rectangle r3 = new Rectangle(5);        //calling single parameter constructor//
        System.out.println("Created Rectangle2 Obj Length: "+r2.getLength());
        System.out.println("Created Rectangle2 Obj Breadth: "+r2.getBreadth());
        System.out.println();
        // r1.setLength(10);
        // r1.setBreadth(5);
        r2.setLength(-10); //Modifying Rectangle2 Obj Length//
        r2.setBreadth(5); //Modifying Rectangle2 Obj Breadth//
        System.out.println("Modified Rectangle Obj Length: "+r2.getLength());
        System.out.println("Modified Rectangle Obj Breadth: "+r2.getBreadth());
        System.out.println();

        System.out.println("Non-Parameterised Rectangle Area: "+r1.area());
        System.out.println("Parameterised Rectangle Area: "+r2.area());
        System.out.println("Single Parameter Rectangle Area: "+r3.area());
    }
}