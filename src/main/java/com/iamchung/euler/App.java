package com.iamchung.euler;

import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String PROBLEM_ID = "005";

    public static void main( String[] args ) {
        try {
            Class problemClass = Class.forName("com.iamchung.euler.problems._" + PROBLEM_ID + ".Problem");
            Object temp = problemClass.newInstance();
            Method method =  problemClass.getDeclaredMethod("main", null);
            method.invoke(temp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
