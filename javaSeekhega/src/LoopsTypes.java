public class LoopsTypes {
    public static void main(String[] args){
        for(int i=1,j=0; j<4;i*=10,j++){
            System.out.println(i);
        }

        //factorial
        //6*5*4*3*2*1
        int i=6;
        int factorial=1;
        while(i>0){
            factorial *=i;
            i--;
        }
        System.out.println(factorial);

        /*
        * *
        * **
        * ***
        */

        for(int k=0; k<3;k++){
            for(int j=0;j<=k;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Count digits
        int number = 12345;
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);

        int m=1;
        do{
            System.out.println(m);
            m++;
        }while(m<1);
    }
}
