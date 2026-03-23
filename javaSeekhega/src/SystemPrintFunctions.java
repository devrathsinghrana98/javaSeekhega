import java.util.Locale;

public class SystemPrintFunctions {
    public static void main(String[] args){
        System.out.println("The sum of " + 5 + " and " + 6 + "is: " + (5+6));
        System.out.print("The sum of " + 5 + " and " + 6 + "is: " + (5+6) + "\n");
        System.out.print("Hello world!" + "\n");
        String c = "sum";
        int a = 5;
        int b = 6;
        System.out.printf(Locale.TRADITIONAL_CHINESE, "The %s of %d and %d is %d \n",c,a,b,a+b);
        System.out.printf("Hello World!");
    }

}
