class TV {
    public void switchON() {
        System.out.println("TV is Switched ON");
    }
    public void changeChannel() {
        System.out.println("TV Channel Changed");
    }
    public void changeVolume() {
        System.out.println("TV Volume Changed");
    }
}
class SmartTV extends TV {
    public void switchON() {
        System.out.println("SmartTV is Switched ON");
    }
    public void changeChannel() {
        System.out.println("SmartTV Channel Changed");
    }
    public void changeVolume() {
        System.out.println("SmartTV Volume Changed");
    }
    public void Browse() {
        System.out.println("SmartTV is Browsing");
    }
}
public class PracticeFirst {
    public static void main(String []args) {
        TV t = new TV();        //TV class methods called//
        t.switchON();
        t.changeChannel();
        t.changeVolume();

        SmartTV st = new SmartTV();     //SmartTV class over-ridden methods called//
        st.switchON();
        st.changeChannel();
        st.changeVolume();
        st.Browse();

        TV stt = new SmartTV(); //Super class reference and Sub class object//
        stt.switchON(); //only methods available in super class are called for the sub class//
        stt.changeChannel();
        stt.changeVolume(); //we referring to SmartTV as normal TV so we don't know about ..//
        // stt.Browse();  // special features that the SmartTV has//
    }
}