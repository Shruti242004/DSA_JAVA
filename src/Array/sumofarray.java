package Array;
import java.util.Scanner;
public class sumofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr= new int[n];
        System.out.print("Enter array Elements: ");
        for(int i=0;i<n; i++)
            arr[i] = sc.nextInt();
        int sum=1;
        for(int i = 0; i<n;i++){
            sum *= arr[i];
        }
        System.out.print(sum);


    }
}
