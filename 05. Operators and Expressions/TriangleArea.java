// Area of a Triangle using Base and Height //
import java.util.*;
class TriangleArea {
    public static void main(String[]args) {
        float base,height,area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base of the Triangle: ");
        base = sc.nextFloat();
        System.out.print("Enter Height of the Triangle: ");
        height = sc.nextFloat();
        area = base*height/2;
        float area1 = base*height*0.5f;
        float area2 = 1f/2f*base*height;
        System.out.println("Area of the Triangle is: "+area);
        System.out.println("Area1 of the Triangle is: "+area1);
        System.out.print("Area2 of the Triangle is: "+area2);
    }
}