class Question2 {
    public static void main(String[]args) {
        int n = 5;
        int fact=1;
        for(int i=n;i>=1;i--)
            fact *= i;
        System.out.println("Factorial of "+n+" is: "+fact);
    }
}