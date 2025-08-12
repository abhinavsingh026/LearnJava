public class ReturnTypes {
    static int max(int a,int b) {
        return a>b?a:b;
    }
    static void update(int A[],int index,int value) {
        A[index] = value;
    }
    static String UserName(String email) {
        int a = email.indexOf('@');
        String name = email.substring(0,a);
        return name;
    }
    int maximum(int x,int y) {
        if(x>y)
            return x;
        else 
            return y;
    }
    public static void main(String []args) {
        // 1st method "max"//
        System.out.println(max(13,19));
        // 2nd method "update"//
        int X[] = {2,3,4,5,6};
        update(X,3,21);
        for(int z:X) 
            System.out.print(z+" ");
        System.out.println();
        // 3rd method "UserName" //
        System.out.println(UserName("rakeshbharti029@gmail.com"));
        String getname = UserName("ankitsingh024@gmail.com");
        System.out.println(getname);
        // 4th method "maximum" //
        ReturnTypes obj = new ReturnTypes();
        int C = obj.maximum(15,12);  // Calling through making an object //
        System.out.print(C);
    }
}