public class StringsClassDatatype {
    public static void main(String[] args){
        char a='c';//can store only single character
        String b="Hello";// can store complex characters combination
        // String is not primitive data type, it is a class data type.
        //String is stored inside String pool in heap memory and variable stores the reference/address of that string.
        String j="Ram";
        String k = new String(j);//new keyword creates new string value in memory an stores different address
        String l = new String(j);
        String m = j;//reference to same string address stored in string pool.
        System.out.println(j==k);//false
        System.out.println(k==l);//false
        System.out.println(j==m);//true

    }
}
