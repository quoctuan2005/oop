public class Main {
        public static void main(String[] args) {
            // Tạo một biểu thức Square(-4)
            Expression e = new Square(new Numeral(-4));
            System.out.println("Biểu thức: " + e.toString());
            System.out.println("Kết quả: " + e.evaluate());

            // Tạo biểu thức phức tạp như (10^2 - 3 + 4 * 3)^2
            Expression test1 = new Square(
                    new Addition(
                            new Subtraction(
                                    new Square(new Numeral(10)),
                                    new Numeral(3)
                            ),
                            new Multiplication(
                                    new Numeral(4),
                                    new Numeral(3)
                            )
                    )
            );
            System.out.println("Biểu thức: " + test1.toString());
            System.out.println("Kết quả: " + test1.evaluate());
        }
}
