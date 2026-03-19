public class PrimitiveDataTypes {
    public static void main(String[] args){
        //integral
        byte b = 127;//1 byte = 8 bits
        short s = 32767;//2 bytes
        int i = 2147483647;//4 bytes
        long l = 9223372036854775807L;//8 bytes

        //decimal
        float f = 3.14f;//2 bytes
        double d = 3.141592653589793;//8 bytes

        //boolean
        boolean bool = true;//1 bit

        //character
        char c = 'a';//2 bytes

        //widening type conversion is implicit type conversion or automatic type coercion
        int wideInt = b;
        long wideLong = i;
        double wideDouble = f;

        //explicit conversion or type narrowing is when we convert a larger data type to a smaller data type
        double narrowDouble = i;
        System.out.println(narrowDouble);

        System.out.println(Long.MAX_VALUE);//Long is wrapper class
        System.out.println(Long.toBinaryString(Long.MAX_VALUE));
        System.out.println((char) 2);
    }
}
