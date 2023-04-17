public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) { // основа
            for (int j = i; j <= cathetusLength; j++) { // пространство
                System.out.print("  ");
            }
            for (int k = 1; k <= i; k++) { // Lr ребро
                System.out.print(" " + k);
            }
            for (int k = i - 1; k >= 1; k--) { // Rr ребро
                System.out.print(" " + k);
            }
            System.out.println();
        }
        for (int i = cathetusLength; i >= 1; i--) {
            for (int j = cathetusLength; j >= i - 1; j--) { // пространство
                System.out.print("  ");
            }
            for (int k = 1; k <= i - 1; k++) { // Rr ребро
                System.out.print(" " + k);
            }
            for (int k = i - 2; k >= 1; k--) { // Lr ребро
                System.out.print(" " + k);
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}