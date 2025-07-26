public class RegularExpressions {
    public static void main(String []args) {
        String str = new String("Programmer@gmail.com");
        System.out.println(str.matches("\\w+[@]{1}gmail.com"));
        System.out.println(str.substring(str.indexOf("@")+1));
        System.out.println(str.substring(0,(str.lastIndexOf("@"))));
    }
}