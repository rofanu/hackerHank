package com.rodolfo.hackerHank.OneWeekPreparation.dayOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        miniMaxSum(arr);
    }

    public static void miniMaxSum(List<Integer> arr) {
        Long sum = 0L;
        Long maxValue = Long.MIN_VALUE;
        Long minValue = Long.MAX_VALUE;
        for (Integer integer : arr) {
            if (integer > maxValue)
                maxValue = integer.longValue();
            if (integer < minValue)
                minValue = integer.longValue();
            sum = sum + integer;
        }
        Long maxSum = sum - minValue;
        Long minSum = sum - maxValue;

        System.out.print(minSum + " " + maxSum);
    }
}
