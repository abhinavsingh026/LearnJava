class VariableArguments {
    static int max(int...X) {
        if(X.length==0) return Integer.MIN_VALUE; //for null arguments//
        int max = X[0];
        for(int i=0;i<X.length;i++) {
            if(X[i]>max) max = X[i];
        }
        return max;
    }
    static float sum(float ...A) {
        float sum = 0;
        for(int i=0;i<A.length;i++) {
            sum += A[i];
        }
        return sum;
    }
    static double discount(double ...Price) {
        double pricesum = 0;
        for(int i=0;i<Price.length;i++) {
            pricesum += Price[i];
        }
        if(pricesum<500)
            pricesum = (pricesum - (0.05)*pricesum);
        else if(pricesum >=500 && pricesum <1000)
            pricesum = (pricesum - (0.1)*pricesum);
        return pricesum;
    }
    public static void main(String ...args) {
        System.out.println(max());  // yo'll get minimum integer value //
        System.out.println(max(2,3));
        System.out.println(max(2,3,4));
        System.out.println(max(2,3,4,5,6,7,8));
        System.out.println();

        System.out.println(sum());
        System.out.println(sum(11.2f,12.34f));
        System.out.println(sum(11.2f,12.34f,14.41f,23.14f,49.98f));
        System.out.println();

        System.out.println(discount());
        System.out.println(discount(100,399));
        System.out.println(discount(100,400));
        System.out.println(discount(100,400,200));
        System.out.println();
    }
}