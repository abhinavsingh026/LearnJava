class LoanAccount extends Account {
    private double loanamnt;
    private double totalemi;
    private double emipaid;

    public LoanAccount(long accNo,String name,String address,String phno,String dob,double loanamnt) {
        super(accNo,name,address,phno,dob);
        this.loanamnt = loanamnt;
    }

    public double getLoanamnt() {return loanamnt;}
    public void setLoanamnt(double loanamnt) {this.loanamnt = loanamnt;}
    public double getTotalemi() {return totalemi;}
    public void setTotalemi(double totalemi) {this.totalemi = totalemi;}
    public double getEmipaid() {return emipaid;}

    public void payEmi(double amnt) {
        totalemi -= amnt;
        emipaid += amnt;
    }
    public void topuploan() {
        if(emipaid>=totalemi*0.4)
            System.out.println("You're Eligible for Top-Up Loan");
    }
    public void repayment(double amnt) {
        if(loanamnt == amnt)
            loanamnt = 0;
    }
}