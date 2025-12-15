public class Problem04 {
    public static void main(String[] args) {
        System.out.println("a   a^2   a^3");
        for (int a = 1; a <= 4; a++) {
            System.out.printf("%d   %d   %d%n", a, a * a, a * a * a);
        }
    }
}
