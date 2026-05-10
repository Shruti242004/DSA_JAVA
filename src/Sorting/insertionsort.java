package Sorting;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 1, 7, 3, 9, 2, 0, 8};

        for (int i = 1; i < arr.length; ++i) {
            for (int j = i; j > 0 && arr[j] < arr[j - 1]; --j) {
                int tenp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = tenp;
            }
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
    }
