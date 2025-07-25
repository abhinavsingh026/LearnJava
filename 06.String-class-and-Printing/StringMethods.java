class StringMethods {
    public static void main(String []args) {
        String str = new String("WelCome");
        //Int string.length();
        System.out.println(str.length());
        //String string.toUpperCase(); & String string.toLowerCase();
        String str1 = str.toUpperCase();
        System.out.println(str1);
        String str2 = str.toLowerCase();
        System.out.println(str2);
        str = str.toUpperCase();
        System.out.println(str);
        str = str.toLowerCase();
        System.out.println(str);
        //String string.trim(); - removes trailing and leading backspaces
        String str3 = new String("   ComosEsats   ");
        String str4 = str3.trim();
        System.out.println(str4);
        str3 = str3.trim();
        System.out.println(str3);
        //String string.substring(int begin);
        String str5 = str3.substring(3);
        System.out.println(str5);
        str3 = str3.substring(3);
        System.out.println(str3);
        //String string.substring(int begin, int end);
        String str6 = "Java Program";
        String str7 = str6.substring(2,6);
        System.out.println(str7);
        str6 = str6.substring(2,6);
        System.out.println(str6);
        //String string.replace(char old, char new);
        String str8 = "Programming";
        String str9 = str8.replace('r','k');
        System.out.println(str9);
        str8 = str8.replace('r','k');
        System.out.println(str8);
        //Boolean string.startsWith(string s); & Boolean string.endsWith(string s);
        String str10 = new String("www.abcd.org");
        System.out.println(str10.startsWith("www."));
        System.out.println(str10.endsWith(".org"));
        //Char string.charAt(int index);
        System.out.println(str10.charAt(5));
        //Int string.indexOf(string s);
        System.out.println(str10.indexOf(".")); // searches of string in whole index(left to right)
        System.out.println(str10.indexOf("cd")); // if "cd" not found returns -1
        System.out.println(str10.indexOf(".",4)); // searches for string after 4 index
        System.out.println(str10.indexOf("?")); // returns -1
        System.out.println();
        //Int string.lastIndexOf(string s);
        System.out.println(str10.indexOf(".")); // searches of string in whole index(right to left)
        System.out.println(str10.indexOf("bc")); // if "cd" not found returns -1
        System.out.println(str10.indexOf(".",2)); // searches for string AFTER 2 index
        System.out.println(str10.indexOf("/")); // returns -1
        //Boolean string.equals(string s);
        //Boolean string.equalsIgnoreCase(string s);
        String str11 = "java";
        String str12 = "java";
        String str13 = "PYTHON";
        String str14 = "python";
        String str15 = new String("java");
        System.out.println(str11.equals(str12)); //Comparing by ASCII
        System.out.println(str12.equals(str11)); //Comparing by ASCII
        System.out.println(str13.equals(str14)); //Comparing by ASCII
        System.out.println(str13.equalsIgnoreCase(str14)); //Comparing by ASCII Ignoring Case
        //Int string.compareTo(string s);
        System.out.println(str12.compareTo(str14)); // 'j' se 'p' 6 dur hai aur j chota hai 
        System.out.println(str14.compareTo(str12)); // 'p' se 'j' 6 dur hai aur p bada hai
        System.out.println(str11.compareTo(str12)); // Same i.e,. Output: 0
        System.out.println(str13.compareTo(str14)); // UpperCase ASCII very less than LowerCase
        //Cheking String equals and Reference equals 
        System.out.println(str11.equals(str12));
        System.out.println(str15.equals(str12));
        System.out.println(str11==str12);
        System.out.println(str12==str15);
        //String valueOf(int i);
        System.out.println(String.valueOf(45)); // 45 is now in string
    }
}