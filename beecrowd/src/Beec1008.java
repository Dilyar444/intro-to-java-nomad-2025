import java.util.Scanner;

public class Beec1008 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int hours = in.nextInt();
        double valuePerHour = in.nextDouble();
        double salary = hours * valuePerHour;
        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f%n", salary);
        in.close();
    }
}
