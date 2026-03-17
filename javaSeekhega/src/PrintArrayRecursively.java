import java.util.Scanner;

public class PrintArrayRecursively {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int arrLength = scn.nextInt();
        int[] arr = new int[arrLength];
        for(int i=0; i<arrLength; i++){
            arr[i]=scn.nextInt();
        }
        printArrayUsingForLoop(arr);
        displayRecursively(arr, 0);
    }

    public static void printArrayUsingForLoop(int[] arr){
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Array is printed normally!");
    }

    //Expected behavior is to print all array members
    //Faith is it prints all array members starting from passed index
    public static void displayRecursively(int[] arr, int index){
        if(index == arr.length){
            System.out.println("Array is printed recursively!");
            return;
        }
        System.out.println(arr[index]);
        displayRecursively(arr, index+1);
    }
}
