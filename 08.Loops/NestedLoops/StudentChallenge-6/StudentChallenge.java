public class StudentChallenge {
    public static void main(String []args) {
        PatternOne obj = new PatternOne();
        obj.onepattern();
        PatternTwo obj1 = new PatternTwo();
        obj1.twopattern();
        PatternThree obj2 = new PatternThree();
        obj2.threepattern();
        PatternStarOne obj3 = new PatternStarOne();
        obj3.onestarpattern();
    }
}
class PatternOne {
    void onepattern() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class PatternTwo {
    void twopattern() {
        int n1 = 0;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                ++n1;
                System.out.format("%02d ",n1);
            }
            System.out.println();
        }
        System.out.println();
    }
}
class PatternThree {
    void threepattern() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=6-i;j++) {
                System.out.print(j+" "); //("* ") // (i+" ") //count=0 & count++;
            }
            System.out.println();
        }
        System.out.println();
    }
}
class PatternStarOne {
    void onestarpattern() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}