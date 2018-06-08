package com.iamchung.euler.problems._001;

import com.iamchung.euler.models.EulerProblem;

import java.util.ArrayList;
import java.util.List;

public class Problem extends EulerProblem {
    private static int limit = 1000;

    public Problem() {
        super("problem001");
    }

    @Override
    public void main() {
        List<Integer> multiples = new ArrayList<>();
        for (int i = 3; i < limit; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                multiples.add(i);
            }
        }

        int sum = multiples.stream().reduce(0, (x, y) -> { return x + y; });
        this.solve(sum);
    }
}
