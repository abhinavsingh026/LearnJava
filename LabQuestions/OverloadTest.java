class OverloadTest {
    void test(int x) {
        System.out.println("int: "+x);
    }
    void test(double y) {
        System.out.println("double: "+y);
    }
    public static void main(String[] args) {
        OverloadTest obj = new OverloadTest();
        obj.test(10);
        obj.test(10.5);
        obj.test('A');
        obj.test(12L);
    }
}