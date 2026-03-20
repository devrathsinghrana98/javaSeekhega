public class SumOfArrayElements {
    public static void main(String[] args) {
        int[] arr = new int[]{10,20,30,40,50};
        arr[0]=20;
        int arrSum = sumOfArr(arr);
        System.out.println(arrSum);
    }

    static int sumOfArr(int[] inpArr){
        int sum=0;
        for(int i=0; i<inpArr.length; i++){
            sum += inpArr[i];
        }
        return sum;
    }
}
