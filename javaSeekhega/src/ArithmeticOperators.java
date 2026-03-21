public class ArithmeticOperators {
    public static void main(String[] args){
        int a = 10;
        byte b = 20;
        // byte c = a+b; //this will give error
        b += a; //compound statement don't give error
        System.out.println(b);
        long c = 20;
        long d = c + a;//here type promotion is happening
        System.out.println(d);

        int x =0;
        int y=10;
//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at ArithmeticOperators.main(ArithmeticOperators.java:14)
//        int w = y/x;
//        System.out.println(w);

//        Exception in thread "main" java.lang.ArithmeticException: / by zero
//        at ArithmeticOperators.main(ArithmeticOperators.java:19)
//        int m = y%x;
//        System.out.println(m);

        int z = 10;
        float n = 20.454545f;
        float p = z+n;
        System.out.println(p);

    }
}
