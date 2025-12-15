public class Problem10 {
    public static void main(String[] args) {
        double kilometers = 14.0;
        double timeHours = (45 * 60 + 30) / 3600.0;
        double miles = kilometers / 1.6;
        double speed = miles / timeHours;
        System.out.println("Average speed in miles per hour = " + speed);
    }
}
