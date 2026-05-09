package Array;
import java.util.Arrays;
import java.util.Scanner;
public class SortArraybuiltin {
    public static void main(String[] args) {
        //sort= Ascending order
//        int[] arr= {4,1,7,5,-4,10,2};
//        print(arr);
//        Arrays.sort(arr);
//        print(arr);
//    }
//
//    public static void print(int[] arr) {
//        for(int i = 0; i<arr.length; i++){
//            System.out.print(arr[i]+ " ");
//        }
//        System.out.println();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();

        int[] arr= new int[n];
        System.out.println("Enter the elements of array");

        for(int i=0; i< n; i++)
            arr[i] = sc.nextInt();
        for(int i = 0; i<n; i ++){
            if(n%2 != 0)
                arr[i] *= 2;
            else if(n%2 == 0 )
                arr[i] += 10;
            System.out.print(arr[i]+" ");
        }
    }
}
