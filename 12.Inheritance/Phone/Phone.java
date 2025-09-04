public class Phone {
    public static void main(String []args) {
        CellPhone c1 = new CellPhone("35-007752-323751-3","Nokia");
        System.out.println(c1);
        c1.setPhno("+91 8709007168");
        c1.makeCall();
        c1.delContact();
        System.out.println("Nokia Ph No: "+c1.getPhno());
        SmartPhone s1 = new SmartPhone("89-012348-456981-3","Iphone XS","2C:54:91:88:C9:E3");
        System.out.println(s1);
        s1.setPhno("+01 012-65-89");
        s1.clickPhoto();
        s1.saveContact();
        System.out.println("Iphone Ph No: "+s1.getPhno());
    }
}