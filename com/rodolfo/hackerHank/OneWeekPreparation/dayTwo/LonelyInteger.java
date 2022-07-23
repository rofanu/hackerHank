package com.rodolfo.hackerHank.OneWeekPreparation.dayTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LonelyInteger {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3, 2, 1));
        System.out.println(lonelyInteger(array));
    }

    public static int lonelyInteger(List<Integer> s) throws Exception {
        int[] ocurrencies = new int[101];
        for (Integer i= 0; i < s.size(); i++){
            Integer value = s.get(i);
            Integer ocurrenciesSoFar = ocurrencies[value];
            ocurrencies[value] = ocurrenciesSoFar + 1;
        }
        for (Integer i = 0; i <= 100; i++){
            if (ocurrencies[i]==1)
                return i;
        }
        throw new Exception("Lonely Integer not founf");
    }
}
