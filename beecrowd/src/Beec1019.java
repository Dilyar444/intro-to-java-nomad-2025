import java.io.IOException;
import java.util.Scanner;

public class Beec1019 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int hours = N / 3600;
        N -= hours * 3600;

        int minutes = N / 60;
        N -= minutes * 60;

        int seconds = N;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}
