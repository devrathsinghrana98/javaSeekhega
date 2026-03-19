public class FindMaxInArray {
    public static void main(String[] args){
        int[] arr = new int[]{1,5,6,10,3};
        int maxNumber = arr[0];
        findMaxInArray(arr, 0, maxNumber);
    }

    public static void findMaxInArray(int[] arr, int index, int maxNumber){
        if(arr.length==index){
            System.out.println(maxNumber);
            return;
        }
        if(arr[index]>maxNumber){
            maxNumber=arr[index];
        }
        findMaxInArray(arr,index+1,maxNumber);
    }
}
