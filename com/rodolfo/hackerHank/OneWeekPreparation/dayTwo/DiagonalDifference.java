package com.rodolfo.hackerHank.OneWeekPreparation.dayTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiagonalDifference {
    public static void main(String[] args) {
        List<Integer> arr1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(4,5,6));
        List<Integer> arr3 = new ArrayList<>(Arrays.asList(9,8,9));

        List<List<Integer>> arr = new ArrayList<>(
                Arrays.asList(arr1, arr2, arr3)
        );

        System.out.println(diagonalDifference(arr));
    }

    public static int diagonalDifference(List<List<Integer>> arr){
        int sumDiagonal = 0;
        int sumDiagonalReverse = 0;
        for (int i =0; i<arr.size();i++){
            sumDiagonal += arr.get(i).get(i);
            sumDiagonalReverse += arr.get(i).get(arr.size()-1-i);
        }

        return Math.abs(sumDiagonal - sumDiagonalReverse);
    }
}
