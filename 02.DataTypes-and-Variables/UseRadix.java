import java.util.Scanner;
public class UseRadix {
    public static void main(String[]args) {
        //Radix Functions - Integer.parseInt("int literal",baseofnumbersystem)
        int binary = Integer.parseInt("1010", 2);     // binary to decimal → 10
        System.out.println(binary);
        int octal = Integer.parseInt("17", 8);        // octal to decimal → 15
        System.out.println(octal);
        int decimal = Integer.parseInt("123", 10);    // decimal → 123
        System.out.println(decimal);
        int hex = Integer.parseInt("1A", 16);         // hex to decimal → 26
        System.out.println(hex);
        Decimal_Number obj = new Decimal_Number();
        obj.CalculateDecimal();
        Octal_Number obj1 = new Octal_Number();
        obj1.CalculateOctal();
        Hex_Number obj2 = new Hex_Number();
        obj2.CalculateHex();
    }
}
class Decimal_Number {
    void CalculateDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. in Binary: ");
        sc.useRadix(2);
        //The no. given in radix is the base of that number system.It will convert into INT
        //since there is nextInt(); Ex-1010 output - 10(in decimal system)
        int binary_number = sc.nextInt();
        System.out.println("Binary No. is(In Decimal): "+binary_number);
    }
}
class Octal_Number {
    void CalculateOctal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. in Octal: ");
        sc.useRadix(8);
        int octal_number = sc.nextInt();
        System.out.println("Octal No. is(In Decimal): "+octal_number);
    }
}
class Hex_Number {
    void CalculateHex() {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter No. is HexaDecimal: ");
    sc.useRadix(16);
    int hex_number = sc.nextInt();
    System.out.println("Hex No. is(In Decimal): "+hex_number);
    }
}