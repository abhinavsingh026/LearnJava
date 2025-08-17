class CommandLineArguments {
    public static void main(String []args) {
        // double sum = 0;
        // for(int i=0;i<args.length;i++) {
        //     sum += Double.parseDouble(args[i]);
        // }
        // System.out.println("Sum is: "+sum);
        double add = 0;
        for(String x:args) {
            if(x.matches("[0-9\\.]+")) // only adds numbers and ignored other things //
                add += Double.parseDouble(x);
       }
        System.out.println("Addition is: "+add);
    }
}