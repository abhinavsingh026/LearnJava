class StringObj {
    public static void main(String []args) { 
        char c[] = {'A','B','C','D','E'};
        byte b[] = {65,66,67,68,};
        String str1 = new String(c);
        String str2 = new String(b);
        String str3 = new String("Java Program"); //2-Objects created. 1 in String constant pool & 1 in Heap area.
        String str4 = "Java Program"; // 1-Object created in String constant pool
        String str5 = "Java Program"; // 1-Object created in String constant pool
        String str6 = new String(c,1,3); //Output: "ell"/1-Starting Index/3-No. of place printed
        String str7 = new String(b,1,2); //Output: "BC"/1-Starting Index/2 -No. of place printed
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str6);
        System.out.println(str7);
        System.out.println(str4==str5); // Both pool Objects Equal
        System.out.println(str3==str5); // Literal same but Address different.
    }
}