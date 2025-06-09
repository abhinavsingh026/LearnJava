import java.util.*;
class TriangleAreaTwo {
    public static void main(String[]args) {
        int a,b,c;
        float s;
        double area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides(int) of the Triangle: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        s = (a+b+c)/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.printf("Area of the Triangle is: %.3f",area);
    }
}