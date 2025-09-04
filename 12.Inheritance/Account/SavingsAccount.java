class SavingsAccount extends Account {
    private double fdbalance;
    private double liquidbal;

    public SavingsAccount(long accNo,String name,String address,String phno,String dob,double fdbalance) {
        super(accNo,name,address,phno,dob);
        this.fdbalance = fdbalance;
    }

    public double getFdbalance() {return fdbalance;}
    public double getLiquidbal() {return liquidbal;}

    public void deposit(double amnt) {
        balance += amnt;
    }
    public void withdraw(double amnt) {
        balance -= amnt;
    }
    public void fixedeposit(double amnt) {
        fdbalance += amnt;
    }
    public void liquidate(double amnt) {
        fdbalance -= amnt;
        liquidbal += amnt;
    }
}