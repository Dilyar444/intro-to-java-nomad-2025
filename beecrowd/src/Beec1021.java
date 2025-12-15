import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Beec1021{
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US); // чтобы printf использовал точку в дробной части (так для себя чтоб не забыть)
        Scanner sc = new Scanner(System.in);

        double N = sc.nextDouble();

        int notes = (int) N;
        int cents = (int) Math.round((N - notes) * 100);


        if (cents == 100) {
            notes += 1;
            cents = 0;
        }

        System.out.println("NOTAS:");
        int[] noteValues = {100, 50, 20, 10, 5, 2};
        for (int value : noteValues) {
            int count = notes / value;
            System.out.printf("%d nota(s) de R$ %.2f%n", count, (double) value);
            notes %= value;
        }


        cents += notes * 100;

        System.out.println("MOEDAS:");
        int[] coinValues = {100, 50, 25, 10, 5, 1};
        for (int value : coinValues) {
            int count = cents / value;
            System.out.printf("%d moeda(s) de R$ %.2f%n", count, value / 100.0);
            cents %= value;
        }

        sc.close();
    }
}
