class Student {
    private String rollNo;
    private String name;
    private String dept;
    private String subs;

    public Student(String rollNo,String name,String dept,String subs) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.subs = subs;
    }

    public String getRollNo() {return rollNo;}
    public String getName() {return name;}
    public String getDept() {return dept;}
    public void setDept(String dept) {this.dept = dept;}
    public String getSubs() {return subs;}
    public void setSubs(String subs) {this.subs = subs;}

        public String toString(){
        return "\nRoll No: "+rollNo+"\nName: "+name+"\nDept: "+dept+"\nSubjects: "+subs;
    }
}
class StudentChallenge {
    public static void main(String []args) {
        Student stud[] = new Student[5];
        stud[0] = new Student("EE-234","Abhinav Singh","Engineering","Data Structure,compiler design & Mongo DB");
        stud[1] = new Student("BE-321","Abhinav Kumar","Commerce","Algorithms,Maths & English");
        stud[2] = new Student("GE-938","Kumar Abhinav","General","Operating Systems & English,Maths");

        stud[1].setDept("B-Engineering");

        for(var s:stud) {
            System.out.println(s);
        }
    }
}