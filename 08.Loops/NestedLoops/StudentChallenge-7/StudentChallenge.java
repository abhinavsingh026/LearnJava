public class StudentChallenge {
    public static void main(String []args) {
        StarPatternOne obj = new StarPatternOne();
        obj.onestarpattern();
        StarPatternTwo obj1 = new StarPatternTwo();
        obj1.twostarpattern();
        StarPatternThree obj2 = new StarPatternThree();
        obj2.threestarpattern();
    }
}
class StarPatternOne {
    void onestarpattern() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(j>=i) //(i<=j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class StarPatternTwo {
    void twostarpattern() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(i+j>5) 
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
class StarPatternThree {
    void threestarpattern() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                    if(i+j>5) 
                        System.out.print("* ");
                    else
                        System.out.print("  ");
            }
            for(int k=2;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=2;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(j>=i) //(i<=j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for(int k=1;k<=3;k++) {
                if(i+k<=5)
                    System.out.print("* ");
                else 
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}