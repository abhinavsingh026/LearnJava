class PracticeOperators {
    public static void main(String[]args) {
        int x = 16,y=5;
        int d = x/y;
        int m = x%y;
        float c = (float)x/y;

        float a = 14.2f,b = 3.2f;
        float r = a%b;
        System.out.printf("%d\n%d\n%.2f\n%.2f\n",d,m,c,r);
        byte num1 = 10;
        short num2 = 15;
        int num3 = num1 + num2;

        float f1 = 12.5f;
        long l1 = 123l;
        float sum = f1 + l1;

        float f2 = 12.5f;
        double d1 = 123;
        double mul = f2 * d1;
        System.out.printf("%d\n%.2f\n%.3f\n",num3,sum,mul);

        char c1 = 50;
        int i1 = 40; 
        int sub = c1 - i1;
        System.out.printf("%d\n",sub);
    }
}