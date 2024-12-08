import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Point.
     */
    public Point() {
    }

    /**
     * Point.
     */
    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public double getPointX() {
        return pointX;
    }

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    public double getPointY() {
        return pointY;
    }

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * distance.
     */
    public double distance(Point newPoint) {
        if (newPoint != null) {
            return Math.sqrt(Math.pow(this.pointX - newPoint.getPointX(), 2)
                    + Math.pow(this.pointY + newPoint.getPointY(), 2));
        } else {
            return Math.sqrt(Math.pow(this.pointX, 2) + Math.pow(this.pointY, 2));
        }
    }

    /**
     * boolean.
     * so sanh.
     */
    @Override
    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point another = (Point) o;
            return Math.abs(this.pointX - another.getPointX()) <= 0.001
                    && Math.abs(this.pointY - another.getPointY()) <= 0.001;
        }
        return false;
    }

    /**
     * Point toString.
     * viet.
     */
    @Override
    public String toString() {
        return "(" + pointX + "," + pointY + ")";
    }

    /**
     * Point hashcode.
     * hashcode.
     */
    @Override
    public int hashCode() {
        return Objects.hash(pointX, pointY);
    }
}