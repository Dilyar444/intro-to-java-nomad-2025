import java.util.Scanner;

public class Beec1007 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        int D = scan.nextInt();
        int difference = (A * B - C * D);
        System.out.println("DIFERENCA = " + difference);
        scan.close();
    }
}
