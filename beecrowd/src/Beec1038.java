import java.util.Scanner;

public class Beec1038 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int productCode = sc.nextInt();
        int number = sc.nextInt();

        switch (productCode) {
            case 1:
                System.out.print("Total: R$ "+number * 4.00);
                break;
            case 2:
                System.out.print("Total: R$ "+number * 4.50);
                break;
            case 3:
                System.out.print("Total: R$ "+number * 5.00);
                break;
            case 4:
                System.out.print("Total: R$ "+number * 2.00);
                break;
            case 5:
                System.out.print("Total: R$ "+number * 1.00);
                break;
        }
    }
}