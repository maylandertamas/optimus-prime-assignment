package com.optimus.prime.assignment.codecool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    static int findPrimes(int maxNum) {

        List<Integer> primeArrayList = new ArrayList<>(Collections.nCopies(maxNum+1, 1));
        primeArrayList.set(0, 0);
        primeArrayList.set(1, 0);
        for (int i = 2; i < primeArrayList.size(); i++) {
            if (primeArrayList.get(i) == 1) {
                for (int z = 2; z*i < primeArrayList.size(); z++) {
                    primeArrayList.set(z*i, 0);
                }
            }
        }
        return (int)primeArrayList.stream().filter(s -> s == 1).count();
    }

    public static void main(String[] args) {
        System.out.println(findPrimes(120));
    }
}
