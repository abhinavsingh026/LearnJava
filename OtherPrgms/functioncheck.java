import java.util.Scanner;
class Memfunction
{
        double Xco,Yco;
        void initialize(double x,double y){
            Xco = x;
            Yco = y;
        }
        void display(){
            System.out.println(Xco+" "+Yco);
        }
}
class functioncheck
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers:- ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        Memfunction obj = new Memfunction();
        obj.initialize(x,y);
        obj.display();
        sc.close();
    }
}