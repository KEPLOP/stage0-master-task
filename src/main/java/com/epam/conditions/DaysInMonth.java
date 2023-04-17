package com.epam.conditions;

public class DaysInMonth {
    public void printDays(int year, int month) {
        // Check if year is valid
        if (year < 0) {
            System.out.println("invalid date");
            return;
        }

        // Check if month is valid
        if (month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        // Get the number of days in the given month
        int numDays;
        if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                numDays = 29;  // leap year
            } else {
                numDays = 28;  // not a leap year
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            numDays = 30;
        } else {
            numDays = 31;
        }

    }
}
