class Distance {
    float feet;
    float inches;
    void SetDistance(float feet, float inches) {
        this.feet = feet;
        this.inches = inches;
    }
    void display() {
        System.out.println("Distance: "+feet+" feet "+inches+" inches");
    }
}
public class Question9 {
    public static void main(String[]args) {
        Distance d1 = new Distance();
        d1.SetDistance(5.2f, 8.4f);
        d1.display();
    }
}