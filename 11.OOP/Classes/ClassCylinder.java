class Cylinder {
    public double height;
    public double radius;                //property of a cylinder//

    public double surfaceArea() {
        return 2*(Math.PI*radius*height) + 2*(Math.PI*radius*radius);   //Math.PI is double//
    }
    public double lidArea() {
        return 2*(Math.PI*radius*radius);               // Behaviours of cylinder//
    }
    public double volume() {
        return Math.PI*radius*radius*height;
    }
}
class ClassCylinder {
    public static void main(String []args) {
    Cylinder c1 = new Cylinder();
    c1.height = 4.45;
    c1.radius = 2.34;
    System.out.println("Surface Area: "+c1.surfaceArea());
    System.out.println("Lid Area: "+c1.lidArea());
    System.out.println("Volume: "+c1.volume());
    }
}