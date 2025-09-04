class SmartPhone extends CellPhone {
    private String macaddress;

    public SmartPhone(String imei,String phname,String macaddress) {
        super(imei,phname);
        this.macaddress = macaddress;
    }

    public void setMacAddress(String macaddress) {this.macaddress = macaddress;}
    public String getMacAddress() {return macaddress;}

    public String toString() {
        return "\nIMEI: "+getImei()+
                "\nPhone Name: "+getPhname();
    }

    public void playSong() {
        System.out.println("Song is Playing");
    }
    public void clickPhoto() {
        System.out.println("Picture Clicked");
    }
    public void captureVideo() {
        System.out.println("Video Captured");
    }
}