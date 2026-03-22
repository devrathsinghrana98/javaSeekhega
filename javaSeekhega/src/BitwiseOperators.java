public class BitwiseOperators {
    public static void main(String[] args){
        // BITWISE operators work for integral values - byte, short, int, long
        //Bitwise operator works on single bit of binary number of 32 bits
        // We can use INTEGER.toBinaryString() to print binary number
        //When we print Binary number if all the preceding bits are 0 then it will not be printed

        //REQUIRES TWO OPERANDS
        //& - requires both bit to be 1
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(6));
        System.out.println(5&6);
        System.out.println(Integer.toBinaryString(5&6));

        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(-6));
        System.out.println(5&-6);
        System.out.println(Integer.toBinaryString(5&-6));
        //| - requires at least one bit to be 1
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(6));
        System.out.println(5&6);
        System.out.println(Integer.toBinaryString(5|6));

        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(-6));
        System.out.println(5|-6);
        System.out.println(Integer.toBinaryString(5|-6));
        //^ XOR - requires pair of bits to be different
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(6));
        System.out.println(5^6);
        System.out.println(Integer.toBinaryString(5^6));

        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(-6));
        System.out.println(5^-6);
        System.out.println(Integer.toBinaryString(5^-6));


        //Requires only one Operand
        //~ NOT - Convert all 1 bit of binary to 0 and 0 to 1
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(~5));
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(~-5));
        //<< LEFT SHIFT - shift binary to left by specified number of bits and enter 0 for empty space
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(5<<1));
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(-5<<1));
        //>> RIGHT SHIFT - shift binary to right by specified number of bits and enter 1 or 0 at beginning based on sign of number(+ or -)
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(5>>1));
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(-5>>1));
        //>>> UNSIGNED RIGHT SHIFT -shift binary to right by specified number of bits and enter 0 for empty space irrespective of sign(+ or -)
        System.out.println(Integer.toBinaryString(5));
        System.out.println(Integer.toBinaryString(5>>>1));
        System.out.println(Integer.toBinaryString(-5));
        System.out.println(Integer.toBinaryString(-5>>>1));
    }
}
