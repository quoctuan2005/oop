import java.util.Scanner;
public class GCD {
    public static int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b;
        a = input.nextInt();
        b = input.nextInt();
        int res = GCD(a,b);
        System.out.println(res);
    }
}
