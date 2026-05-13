package Array.ReverseArray;

public class jav {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 19, 56, 9, 83, 18, 24, 58, 14};
        int n = arr.length;
        int i = 0;

        for(int j = n - 1; i < j; --j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            ++i;
        }

        for(int ele : arr) {
            System.out.print(ele + " ");
        }

    }
}
