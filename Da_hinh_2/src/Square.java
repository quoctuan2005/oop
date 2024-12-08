import java.util.Objects;

public class Square extends Rectangle {
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    /**
     * Creates a square.
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    /**
     * Creates a square.
     */
    public Square(Point topLeft, double side, String color, boolean filled) {
        super(topLeft, side, side, color, filled);
    }

    /**
     * Gets the side length of the square.
     */
    public double getSide() {
        return getWidth();
    }

    /**
     * Sets the side.
     */
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    /**
     * Sets the width (length) of the square.
     * Overrides the method.
     */
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Sets the length width) of the square.
     * Overrides.
     */
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    /**
     * Compares this square to another object for equality.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Square) {
            Square square = (Square) o;
            return Math.abs(this.width - square.getSide()) <= 0.001
                    && this.topLeft.equals(square.topLeft);
        }
        return false;
    }

    /**
     * Returns a string.
     */
    @Override
    public String toString() {
        return "Square[topLeft=" + topLeft + ",side=" + getSide()
                + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * Generates a hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width);
    }
}
