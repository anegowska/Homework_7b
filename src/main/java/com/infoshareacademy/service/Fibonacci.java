package com.infoshareacademy.service;
;
import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static List<Long> getFibonacciAsList (Integer item){

        List<Long> fibList = new ArrayList<>();

        for (int i = 0; i <= item; i++){

            if (i == 0 || i == 1) {
                fibList.add((long) i);

            } else {
                Long sum = fibList.get(i-1) + (fibList.get(i-2));
                fibList.add(sum);
            }
        }
        return fibList;
    }

}
