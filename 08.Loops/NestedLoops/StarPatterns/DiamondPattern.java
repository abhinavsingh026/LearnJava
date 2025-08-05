public class DiamondPattern {
   public static void main(String []args) {
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