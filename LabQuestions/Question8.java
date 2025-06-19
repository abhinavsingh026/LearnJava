import java.util.Scanner;
class Question8 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 2 Strings: ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        String s3 = s1.concat(" "+s2);
        System.out.println("Concatenated String is: "+s3);
        System.out.println("Are s1 and s2 equal ? "+s1.equals(s2));
        StringBuffer sb = new StringBuffer(s1);
        sb.append(" programming");
        System.out.println("After Append: "+sb);
        sb.insert(5, " World");
        System.out.println("After Insert: "+sb);
        sb.setCharAt(1,'v');
        System.out.println("After SetCharAt: "+sb);
        sb.setLength(3);
        System.out.println("After SetLength: "+sb);
    }
}