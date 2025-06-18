import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
class Decimal_Number {
    void CalculateDecimal() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No. in Binary: ");
        sc.useRadix(2);
        // The no. given in radix is the base of that number system and it will auto convert into integer 
        // since there is nextInt(); Ex-1010 output - 10(in decimal system)
        int binary_number = sc.nextInt();
        System.out.println("Decimal No. is: "+binary_number);
    }
}
class Octal_Number {
    void CalculateOctal() {
        System.out.print("Enter No. in Octal: ");
        in.useRadix(8);
        int octal_number = in.nextInt();
        System.out.println("Octal No. is: "+octal_number);
    }
}
// class Hex_Number {
//     System.out.print("Enter No. is HexaDecimal: ");
//         hx.useRadix(16);
//         int hex_number = hx.nextInt();
//         System.out.println("Hex No. is: "+hex_number);
// }
class UseRadix {
    public static void main(String[]args) {
        Decimal_Number obj = new Decimal_Number();
        obj.CalculateDecimal();
        Octal_Number obj1 = new Octal_Number();
        obj1.CalculateOctal();
    }
}