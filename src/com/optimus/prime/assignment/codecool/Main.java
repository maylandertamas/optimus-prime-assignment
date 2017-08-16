package com.optimus.prime.assignment.codecool;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    static long findPrimes(int maxNum) {
        return (int)IntStream.range(2, (maxNum+1))
                .filter(l -> l != 2 && l != 3 && l != 5 && l != 7?(l % 2 != 0 && l % 3 != 0 && l % 5 != 0 && l % 7 != 0): l % 1 == 0).count();
                //.boxed().collect(Collectors.toList()));
     }

    public static void main(String[] args) {
        System.out.println(findPrimes(120));
    }

}
