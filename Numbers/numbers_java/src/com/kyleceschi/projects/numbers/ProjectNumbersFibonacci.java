package com.kyleceschi.projects.numbers;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: helix
 * Date: 10/1/13
 * Time: 7:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProjectNumbersFibonacci {

    /**
     * Computes the fibonacci sequence
     * @return
     */
    public static String findFib(){
        StringBuilder sb = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("To what n do you want to compute fib?");
        input = scanner.nextLine();
        int n = Integer.parseInt(input);
        for(int i = 0; i < n; i++){
            sb.append(fib(i) + "\n");
        }
        return sb.toString();
    }

    private static double fib(int n){
        double ret = 0;
        if(n == 0)
            return 1;
        if(n == 1)
            return 3;
        double gp = 1;
        double p = 3;
        for(int i = 2; i<=n; i++){
            ret = 3 * p - gp;
            gp = p;
            p = ret;
        }
        return ret;
    }
}
