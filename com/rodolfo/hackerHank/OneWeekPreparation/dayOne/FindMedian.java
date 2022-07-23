package com.rodolfo.hackerHank.OneWeekPreparation.dayOne;

import java.util.Collections;
import java.util.List;

public class FindMedian {
    public static void main(String[] args) {

    }

    public static int findMedian(List<Integer> arr){
        Collections.sort(arr);
        Integer position = arr.size()/2;
        return arr.get(position);
    }
}
