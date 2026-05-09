package Array;
import java.util.Scanner;

public class maxofarray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i= 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        /// MAX OF ARRAY
//        int max = arr[0];
//        for(int i = 0; i<n; i++){
//            if(arr[i] > max)
//                max = arr[i];

        /// MIN OF ARRAY
          int min = arr[0];
        for(int i = 0; i < n; i++){
            if(arr[i] < min)
                min = arr[i];
        }
        System.out.print(min);
    }

}
