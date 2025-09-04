public class Shop {
    public static void main(String []args) {
        Customer c1 = new Customer("Abhinav Gupta","+91 8709007168");
        System.out.println(c1);
        c1.PayBill();
        Member m1 = new Member("Abhinav Gupta","+91 8709457168","REG-045","OldMonk Street","18/12/1231");
        System.out.println(m1);
        m1.PayBill();
        m1.callBack();
    }
}