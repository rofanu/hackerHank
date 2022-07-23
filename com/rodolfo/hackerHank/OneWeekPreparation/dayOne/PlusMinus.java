package com.rodolfo.hackerHank.OneWeekPreparation.dayOne;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PlusMinus {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(-4, 3, -9, 0, 4, 1));
        plusMinus(arr);
    }

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        Integer positives = 0;
        Integer negatives = 0;
        Integer zeros = 0;

        Integer total = arr.size();
        for (Integer number : arr) {
            if (number > 0)
                positives++;
            else if (number < 0)
                negatives++;
            else
                zeros++;
        }

        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.ENGLISH);
        DecimalFormat df = new DecimalFormat("0.0000", dfs);
        System.out.println(df.format(positives.floatValue()/total.floatValue()));
        System.out.println(df.format(negatives.floatValue()/total.floatValue()));
        System.out.println(df.format(zeros.floatValue()/total.floatValue()));
    }


}
