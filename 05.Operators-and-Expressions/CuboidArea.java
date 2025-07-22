import java.util.*;
class CuboidArea {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length,breadth and height of cuboid: ");
        float length = sc.nextFloat();
        float breadth = sc.nextFloat();
        float height = sc.nextFloat();
        float volume = length*breadth*height;
        float area = 2*((length*breadth)+(length*height)+(breadth*height));
        System.out.println("Volume of Cuboid is: "+volume);
        System.out.println("Area of Top and Bottom Face: "+2*(length*breadth));
        System.out.println("Area of Front and Back Face: "+2*(length*height));
        System.out.println("Area of Left and Right side Face: "+2*(breadth*height));
        System.out.println("Area of Cuboid is: "+area);
    }
}