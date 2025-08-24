class Student {
    public String name;
    public int age;
    public int roll;
    public String course;
    public float m1,m2,m3;

    // public void printName() {
    //     System.out.println("Name: "+name);
    // }
    // public void printAge() {
    //     System.out.println("Age: "+age);
    // }
    // public String details() {
    //     return "Name: "+name+"\n"+"Age: "+age+"\n"+"Roll No:"+roll+"\n"+"Course: "+course+"\n";
    // }
        public String toString() {
        return "Name: "+name+"\n"+"Age: "+age+"\n"+"Roll No:"+roll+"\n"+"Course: "+course+"\n";
    }
    public float totalmarks() {
        return m1+m2+m3;
    }
    public float average() {
        return (m1+m2+m3)/3;
    }
    public char grades() {
        if(average()>0.00f && average()<=40)
                return 'C';
            else if(average()>=41 && average()<=70)
                return 'B';
            else if(average()>=71 && average()<=100)
                return 'A';
            else
                return 'S';
    }
}
public class ClassStudent {
    public static void main(String []args) {
    Student s1 = new Student();
    s1.name = "Abhinav";
    s1.age = 19;
    s1.roll = 2422136;
    s1.course = "Java Programming";
    s1.m1 = 85;
    s1.m2 = 67;
    s1.m3 = 87;

    // System.out.println("Details of Student:\n"+s1.details());
    System.out.println("Details of Student:\n"+ s1);    //directly calling whole object
    // which will automatically call 'toString' method //
    System.out.println("Total Marks: "+s1.totalmarks()+"/300");
    System.out.println("Average Marks: "+s1.average());
    System.out.println("Grade of Student: "+s1.grades());
    }
}