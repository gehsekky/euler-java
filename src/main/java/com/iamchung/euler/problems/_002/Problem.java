package com.iamchung.euler.problems._002;

import com.iamchung.euler.models.EulerProblem;

import java.util.Set;
import java.util.HashSet;

public class Problem extends EulerProblem {
    private static int limit = 4000000;
    private Set<Integer> evens = new HashSet<>();

    public Problem() {
        super("problem002");
    }

    @Override
    public void main() {
        fibonacci(1, 2);
        System.out.println(evens);
        System.out.println(evens.stream().reduce(0, (x, y) -> (x + y)).intValue());
    }

    private void fibonacci(int prev, int curr) {
        if (prev % 2 == 0) evens.add(prev);
        if (curr % 2 == 0) evens.add(curr);

        if (prev + curr < limit) {
            fibonacci(curr, prev + curr);
        }
    }
}
