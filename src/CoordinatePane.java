public class CoordinatePane {
    public void printQuadrant(int x, int y) {
        String quadrant;
        if (x > 0 && y > 0) {
            quadrant = "first";
        } else if (x < 0 && y > 0) {
            quadrant = "second";
        } else if (x < 0 && y < 0) {
            quadrant = "third";
        } else if (x > 0 && y < 0) {
            quadrant = "fourth";
        } else {
            quadrant = "zero";
        }
        System.out.println("The point (" + x + ", " + y + ") is in " + quadrant + " quadrant.");
    }
}
