package com.kyleceschi.projects.numbers;

import java.math.BigDecimal;

/**
 * Find PI to the Nth Digit - Enter a number and have the program generate PI up to that many decimal places.
 * Keep a limit to how far the program will go.
 * User: kceschi
 * Date: 8/28/13
 * Time: 10:17 AM
 */
public class ProjectNumbersPi {
    private static final int roundingMode = BigDecimal.ROUND_HALF_UP;
    private static final BigDecimal FOUR = BigDecimal.valueOf(4);

    public static String findDigitsOfPi(String inputDigits){
        //compute decimals of pi using machin formula
        int numOfDigits, overflowTest;
        try{
            overflowTest = Integer.parseInt(inputDigits) + 5;
            numOfDigits = overflowTest - 5;
            if(numOfDigits > 100000){
                return "Digits must be less than 100,000";
            }
        }catch(NumberFormatException ex){
            return "You overflowed an integer, that's too many digits of pi to look for";
        }


        int scale = numOfDigits + 5;
        BigDecimal arctan1_5 = arctan(5, scale);
        BigDecimal arctan1_239 = arctan(239, scale);
        BigDecimal pi = arctan1_5.multiply(FOUR).subtract(arctan1_239).multiply(FOUR);
        return pi.setScale(numOfDigits, roundingMode).toString();
    }

    //power series expansion of the arctangent
    private static BigDecimal arctan(int inverseX, int scale){
        BigDecimal result, numer, term;
        BigDecimal invX = BigDecimal.valueOf(inverseX);
        BigDecimal invX2 = BigDecimal.valueOf(inverseX * inverseX);

        numer = BigDecimal.ONE.divide(invX,scale, roundingMode);

        result = numer;
        int i = 1;
        do {
            numer = numer.divide(invX2, scale, roundingMode);
            int denom = 2 * i + 1;
            term = numer.divide(BigDecimal.valueOf(denom), scale, roundingMode);
            if ((i % 2) != 0) {
                result = result.subtract(term);
            } else {
                result = result.add(term);
            }
            i++;
        } while (term.compareTo(BigDecimal.ZERO) != 0);
        return result;
    }
}
