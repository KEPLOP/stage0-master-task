package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int calculatedSum = 0;
        while(number != 0) {
            int digit = number % 10;
            calculatedSum += digit;
            number /= 10;
        }
        System.out.println(calculatedSum);
    }

}
