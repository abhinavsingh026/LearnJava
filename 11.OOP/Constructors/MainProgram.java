import java.util.Arrays;
class Subject {
    private String subID;
    private String subName;
    private int maxMarks;
    private int marksObtained;

    public Subject(String subID,String subName,int maxMarks) {
        this.subID = subID;
        this.subName = subName;
        this.maxMarks = maxMarks;
    }

    public String getSubID() {return subID;}
    public String getSubName() {return subName;}
    public int getMaxMarks() {return maxMarks;}
    public void setMaxMarks(int maxMarks) {this.maxMarks = maxMarks;}
    public int getMarksObtained() {return marksObtained;}
    public void setMarksObtained(int marksObtained) {this.marksObtained = marksObtained;}

    boolean isQualified() {return marksObtained>=maxMarks*0.4;} //default access modifier//

    public String toString(){
        return "\nSubject ID: "+subID+
                "\nName: "+subName+
                "\nMarks Obtained: "+marksObtained+
                "\nPass:"+isQualified();
    }
}
class Student {
    private String rollNo;
    private String name;
    private String dept;
    private int numOfSubs;
    private Subject []sub;

    public Student(String rollNo,String name,String dept,int numOfSubs) {
        this.rollNo = rollNo;
        this.name = name;
        this.dept = dept;
        this.numOfSubs = numOfSubs;
    }

    public String getRollNo() {return rollNo;}
    public String getName() {return name;}
    public String getDept() {return dept;}
    public void setDept(String dept) {this.dept = dept;}
    public int getnumOfSubs() {return numOfSubs;}
    public Subject[] getSubjects() {return sub;}
    public void setSubjects(Subject... subs){
        this.sub = subs;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nRoll No: ").append(rollNo)
        .append("\nName: ").append(name)
        .append("\nDept: ").append(dept)
        .append("\nNo. of Subs: ").append(numOfSubs)
        .append("\nSubjects: ");

        if(sub != null) {
            for(var s:sub) {
                sb.append("\n---").append(s);
            }
        } else {
            sb.append("No Subjects assigned Yet");
        }
        return sb.toString();
    }
}
public class MainProgram {
    public static void main(String []args) {
        Subject subs[]  = new Subject[4];
        subs[0] = new Subject("ds-101","Data Structure",100);
        subs[1] = new Subject("al-102","Algorithms",100);
        subs[2] = new Subject("os-103","Operating Systems",100);
        subs[3] = new Subject("en-104","English Language",80);

        subs[0].setMarksObtained(25);
        subs[1].setMarksObtained(45);
        subs[2].setMarksObtained(80);
        subs[3].setMarksObtained(75);

        for(var sb:subs) 
            System.out.println(sb);
        System.out.println();
        Student stud[] = new Student[4];
        stud[0] = new Student("EE-234","Abhinav Singh","Engineering",4);
        stud[1] = new Student("BE-321","Abhinav Kumar","Commerce",3);
        stud[2] = new Student("GE-938","Kumar Abhinav","General",2);
        stud[3] = new Student("CS-997","Singh Abhinav","Professional",4);

        stud[0].setSubjects(subs); // Assign all subjects - subs array to Student-0//
        stud[1].setSubjects(subs[0], subs[1], subs[2]); //Assign 3 subs only cz we usin varargs//
        stud[1].setDept("B-Engineering");
        stud[2].setSubjects(Arrays.copyOfRange(subs,0,2)); //Assign 2 subs only usin slice fn//

        for(var st:stud) {
            System.out.println(st);
        }
    }
}