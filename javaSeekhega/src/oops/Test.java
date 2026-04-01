package oops;

public class Test {
    public static void main(String[] args){
        Animal animal = new Cat();
        animal.sound();//prints meow due to inheritance and polymorphism
        Animal animal2 = new Dog();
        animal2.sound();//prints bark due to inheritance and polymorphism
        Animal animal3 =new Animal();
        animal3.sound();//prints animal sound due to inheritance and polymorphism
        int[] arr1 = new int[]{1,2,3};
        //inside a static method we can't access non-static members
        System.out.println(sumOfArray(arr1));
        int[] arr2 = new int[]{9,34,78};
        System.out.println(sumOfArray(arr2));
        System.out.println(strToUpper("   ram   "));
        System.out.println(strToUpper("   shyam   "));
        //function overloading - same function name but different parameters
        System.out.println(sumOfDigits(1,2));
        System.out.println(sumOfDigits(1,2,3));
        System.out.println(sumOfDigits(1.2f,3.4f));
        int x = 10;
        //x is passed by value
        System.out.println(multiplyBy10(x));
        //value of x is unchanged
        System.out.println(x);

        //pass by reference - String special case
        String str = "ram";
        //here str is passed by reference but since strings are immutable
        // the modified string is stored in different string pool
        // address so original string is unchanged
        System.out.println(strToUpper(str));
        System.out.println(str);

        Cat cat = new Cat();
        cat.name = "tom";
        //here cat object is passed by reference so original object is modified
        System.out.println(catNameUpper(cat));
        System.out.println(cat.name);

        //passing variable arguments using ... - it can accept
        // n number of arguments passed as array in method
        System.out.println(someDigits(1,2,3,4,55));
        System.out.println(isPrime(10));
        System.out.println(isPrime(7));
    }

    static boolean isPrime(int num){
        int res=0;

        // 10 - 1,2,3,4,5,6,7, 8, 9, 10 - here after 5 there is no need to
        // check as 10 will not be divisible after 5(10/2)
        for(int i=1; i<=num/2;i++){
            if(num%i==0)res++;
        }
        return res==1;
    }

    //variable arguments - below is same as int[] args
    static int someDigits(int... args){
        for(int i:args){
            System.out.println(i);
        }
        return args.length;
    }

    static int sumOfArray(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }

    static String strToUpper(String inpStr){
        return inpStr.trim().toUpperCase();
    }

    static int sumOfDigits(int a, int b){
        return a+b;
    }

    static int sumOfDigits(int a, int b, int c){
        return a+b+c;
    }

    static float sumOfDigits(float a, float b){
        return a+b;
    }

    static int multiplyBy10(int inpNum){
        return inpNum*10;
    }

    static String catNameUpper(Cat cat){
        return cat.name = cat.name.toUpperCase();
    }
}
