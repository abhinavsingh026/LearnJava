class Account {
    private long accNo;
    private String name;
    private String address;
    private String phno;
    private String dob;
    protected double balance;

    public Account(long accNo,String name,String address,String phno,String dob) {
        this.accNo = accNo;
        this.name = name;
        this.address = address;
        this.phno = phno;
        this.dob = dob;
    }

    public long getAccNo() {return accNo;}
    public String getName() {return name;}
    public String getDob() {return dob;}
    public String getAddress() {return address;}
    public void setAddress(String address) {this.address = address;}
    public String getPhno() {return phno;}
    public void setPhno(String phno) {this.phno = phno;}
    public double getBalance() {return balance;}
    public void setBalance(double balance) {this.balance = balance;}

    public String toString() {
        return "\nAccNo: "+accNo+
                "\nName: "+name+
                "\nAddress: "+address+
                "\nPhone No: "+phno+
                "\nD.O.B: "+dob;
    }
}