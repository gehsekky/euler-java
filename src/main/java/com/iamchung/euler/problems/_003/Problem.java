package com.iamchung.euler.problems._003;

import com.iamchung.euler.models.EulerProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem extends EulerProblem {
    private static long limit = 600851475143L;

    public Problem() {
        super("problem003");
    }

    @Override
    public void main() {
        List<Integer> primeFactors = getPrimeFactors(limit);
        System.out.println(primeFactors);
        System.out.println(primeFactors.stream().max(Integer::compareTo).get());
    }

    List<Integer> getPrimeFactors(long num) {
        List<Integer> primeFactors = new ArrayList<>();

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0 && isPrime(i)) {
                primeFactors.add(i);
            }
        }

        return primeFactors;
    }

    boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;

        for (int i = 3; i < Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
