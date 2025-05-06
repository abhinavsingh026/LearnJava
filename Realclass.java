class Point {
    double x,y;
    Point() {
        x=y=0;
    }
    Point(double a,double b) {
        x=a;y=b;
    }
}
class Realclass {
    public static void main(String[] args) {
        Point p1 = new Point(5.6,8.9);
        System.out.println(p1.x+" "+p1.y);
    }
}