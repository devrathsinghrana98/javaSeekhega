import java.util.Scanner;

public class SearchingElementInArray {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int lengthOfArr = scn.nextInt();
        int[] arr =new int[lengthOfArr];
        for (int i=0; i<lengthOfArr; i++){
            arr[i] = scn.nextInt();
        }
        int elementToSearch = scn.nextInt();
        int elementIndex = -1;
        elementIndex = searchElementInArray(arr,elementToSearch);
        System.out.println(elementIndex);
    }
    static int searchElementInArray(int[] inpArr,int elemToSearch){
        for(int i=0;i<inpArr.length;i++){
            if(inpArr[i] == elemToSearch) return i;
        }
        return -1;
    }
}
