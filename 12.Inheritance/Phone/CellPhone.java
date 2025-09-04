class CellPhone {
    private String imei;
    private String phname;
    private String phno;

    public CellPhone(String imei,String phname) {
        this.imei = imei;
        this.phname = phname;
    }

    public String getImei() {return imei;}
    public String getPhname() {return phname;}
    public String getPhno() {return phno;}
    public void setPhno(String phno) {this.phno = phno;}

    public String toString() {
        return "\nIMEI: "+imei+
                "\nPhone Name: "+phname;
    }

    public void makeCall() {
        System.out.println("Call Made");
    }
    public void sendSms() {
        System.out.println("SMS Sent");
    }
    public void saveContact() {
        System.out.println("Contact Saved");
    }
    public void delContact() {
        System.out.println("Contact Deleted");
    }
}