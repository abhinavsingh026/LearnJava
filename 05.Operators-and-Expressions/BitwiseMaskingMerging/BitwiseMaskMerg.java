import java.lang.*;
public class BitwiseMaskMerg {
    public static void main(String []args) {
        Swapping obj1 = new Swapping();
        Merging obj2 = new Merging();
        obj1.swap();
        obj2.merg();
    }
}
class Swapping {
    int a = 10, b = 15;
    void swap() {
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a = "+a+" b = "+b);
    }
}
class Merging {
    byte a = 9, b = 12;
    void merg() {
        b = (byte)(b<<4);
        a = (byte)(a|b);
        System.out.println(String.format("%s",Integer.toBinaryString(a)));
        System.out.println("No. Stored in Left 4 digits of byte: "+((a&0b11110000)>>4));
        System.out.println("No. Stored in Right 4 digits of byte: "+(a&0b00001111));
   }
}
