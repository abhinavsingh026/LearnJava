public class RemoveFind {
    public static void main(String []args) {
        String str = "a!B@c#1$2%3^~6";
        str = str.replaceAll("\\W","");
        System.out.println(str);
        String str1 = "     a b  h    I n    a v   ";
        str1 = str1.replaceAll("\\s","").trim(); // trim optional
        System.out.println(str1);
        //String[] string.split(regex);
        String words[] = str1.split("\\s");
        System.out.println(words.length);
        String str2 = "Pneumono ultra microscopic silico volcano coniosis";
        String WordCount[] = str2.split("\\s");
        System.out.println(WordCount.length);
    }
}