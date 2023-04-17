package com.epam.loops;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= numberToPrint;
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        Power power = new Power();
        power.printPower(10, 3); // Output: 10 raised to the power of 3 is 1000
    }
}

