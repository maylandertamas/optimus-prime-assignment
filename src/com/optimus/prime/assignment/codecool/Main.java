package com.optimus.prime.assignment.codecool;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static int findPrimes(int maxNum) {
        List<Boolean> primeArrayList = new ArrayList();
        for (int i = 0; i < maxNum; i++) {
            primeArrayList.add(true);
        }
        primeArrayList.set(0, false);
        primeArrayList.set(1, false);

        int primeCounter = 0;
        for (int i = 2; i < primeArrayList.size(); i++) {

            if (primeArrayList.get(i)) {
                for (int z = 2; z*i < primeArrayList.size(); z++) {
                    primeArrayList.set(z*i, false);
                }
            }
        }
        for (boolean element: primeArrayList) {
            if (element) {
                primeCounter++;
            }
        }
        return primeCounter;
        
    }

    public static void main(String[] args) {
        System.out.println(findPrimes(121));
    }
}
