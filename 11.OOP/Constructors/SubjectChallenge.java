import static java.lang.System.out;  //importing static member out from system class//
class Subject {

    private String subID;
    private String subName;
    private int maxMarks;
    private float marksObtained;

    public Subject(String subID,String subName,int maxMarks) {
        this.subID = subID;
        this.subName = subName;
        this.maxMarks = maxMarks;
    }

    public String getSubID() {return subID;}
    public String getSubName() {return subName;}
    public int getMaxMarks() {return maxMarks;}
    public void setMaxMarks(int mm) {maxMarks = mm;}
    public float getMarksObtained() {return marksObtained;}
    public void setMarksObtained(float mo) {marksObtained = mo;}

    boolean isQualified() {return marksObtained>=maxMarks*0.4;} //default access modifier//

    public String toString(){
        return "\nSubject ID: "+subID+"\nName: "+subName+"\nMarks Obtained: "+marksObtained+"\nPass:"+isQualified();
    }
} 
public class SubjectChallenge {
    public static void main(String []args) {
        Subject subs[]  = new Subject[4];
        subs[0] = new Subject("ds-101","Data Structure",100);
        subs[1] = new Subject("al-102","Algorithms",100);
        subs[2] = new Subject("os-103","Operating Systems",100);
        subs[3] = new Subject("en-104","English Language",80);

        subs[0].setMarksObtained(25);
        subs[1].setMarksObtained(45);
        subs[2].setMarksObtained(40);
        subs[3].setMarksObtained(30);

        for(var s:subs) 
            out.println(s); //toString method is automatically called here by println//
    }
}