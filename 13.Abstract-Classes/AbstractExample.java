abstract class Hospital {               //abstract class//
    abstract public void emergency();   //defining standards or imposing standards//
    abstract public void appointment(); //for an Ideal Hospital//
    abstract public void billing();
    abstract public void admit();
    abstract public void safety();
}
class MyHospital extends Hospital {    //Sub class following standards made by abstract
    public void emergency() {       // class by overriding methods//
        System.out.println("My Hospital Emergency");
    }
    public void appointment() {
        System.out.println("My Hospital Appointment");
    }
    public void billing() {
        System.out.println("My Hospital Billing");
    }
    public void admit() {
        System.out.println("My Hospital Admit");
    }
    public void safety() {
        System.out.println("My Hospital Safety");
    }
}
public class AbstractExample {      // abstract class object can't be created. Ex- Its a body for imposing standards only, they ain't having real Hospital//
    public static void main(String []args) {
        Hospital h = new MyHospital();  // Reference of Hospital(General) as nobody knows special features of YourHospital// 
        h.emergency();
        h.appointment();
        h.billing();
        h.admit();
        h.safety();
    }
}