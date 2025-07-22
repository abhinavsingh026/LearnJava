public class FormatSpec {
    public static void main(String []args) {
        Conversion obj1 = new Conversion();
        Argument_index obj2 = new Argument_index();
        IntegerFlagWidth obj3 = new IntegerFlagWidth();
        FloatFlagWidth obj4 = new FloatFlagWidth();
        StringFlagWidth obj5 = new StringFlagWidth();
        obj1.print();
        obj2.print();
        obj3.print();
        obj4.print();
        obj5.print();
    }
}
class Conversion { 
    void print() { 
        System.out.printf("%d %o %x\n", 46859,46859,46859);
        System.out.printf("%f %e %g\n", 123.45f,123.45f,123.45f);
        System.out.printf("%s\n","Hello");
    }
}
class Argument_index { 
    void print() { 
        System.out.printf("%2$s %3$d %1$f\n", 23.45f,"Hello",24); // looks for value at respective argument index mentioned
    }
}
class IntegerFlagWidth { 
    void print() { 
        //Integer - Flags and Width
        System.out.printf("% d\n", 10);         //Output: " 10"
        System.out.printf("% d\n", -10);        //Output: "-10" - Space doesn't work on negative no.
        System.out.printf("%(d\n", -12);        //Output: "(12)"
        System.out.printf("%-5d", 42);          //Output: "42   "
        System.out.printf("%05d\n", 42);        //Output: "00042"
        System.out.printf("%5d\n", 42);         //Output: "   42"
        System.out.printf("%+5d\n", 42);        //Output: "  +42"
        System.out.printf("%(5d\n", -42);       //Output: " (42)"
        System.out.printf("%,10d\n", 1234567);   //Output: "1,234,567" After comma '+' 'space' '(' works
        System.out.printf("%8d\n", 1234567);    //Output: " 1234567" Width adds space before no. to make it to that(8) index
        System.out.printf("%,8d\n", 123456789); //Output: "123,456,789" Width can't reduce No.
    }
}
class FloatFlagWidth { 
    void print() { 
        //Float - Flags and Width
        System.out.printf("%12f\n", 123.45f); //Output: "  123.449997" (Stored Precisely)
        System.out.printf("%5.1f\n", 12.45f); //Output: " 12.4"
        System.out.printf("%010f\n", 1.12f); //Output: "001.120000"
        System.out.printf("% f\n", 2.3f); //Output: " 2.300000"
        System.out.printf("%+10f\n", 2.3f); //Output: " +2.300000"
        System.out.printf("%-12f", 2.3f); //Output: "2.300000    "
        System.out.printf("%-(12f\n", -2.3f); //Output: "(2.300000)  "
        System.out.printf("%(f\n", -2.3f); //Output: "(2.300000)"
        System.out.printf("%,f\n", 145723.456789); //Output: "145,723.456789"
        System.out.printf("%,15f\n", 145723.456789); //Output: " 145,723.456789" After comma '+' 'space' '(' works
    }
}
class StringFlagWidth { 
    void print() { 
        //String - Flags and Width
        System.out.printf("%10s\n","Java"); //Output: "      Java"
        System.out.printf("%-10s\n","Java"); //Output: "Java      "
    }
}