class Question14 {
    public static void main(String[]args) {
        int a = 10;
        Integer obj = Integer.valueOf(a);
        System.out.println("Boxed Integer Object: "+obj);
        Integer autoObj = a;
        System.out.println("Auto-boxed Integer: "+autoObj);
        int b = obj.intValue();
        System.out.println("Unboxed value: "+b);
        int c = autoObj;
        System.out.println("Auto-unboxed value: "+c);
    }
}