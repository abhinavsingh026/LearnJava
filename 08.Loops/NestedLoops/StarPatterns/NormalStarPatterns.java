public class NormalStarPatterns {
    public static void main(String []args) {
        StarPatternOne obj = new StarPatternOne();
        obj.onestarpattern();
        StarPatternTwo obj1 = new StarPatternTwo();
        obj1.twostarpattern();
        StarPatternThree obj2 = new StarPatternThree();
        obj2.threestarpattern();
        StarPatternFour obj3 = new StarPatternFour();
        obj3.fourstarpattern();
    }
}
class StarPatternOne {
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
class StarPatternTwo {
    void twostarpattern() {
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
class StarPatternThree {
    void threestarpattern() {
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
class StarPatternFour {
    void fourstarpattern() {
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5;j++) {
                if(i+j<=6)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}