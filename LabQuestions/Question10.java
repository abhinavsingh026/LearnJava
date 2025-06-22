class Distance {
    float feet;
    float inches;
    Distance(float f, float i) {
        feet = f;
        inches = i;
    }
    void display() {
        System.out.println("Distance "+feet+" feet "+inches+" inches");
    }
    Distance CloneDistance() {
        return new Distance(this.feet, this.inches);
    }
}
public class Question10 {
    public static void main(String[]args) {
        Distance d1 = new Distance(5.2f, 6.4f);
        Distance d2 = d1;
        Distance d3 = d1.CloneDistance();
        System.out.print("Object d1: "); d1.display();
        System.out.print("Reference d2: "); d2.display();
        System.out.print("Cloned d3: "); d3.display();
    }
}