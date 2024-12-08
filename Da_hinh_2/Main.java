public class Main {
    public static void main(String[] args) {
        Layer layer = new Layer();

        layer.addShape(new Circle(new Point(10.0, 5.0), 8.0, "RED", true));
        layer.addShape(new Rectangle(new Point(10.0, 5.0), 8.0, 6.0, "RED", true));
        layer.addShape(new Circle(new Point(10.0, 5.0), 8.0, "RED", true));
        layer.addShape(new Square(new Point(10.0, 5.0), 8.0, "RED", true));

        System.out.println(layer.getInfo());
        System.out.println("\nRemoving circles...");

        layer.removeCircles();
        System.out.println(layer.getInfo());

        System.out.println("\nAdding duplicate shapes...");
        layer.addShape(new Square(new Point(10.0, 5.0), 8.0, "RED", true));
        layer.addShape(new Rectangle(new Point(10.0, 5.0), 8.0, 6.0, "RED", true));

        System.out.println(layer.getInfo());
        System.out.println("\nRemoving duplicates...");

        layer.removeDuplicates();
        System.out.println(layer.getInfo());
    }
}
