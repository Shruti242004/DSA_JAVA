package Array;
import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [] arr = {1,2,3,4,6,3,9};
//        int n= arr.length; //index - 0 to n-1
//        System.out.println(arr.length);
//        for(int i= 0; i<n; i++){
//            System.out.print(arr[i]+ " ");
//        }

        int[] karan = new int[7];
        //default Value
//        for(int i = 0; i<karan.length; i++) {
//            System.out.println(karan[i]+" ");
//        }

        //input
        for(int i=0; i<7; i++){
            karan[i]= sc.nextInt();
        }
        //print
        for(int i=0; i<7; i++){
            System.out.print(2*karan[i]+" ");
        }
    }
}
