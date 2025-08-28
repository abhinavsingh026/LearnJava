class Customer {
    private String customerid;
    private String customername;
    private String customeraddress;
    private String customerphno;

    public Customer(String id) {
        customerid = id;
    }
    public Customer(String id,String na) {
        customerid = id;
        customername = na;
    }
    public Customer(String id,String na,String ad,String ph) {
        customerid = id;
        customername = na;
        customeraddress = ad;
        customerphno = ph;
    }

    public String getCustomerId() {
        return customerid;
    }
    public String getCustomerName() {
        return customername;
    }
    public String getCustomerAddress() {
        return customeraddress;
    }
    public void setCustomerAddress(String ad) {
        customeraddress = ad;
    }
    public String getCustomerphno() {
        return customerphno;
    }
    public void setCustomerphno(String ph) {
        customerphno = ph;
    }
    public String toString() {
        return "\nCustomer ID: "+customerid+"\nCustomer Name: "+customername+"\nCustomer Address: "+customeraddress+"\nCustomer Phone No: "+customerphno;
    }

    public static void main(String []args) {
        Customer c1 = new Customer("AB-12");
        Customer c2 = new Customer("SM-14","Abhinav Kumar");
        Customer c3 = new Customer("GB-16","Abhinav Singh","123 HighStreet,London","+91 1234567890");
        System.out.println("Customer ID: "+c1.getCustomerId());
        System.out.println("Customer Name: "+c1.getCustomerName());
        System.out.println();
//Customer Address & Phone No. can be changed/set later by using setter method//
        System.out.println(c2); // calling the toString method //
        System.out.println("Customer ID: "+c2.getCustomerId());
        System.out.println("Customer Name: "+c2.getCustomerName());
        System.out.println("Customer Address: "+c2.getCustomerAddress());
        System.out.println();

        System.out.println("Customer ID: "+c3.getCustomerId());
        System.out.println("Customer Name: "+c3.getCustomerName());
        System.out.println("Customer Address: "+c3.getCustomerAddress());
        System.out.println("Customer Phone No: "+c3.getCustomerphno());
    }
}