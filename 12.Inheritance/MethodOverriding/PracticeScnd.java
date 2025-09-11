class Car {
    public void start() {
        System.out.println("Car Started");
    }
    public void accelerate() {
        System.out.println("Car Accelerated");
    }
    public void changeGear() {
        System.out.println("Manual Gear Changed");
    }
}
class LuxuryCar extends Car {
    public void changeGear() {
        System.out.println("Automaic Gear Changed");
    }
    public void openRoof() {
        System.out.println("Sunroof/moonroof Opened");
    }
}
public class PracticeScnd {
    public static void main(String []args) {
        Car c = new Car();
        c.start();
        c.accelerate();
        c.changeGear();

        LuxuryCar lexus = new LuxuryCar();
        lexus.start();
        lexus.accelerate();
        lexus.changeGear();
        lexus.openRoof();

        Car lxc = new LuxuryCar();//Super class reference and Sub class object//
        lxc.start();
        lxc.accelerate();
        lxc.changeGear(); //method of object(of sub class here) will be called-we can see through over-ridden method example//
        // lxc.openRoof(); //method of sub class won't work as we are working with super class object //
    }
}