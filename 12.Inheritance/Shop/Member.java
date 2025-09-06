class Member extends Customer {
    private String custid;
    private String address;
    private String dob;

    public Member(String name,String phno,String custid,String address,String dob) {
        super(name,phno);
        this.custid = custid;
        this.address = address;
        this.dob = dob;
    }

    public String getCustId() {return custid;}
    public String getCustAddress() {return address;}
    public void setCustAddress(String address) {this.address = address;}
    public String getDob() {return dob;}

    public String toString() {
        return  "\nCustomer Name: "+getName()+
                "\nCustomer Phno: "+getPhno()+
                "\nCustomer ID: "+custid+
                "\nCustomer Address: "+address+
                "\nCustomer DOB: "+dob;
    }

    public void callBack() {
        System.out.println("Calling Back Customer");
    }
    public void PayBill() {         //Overriding method//
        System.out.println("Bill Paid Member wala");
    }
}