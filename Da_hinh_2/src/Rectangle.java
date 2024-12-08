import java.util.Objects;

public class Rectangle extends Shape {
    protected Point topLeft;
    protected double width;
    protected double length;

    /**
     * Default constructor.
     */
    public Rectangle() {}

    /**
     * Initializes a rectangle with width and length.
     */
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    /**
     * Initializes a rectangle with width, length, color, and fill status.
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    /**
     * Initializes a rectangle with top-left point, width, length, color, and fill status.
     */
    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    /**
     * Gets the top-left point.
     */
    public Point getTopLeft() {
        return topLeft;
    }

    /**
     * Sets the top-left point.
     */
    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    /**
     * Gets the width.
     */
    public double getWidth() {
        return width;
    }

    /**
     * Sets the width.
     */
    public void setWidth(double width) {
        this.width = width;
    }

    /**
     * Gets the length.
     */
    public double getLength() {
        return length;
    }

    /**
     * Sets the length.
     */
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Calculates the area of the rectangle.
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Calculates the perimeter of the rectangle.
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Checks if two rectangles are approximately equal.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) o;
            return Math.abs(this.width - rectangle.getWidth()) <= 0.001
                    && Math.abs(this.length - rectangle.getLength()) <= 0.001
                    && this.topLeft.equals(rectangle.topLeft);
        }
        return false;
    }

    /**
     * Returns the hash code of the rectangle.
     */
    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }

    /**
     * Returns a string representation of the rectangle.
     */
    @Override
    public String toString() {
        return "Rectangle[topLeft=" + topLeft + ",width=" + width
                + ",length=" + length + ",color=" + color
                + ",filled=" + filled + "]";
    }
}
