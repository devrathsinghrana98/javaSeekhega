public class Recursion {
    public static void main(String[] args){
        System.out.println(factorial(5));
    }

    static int factorial(int number){
        if(number==1)return 1;
        return number*factorial(number-1);
    }

    static int sumOfNDigits(int number){
        if(number==1)return 1;
        return number+sumOfNDigits(number-1);
    }
}
