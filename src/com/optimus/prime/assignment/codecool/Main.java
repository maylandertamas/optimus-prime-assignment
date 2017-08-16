package com.optimus.prime.assignment.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.*;

public class Main {

    static void findPrimes(int maxNum) {
        int[] primes = new int[maxNum];
        Arrays.fill(primes, 1);
        int k = 2;
        for (int i = 2; i < primes.length; i++) {
            Arrays.stream(primes).map(z -> ){

            }):z*1);
        }



        /*IntStream.range(2, (maxNum+1))
                .filter(l -> l != 2 && l != 3 && l != 5 && l != 7?(l % 2 != 0 && l % 3 != 0 && l % 5 != 0 && l % 7 != 0): l % 1 == 0).count();
                //.boxed().collect(Collectors.toList()));*/
     }

    public static void main(String[] args) {
        findPrimes(120);
    }

}
