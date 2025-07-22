class BitwiseDemo {
    public static void main(String []args) {
        int x = 10, y = 6;
        int a = x&y;
        int o = x|y;
        int n = x^y;
        System.out.println("Bitwise AND: "+a);
        System.out.println("Bitwise OR: "+o);
        System.out.println("Bitwise NOT: "+n);
        DemoOne obj1 = new DemoOne();
        DemoTwo obj2 = new DemoTwo();
        DemoThree obj3 = new DemoThree();
        DemoFour obj4 = new DemoFour();
        obj1.display();
        obj2.display();
        obj3.display();
        obj4.display();
    }
}
class DemoOne {
    int x = 0b1010; // 10 represented in binary form//
    int y = 0b0110; // 6 represented in binary form//
    int a = x&y;
    int o = x|y;
    int n = x^y;
    void display() {
        System.out.println(a+" "+o+" "+n);
        System.out.println(String.format("%s",Integer.toBinaryString(a)));
        System.out.println(String.format("%s",Integer.toBinaryString(o)));
        System.out.println(String.format("%s",Integer.toBinaryString(n)));
    }
}
class DemoTwo {
    int x = -0b1010;
    int y = 6;
    int z1 = x>>1;
    int z2 = x<<1;
    int z3 = y<<2;
    int z4 = y>>2;
    void display() {
        System.out.println("Right Shift: "+z1);
        System.out.println("Left Shift: "+z2);
        System.out.println("2-Left Shift y: "+z3);
        System.out.println("2-Right Shift y: "+z4); //quotient//
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(z1)));
        System.out.println(String.format("%s",Integer.toBinaryString(z2)));
        System.out.println(String.format("%s",Integer.toBinaryString(z3)));
        System.out.println(String.format("%s",Integer.toBinaryString(z4)));
    }
}
class DemoThree {
    int x = -10;
    int z1 = x>>1;
    int z2 = x<<1;
    int z4 = x>>>1;
    void display() {
        System.out.println("Right Shift: "+z1);
        System.out.println("Left Shift: "+z2);
        System.out.println(String.format("%32s",Integer.toBinaryString(z4)));
    }
}
class DemoFour {
    int x = 10;
    int y = ~x;
    void display() {
        System.out.println(y);
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(y)));
    }
}