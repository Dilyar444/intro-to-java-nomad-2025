import java.io.IOException;
import java.util.Scanner;

public class Beec1036 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();

        double delta = B*B - 4*A*C;

        if (A != 0 && delta >= 0) {
            double R1 = (-B + Math.sqrt(delta)) / (2*A);
            double R2 = (-B - Math.sqrt(delta)) / (2*A);
            System.out.printf("R1 = %.5f%n", R1);
            System.out.printf("R2 = %.5f%n", R2);
        } else {
            System.out.println("Impossivel calcular");
        }
    }
}
