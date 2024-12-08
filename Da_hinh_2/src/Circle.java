import java.util.Objects;

public class Circle extends Shape {
    protected Point center;
    protected double radius;

    /**
     * Circle.
     */
    public Circle() {
    }

    /**
     * Circle.
     * hinh tron.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Circle.
     * radius bla.
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /**
     * Circle.
     * center.
     * filled.
     */
    public Circle(Point center, double radius, String color, boolean filled) {
        super(color, filled);
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * area.
     * area
     */
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    /**
     * Calculate perimeter.
     * circle perimeter.
     */
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle[center=" + center + ",radius=" + radius
                + ",color=" + color + ",filled=" + filled + "]";
    }

    /**
     * check equals.
     * circle.
     */
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle circle = (Circle) o;
            return Math.abs(this.radius - circle.getRadius()) <= 0.001
                    && this.center.equals(circle.getCenter());
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }
}