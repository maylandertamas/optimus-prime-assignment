package com.optimus.prime.assignment.codecool;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    static void findPrimes(int maxNum) {
        System.out.println(IntStream.range(2, maxNum+1)
                .filter(l -> l != 2 && l != 3 && l != 5 && l != 7?(l % 2 != 0 && l % 3 != 0 && l % 5 != 0 && l % 7 != 0): l % 1 == 0)
                .boxed().collect(Collectors.toList()));
     }



    public static void main(String[] args) {
        findPrimes(120);

    }
}
