class Student {
    public String name;
    public int age;
    public String course;
    public float m1,m2,m3;

    public void printName() {
        System.out.println("Name: "+name);
    }
    public void printAge() {
        System.out.println("Age: "+age);
    }
    public void printCourse() {
        System.out.println("Course: "+course);
    }
    public float calculateTotalMarks() {
        return m1+m2+m3;
    }
    public float calculateAvgMarks() {
        return (m1+m2+m3)/3;
    }
}
public class ClassStudent {
    public static void main(String []args) {
    Student s1 = new Student();
    s1.name = "Abhinav";
    s1.age = 19;
    s1.course = "Java Programming";
    s1.m1 = 85;
    s1.m2 = 67;
    s1.m3 = 87;

    s1.printName();
    s1.printAge();
    s1.printCourse();
    System.out.println("Total Marks: "+s1.calculateTotalMarks()+"/300");
    System.out.println("Average Marks: "+s1.calculateAvgMarks());
    }
}