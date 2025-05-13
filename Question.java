class Test {
    void add(int a,char b) {
        System.out.println(a+b);
    }
    void add(int a,double b) {
        System.out.println(a+b);
    }
}
class Question {
    public static void main(String[]args){
        Test obj = new Test();
        obj.add(11,11);
    }
}