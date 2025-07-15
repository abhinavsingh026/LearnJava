class IncDec {
    public static void main(String[] args) {
        int x = 5, y = 4, z, a;
        z = 2*x++ + x+3*++y;
        a = 2*x++ + x+3*++y + ++x;
        System.out.println(z);
        System.out.println(a);
        char c = 'A';
        c++;
        System.out.println(c);
        float f = 4.5f;
        f++;
        System.out.println(f);
        byte b = 5;
        b++;
        System.out.println(b);
    }
}