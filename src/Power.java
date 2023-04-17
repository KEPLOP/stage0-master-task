public class Power {
    public void printPower(int numberToPrint, int power) {
        double result = 1;

        for (int i = 1; i <= power; i++) {
            result *= numberToPrint;
        }

        System.out.println(numberToPrint + " в степени " + power + " = " + result);
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}