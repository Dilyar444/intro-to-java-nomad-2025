import java.util.Scanner;

public class Beec1013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int greatestAB = (a + b + Math.abs(a - b)) / 2;
        int greatest = (greatestAB + c + Math.abs(greatestAB - c)) / 2;

        System.out.println(greatest + " eh o maior");
        sc.close();
    }
}
