
import java.util.Scanner;

public class Lesson3_4 {

    final static String TERRIBLE = "terrible";
    final static String POOR = "poor";
    final static String GOOD = "good";
    final static String GREAT = "great";
    final static String EXCELLENT = "excellent";
    final static double POORTIPS = 0.05;
    final static double GOODTIPS = 0.1;
    final static double GREATTIPS = 0.15;
    final static double EXCELTIPS = 0.2;

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the level of service,(terrible, poor, good, great, excellent):");
        String service = scanner.nextLine();

        System.out.println("Please, enter the total amount:");
        double total = scanner.nextDouble();

        if (service.equals(TERRIBLE)) {
            System.out.println("The service was terrible, that's why amount of tips - 0");
        }

        if (service.equals(POOR)) {
            System.out.println("The service was poor, that's why amount of tips - " + (total * POORTIPS));
        }

        if (service.equals(GOOD)) {
            System.out.println("The service was good, that's why amount of tips - " + (total * GOODTIPS));
        }

        if (service.equals(GREAT)) {
            System.out.println("The service was great, that's why amount of tips - " + (total * GREATTIPS));
        }

        if (service.equals(EXCELLENT)) {
            System.out.println("The service was excellent, that's why amount of tips - " + (total * EXCELTIPS));
        }

    }

}

