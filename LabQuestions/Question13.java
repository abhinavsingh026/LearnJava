class Question13 {
    static int sum(int... numbers) {
        int total = 0;
        for(int num: numbers) {
            total += num;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Sum of 2,4: "+sum(2,4));
        System.out.println("Sum of 1,2,3,4,5: "+sum(1,2,3,4,5));
    }
}