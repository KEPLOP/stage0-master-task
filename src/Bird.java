public class Bird extends Animal {
    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super("blue", 2, false);
    }

    public Bird() {

    }

    @Override
    public String getDescription() {
        String pawString = (getNumberOfPaws() == 1) ? "paw" : "paws";
        String furString = (hasFur()) ? "a" : "no";
        return "This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " " + pawString + " and " + furString + " fur. Moreover, it has 2 wings and can fly.";
    }
}
