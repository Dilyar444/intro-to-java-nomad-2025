import java.util.Scanner;

public class Beec1011 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        double volume = (4.0 / 3) * 3.14159 * Math.pow(R, 3);
        System.out.printf("VOLUME = %.3f%n", volume);
        input.close();
    }
}
