package com.optimus.prime.assignment.codecool;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    static void findPrimes(int maxNum) {
        Map<Integer, Boolean> myMap = new HashMap<>();
        List<Integer> numberList = IntStream.range(2, maxNum+1).boxed().collect(Collectors.toList());
        for (Integer num: numberList) {
            myMap.put(num, true);
        }

        for (Integer key: myMap.keySet()) {
            if (key % 2 == 0) {
                myMap.replace(key, false);
            } else if (key % 3 == 0) {
                myMap.replace(key, false);
            } else if (key % 5 == 0) {
                myMap.replace(key, false);
            } else if (key % 7 == 0) {
                myMap.replace(key, false);
            }
            myMap.replace(2, true);
            myMap.replace(3, true);
            myMap.replace(5, true);
            myMap.replace(7, true);
        }
        int counter = 0;
        for (Map.Entry<Integer, Boolean> prime: myMap.entrySet()) {
            if (prime.getValue()) {
                // System.out.println(prime.getKey());
                counter++;
            }
        }
        System.out.println(counter);
     }



    public static void main(String[] args) {
        findPrimes(120);

    }
}
