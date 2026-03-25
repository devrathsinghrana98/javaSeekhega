public class StringMethods {
    public static void main(String[] args){
        String str1 = "Ram";
        String str2 = "Chakraborty";
        String str3=new String("Kali");
        String str4=new String("Kali");
        System.out.println(str1.length());//3
        System.out.println(str1.charAt(2));//m
        System.out.println(str3.equals(str4));//true - even if new keyword create new string in heap memory with different address as only values are compared
        System.out.println(str3.equalsIgnoreCase(str4));//true
        System.out.println(str1.compareTo(str2));//15 - this means ASCII code of any one character of str1 is greater than str2 and it returns the first occurence of that difference
        System.out.println(str3.compareTo(str4));//0 - this means ASCII code of each character in same index are same
        System.out.println('R'+0);//gives character ASCII by converting it to integer implicitly (type widening)
        System.out.println('C'+0);//explicit type conversion
        System.out.println((int)'C');
        System.out.println(str3.compareToIgnoreCase(str4));//0 - ignores case while comparing
        System.out.println(str1.concat(str2));//RamChakraborty -concatenates str2 to str1
        System.out.println(str1.substring(2));//m - returns substring from index 2
        System.out.println(str1.substring(2,3));//m - returns substring from index 2 to 3
        System.out.println(str1.subSequence(1,2));//a - returns subsequence from index 1 to 2(exclusive)
        System.out.println(" kaju ".trim());//remove whitespace from both sides
        System.out.println(str1.toLowerCase());//ram
        System.out.println(str1.replace("R","o"));//oam
        System.out.println(str2.contains("borty"));//true
        System.out.println(str2.startsWith("Chakra"));//true
        System.out.println(str2.endsWith("borty"));//true
        System.out.println(str1.endsWith("m"));//true
        System.out.println(" ".isBlank());//true
        System.out.println(" ".isEmpty());//false
        System.out.println(str1.indexOf("a"));//1
        System.out.println(str1.lastIndexOf("a"));//2

        //valueOf is static method as we can access it directly without instantiating String class using new keyword
        System.out.println(String.valueOf(10));//10 - integer to string
        System.out.println(String.format("%s %d years old","ram is :", 20));//ram is : 20 years old
    }
}
