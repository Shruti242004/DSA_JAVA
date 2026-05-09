package Multidimensionalarray;

public class transpose {
    static void main(String[] args) {
        int[][] arr = new int[][]{{2, 3, 1, 4}, {2, 6, 4, 3}, {5, 3, 2, 7}, {9, 2, 4, 5}};
        print(arr);

        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < i; ++j) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        print(arr);
    }

    private static void print(int[][] arr) {
        for (int[] a : arr) {
            for (int ele : a) {
                System.out.print(ele + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
