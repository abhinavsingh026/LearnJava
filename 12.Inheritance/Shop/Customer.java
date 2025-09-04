class Customer {
    private String name;
    private String phno;

    public Customer(String name,String phno) {
        this.name = name;
        this.phno = phno;
    }

    public String getName() {return name;}
    public String getPhno() {return phno;}
    public void setPhno(String phno) {this.phno = phno;}

    public String toString() {
        return "\nCustomer Name: "+name+
                "\nCustomer Phno: "+phno;
    }

    public void PayBill() {
        System.out.println("Bill Paid Customer Wala");
    }
}