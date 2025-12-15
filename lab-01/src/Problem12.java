public class Problem12 {
    public static void main(String[] args) {
        double miles = 24.0;
        double timeHours = (1 * 3600 + 40 * 60 + 35) / 3600.0;
        double kilometers = miles * 1.6;
        double speed = kilometers / timeHours;
        System.out.println("Average speed in km/h = " + speed);
    }
}
