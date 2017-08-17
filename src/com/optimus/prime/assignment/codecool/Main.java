package com.optimus.prime.assignment.codecool;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.*;

public class Main {

    static int findPrimes(int maxNum) {

        List<Integer> startList = IntStream.range(2, (maxNum+1))
                .filter(l -> l != 2 && l != 3 && l != 5 && l != 7?(l % 2 != 0 && l % 3 != 0 && l % 5 != 0 && l % 7 != 0): l % 1 == 0).boxed().collect(Collectors.toList());
        System.out.println(startList);

        for (int i = 4; i < startList.size(); i++) {
            List<Integer> temp = new ArrayList<>(startList);
            int finalI = i;
            startList = temp.stream().filter(l -> l != temp.get(finalI) ?(l % temp.get(finalI) != 0): l % 1 == 0).collect(Collectors.toList());
        }
        System.out.println(startList);
        //startList = temp.stream().forEach(l -> l != temp.get(finalI) && l % finalI == 0? (hehe.add()));
        return startList.size();
     }

    public static void main(String[] args) {
        findPrimes(130);
    }

}
