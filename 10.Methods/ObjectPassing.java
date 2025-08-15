public class ObjectPassing {
    static void change1(int X[],int index,int value) {
        X[index] = value;
    }
    static void change2(int x,int value) {
        x = value;
    }
    static String change3(String str) {
        str = "Rakesh";
        return str;
    }
    public static void main(String []args) {
        int A[] = {2,3,4,5,6};
        change1(A,2,33);
        for(int x:A) 
            System.out.print(x+" ");  //Array - Object is changed in main method//
        System.out.println();
        int x = 10;
        change2(x,20);
        System.out.println(x); //Primitive data type is unchanged in main method//
        String name = "Abhinav";
        System.out.println(change3(name));
        System.out.println(name); //String - Object is not changed in main method//
                                  // Immutable //
    }
}