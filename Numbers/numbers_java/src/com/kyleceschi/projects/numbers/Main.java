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
        int arg = -1;
        try{
            arg = Integer.parseInt(args[0]);
        }catch (NumberFormatException ex){
            System.out.println("No arguments");
        }
        switch(arg){
            case 0:
                System.out.println(ProjectNumbersPi.findDigitsOfPi("100"));
                break;
            case 1:
                System.out.println(ProjectNumbersFibonacci.findFib());
            default:
                break;
        }
    }
}
