abstract class KFC {
    KFC() {
        System.out.println("World KFC");
    }
    protected void makeItem() {        //Recipie method only official//
        System.out.println("Official Recipie");
    }
    abstract void billing();    //defined standards of billing and offers//
    abstract void offers();
}
class MyKFC extends KFC {
    MyKFC() {       //first Super class constructor called then Sub Class//
        System.out.println("My KFC Franchise");
    }
    public void billing() { //defining & following standards made by abstract class//
        System.out.println("My Franchise Billing System");
    }
    public void offers() {
        System.out.println("My Franchise Offer System");
    }
    public void festiveOffers() {   //having own extra methods//
        System.out.println("My Franchise Festive Offer System");
    }
}
public class AbstractExample2 {
    public static void main(String []args) {
        KFC fc = new MyKFC();
        fc.makeItem();
        fc.billing();
        fc.offers();
        // fc.festiveOffers();   - Can't be called as reference is KFC class//
        System.out.println();
        
        MyKFC newfc = new MyKFC();
        newfc.makeItem();
        newfc.billing();
        newfc.offers();
        newfc.festiveOffers();
    }
}