public class RegularExpressions {
    public static void main(String []args) {
        String str = new String("Programmer@gmail.com");
        String str2 = new String("Programmer026@hotmail.com");
        System.out.println("Proper Email: "+str.matches("\\w+[@]{1}[a-z]+.com"));
        System.out.println("Str2 Proper Email: "+str2.matches("\\w+[@]{1}[a-z]+.com"));
        System.out.println("Domain Name: "+str.substring(str.indexOf('@')+1));
        System.out.println("Username: "+str.substring(0,(str.indexOf('@'))));
        System.out.println("Str is Gmail: "+str.startsWith("gmail",(str.indexOf('@')+1)));
        System.out.println("Str2 is Hotmail: "+str2.startsWith("hotmail",(str2.indexOf('@')+1)));
    }
}