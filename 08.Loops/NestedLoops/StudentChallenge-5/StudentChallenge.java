public class StudentChallenge {
    public static void main(String []args) {
        PatternOne obj = new PatternOne();
        obj.onepattern();
        PatternTwo obj1 = new PatternTwo();
        obj1.twopattern();
        PatternThree obj2 = new PatternThree();
        obj2.threepattern();
        PatternFour obj3 = new PatternFour();
        obj3.fourpattern();
    }
}
class PatternOne {
    void onepattern() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class PatternTwo {
    void twopattern() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class PatternThree {
    void threepattern() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                System.out.print((i+j)+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class PatternFour {
    void fourpattern() {
        int n1 = 1;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                System.out.format("%02d ",n1);
                n1++;
            }
            System.out.println();
        }
        System.out.println();
    }
}