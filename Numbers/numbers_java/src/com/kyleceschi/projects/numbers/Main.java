package com.kyleceschi.projects.numbers;

/**
 * Main entry point for numbers project
 * User: kceschi
 * Date: 8/28/13
 * Time: 10:05 AM
 *
 */
public class Main {

    public static void main(String[] args){
        long start = System.nanoTime();
        System.out.println(ProjectNumbersPi.findDigitsOfPi("100000"));
        double stop = (System.nanoTime() - start) / 1000000000.0;
        System.out.println(String.format("Calculation took %f seconds", stop));
    }
}
