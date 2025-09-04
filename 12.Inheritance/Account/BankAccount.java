public class BankAccount {
    public static void main(String []args) {
        Account cust1 = new Account(12940404,"Abhinav Singh","MirrorPark-Street-07","+91 8955443312","26/12/2005");
        System.out.println(cust1);
        SavingsAccount sav1 = new SavingsAccount(12940404,"Abhinav Singh","MirrorPark-Street-07","+91 8955443312","26/12/2005",25000);
        System.out.println("Fixed Deposit Balance: "+sav1.getFdbalance());
        LoanAccount ln1 = new LoanAccount(12940404,"Abhinav Singh","MirrorPark-Street-07","+91 8955443312","26/12/2005",6000);
        System.out.println("Loan Amount: "+ln1.getLoanamnt());
        ln1.setTotalemi(7000);
        ln1.payEmi(5000);
        ln1.topuploan();
        sav1.deposit(50000);
        System.out.println("Customer Main Balance: "+sav1.getBalance());
        sav1.withdraw(20000);
        System.out.println("Customer Updated Balance: "+sav1.getBalance());
        sav1.liquidate(10000);
        System.out.println("N-Fixed Deposit Balance: "+sav1.getFdbalance());
    }
}