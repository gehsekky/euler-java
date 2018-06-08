package com.iamchung.euler.problems._004;

import com.iamchung.euler.models.EulerProblem;

public class Problem extends EulerProblem {

    private static int min = 100;
    private static int max = 999;

    public Problem() {
        super("problem004");
    }

    @Override
    public void main() {
        System.out.println("starting 004");
        Integer x = max;
        Integer y = max;
        Integer largest = 0;

        while (x >= min && y >= min) {
            int product = x * y;
            if (isPalindrome(product) && product > largest) {
                largest = product;
            }

            if (y == min) {
                y = max;
                x--;
            }

            y--;
        }

        this.solve(largest);
    }

    private boolean isPalindrome(Integer num) {
        String numString = num.toString();
        for (int i = 0, j = numString.length() - 1; i < j; i++, j--) {
            if (numString.charAt(i) != numString.charAt(j)) {
                return false;
            }
        }

        return true;
    }

}
