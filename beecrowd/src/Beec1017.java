import java.io.IOException;
import java.util.Scanner;

public class Beec1017 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double h = scanner.nextInt();
        double vm = scanner.nextInt();

        System.out.printf("%.3f%n", (h * vm) / 12);
    }
}