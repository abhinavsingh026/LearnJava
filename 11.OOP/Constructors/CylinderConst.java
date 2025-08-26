class Cylinder {
//properties//
    private double radius;
    private double height;
//constructors//
    public Cylinder() {
        radius = height = 1;
    }
    public Cylinder(double r,double h) {
        setRadius(r);
        setHeight(h);
    }
//property methods//
    public double getRadius() {
        return radius;
    }
    public void setRadius(double r) {
        if(r>0) radius = r;
        else radius = 0;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double h) {
        if(h>0) height = h;
        else height = 0;
    }
    public double getDimensions() {
        return radius;
    }
    public void setDimensions(double r,double h) {
        if(r>0 && h>0) {
            radius = r;
            height = h;
        }
        else {
            radius = 0;
            height = 0;
        }
    }
//Instance methods or Facilitators//
    public double surfaceArea() {
        return 2*(Math.PI*radius*height) + 2*(Math.PI*radius*radius);
    }
    public double lidArea() {
        return 2*(Math.PI*radius*radius);
    }
    public double volume() {
        return Math.PI*radius*radius*height;
    }
}
class CylinderConst {
    public static void main(String []args) {
        Cylinder c1 = new Cylinder();
        System.out.println("c1 Cylinder Radius & Height: "+c1.getRadius()+" & "+c1.getHeight());
        System.out.println("Surface Area of c1 Cylinder: "+c1.surfaceArea());
        System.out.println("Lid Area of c1 Cylinder: "+c1.lidArea());
        System.out.println("Volume of c1 Cylinder: "+c1.volume());
        c1.setRadius(3); //Modifying c1 cylinder after creating object through constructor//
        c1.setHeight(2);
        System.out.println("Modified c1 Cylinder Radius & Height: "+c1.getRadius()+" & "+c1.getHeight());
        System.out.println();


        Cylinder c2 = new Cylinder(4,5);
        System.out.println("c2 Cylinder Radius & Height: "+c2.getRadius()+" & "+c2.getHeight());
        System.out.println("Surface Area of c2 Cylinder: "+c2.surfaceArea());
        System.out.println("Lid Area of c2 Cylinder: "+c2.lidArea());
        System.out.println("Volume of c2 Cylinder: "+c2.volume());
        c2.setDimensions(2,6);
        System.out.println("Modified c2 Cylinder Radius & Height: "+c2.getRadius()+" & "+c2.getHeight());

    }
}