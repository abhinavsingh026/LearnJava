class Question4 {
    public static void main(String[]args) {
        int arr[][] = { {1,2,3,4},
                    {5,6},
                    {7,8,9},
                    };
        System.out.println("Total Rows: "+arr.length);
        for(int i=0;i<arr.length;i++) {
            System.out.println("Length of Row "+i+" :"+arr[i].length);
        }
    }
}