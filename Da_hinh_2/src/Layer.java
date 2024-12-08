import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Layer {
    private List<Shape> shapes;

    /**
     * Initializes an empty layer.
     */
    public Layer() {
        this.shapes = new ArrayList<>();
    }

    /**
     * Adds a shape to the layer.
     */
    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Returns information about all shapes in the layer in a formatted string.
     */
    public String getInfo() {
        StringBuilder geometry = new StringBuilder("Layer of crazy shapes:\n");
        for (Shape shape : shapes) {
            geometry.append(shape).append("\n");
        }
        return geometry.toString().trim();
    }

    /**
     * Removes all circles from the layer.
     */
    public void removeCircles() {
        shapes.removeIf(shape -> shape instanceof Circle);
    }

    /**
     * Removes duplicate shapes from the layer.
     * Duplicates are determined.
     */
    public void removeDuplicates() {
        Set<Shape> uniqueShapes = new LinkedHashSet<>(shapes);
        shapes.clear();
        shapes.addAll(uniqueShapes);
    }
}
