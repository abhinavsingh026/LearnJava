class Rectangle {
    private int length;
    private int breadth;

    public void setLength(int l) {
        if(l>0)
            length = l;
        else
            length = 0;
    }
    public int getLength() {
        return length;
    }
    public void setBreadth(int b) {
        if(b>0)
            breadth = b;
        else
            breadth = 0;
    }
    public int getBreadth() {
        return breadth;
    }
    public int area() {
        return getLength()*getBreadth();    //through methods we can also//
    }
    public int perimeter() {
        return 2*(length+breadth);
    }
}
class DatahideRectangle {
    public static void main(String []args) {
        Rectangle r1 = new Rectangle();
        r1.setLength(10);                       //accessing through setter method//
        r1.setBreadth(5);
        System.out.println("Area of Rectangle is: "+r1.area());
        System.out.println("Perimeter of Rectangle is: "+r1.perimeter());
        System.out.println("Length of Rectangle is: "+r1.getLength()); //accessing through //
        System.out.println("Breadth of Rectangle is: "+r1.getBreadth()); // getter method //
    }
}