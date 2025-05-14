import java.lang.*;
class Morphism {
        void sum() {
        int a,b,c;
        a = 10;
        b = 20;
        c = a+b;
        System.out.println(c);
    }
    void sum(int a,int b) {
        int c = a+b;
        System.out.println(c);
    }
    void sum(int x,float y) {
        float z = x+y;
        System.out.println(z);
    }
    // int sum(int i, int j) {
    //     int k = i+j;
    //     return(k);
    // }
}
class PolyMorphism {
    public static void main(String[]args) {
        Morphism obj = new Morphism();
        obj.sum();
        obj.sum(100,20);
        obj.sum(50,30.45f);
        // int sum = obj.sum(20,30);
        // System.out.println(sum);
    }
}