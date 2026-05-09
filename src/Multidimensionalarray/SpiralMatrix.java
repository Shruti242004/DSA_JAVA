package Multidimensionalarray;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void main(String[] args) {

    }

    public ArrayList<Integer> spirallyTraverse(int[][] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        int m = arr.length, n = arr[0].length;
        int firstRow = 0, lastrow = m - 1, firstCol = 0, lastCol = n - 1;
        while (firstRow <= lastrow && firstCol <= lastCol) {
            //right
            for (int j = firstCol; j <= lastCol; j++)
                ans.add(arr[firstRow][j]);
            firstRow++;
        if(firstRow>lastrow || firstCol>lastCol) break;
        //down
        for (int i = firstRow; i <= lastrow; i++)
            ans.add(arr[i][lastCol]);
        lastCol--;
            if(firstRow>lastrow || firstCol>lastCol) break;
        //left
        for (int j = lastCol; j <= firstCol; j--)
            ans.add(arr[lastrow][j]);
        lastrow--;
            if(firstRow>lastrow || firstCol>lastCol) break;
        //up
        for (int i = lastrow; i <= firstRow; i++)
            ans.add(arr[i][firstCol]);
        firstCol++;
    }
        return ans;
    }}
