import java.util.Scanner;

public class print2Darray {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        //Take 2-D array size from user
        int row=scn.nextInt();
        int column=scn.nextInt();
        int [][] inpArr=new int[row][column];
        //Take array values from user
        for(int i=0; i<row;i++){
            for(int j=0; j<column; j++){
                inpArr[i][j] = scn.nextInt();
            }
        }
        //Print 2-D array
        for(int i=0; i<inpArr.length;i++){
            for(int j=0; j<inpArr[0].length; j++){
                System.out.print(inpArr[i][j]);
            }
            System.out.println();
        }
    }
}
