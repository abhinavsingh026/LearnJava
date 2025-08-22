class Account {
    public String name;
    public long accNo;
    public double balance;

    public void printName() {
        System.out.println("Account Holder: "+name);
    }
    public void printAccNo() {
        System.out.println("Account Number: "+accNo);
    }
    public double deposit(double amount) {
        return balance=balance+amount;
    }
    public double withdraw(double amount) {
        return balance=balance-amount;
    }
}
public class ClassAccount {
    public static void main(String []args) {
        Account acc1 = new Account();
        acc1.name = "Abhinav Singh";
        acc1.accNo = 1294040404;
        acc1.balance = 100000;

        acc1.printName();
        acc1.printAccNo();
        System.out.println("Updated Balance: "+acc1.deposit(12000));
        System.out.println("Updated Balance: "+acc1.withdraw(13000));
    }
}