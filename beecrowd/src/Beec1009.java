import java.util.Scanner;

public class Beec1009 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // name not used in calculation
        double fixedSalary = sc.nextDouble();
        double sales = sc.nextDouble();
        double total = fixedSalary + (sales * 0.15);
        System.out.printf("TOTAL = R$ %.2f%n", total);
        sc.close();
    }
}
