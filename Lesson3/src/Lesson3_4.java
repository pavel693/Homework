
import java.util.Scanner;

public class Lesson3_4 {

    final static String TERRIBLE = "terrible";
    final static String POOR = "poor";
    final static String GOOD = "good";
    final static String GREAT = "great";
    final static String EXCELLENT = "excellent";


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
            System.out.println("The service was poor, that's why amount of tips - " + (total * 0.05));
        }

        if (service.equals(GOOD)) {
            System.out.println("The service was good, that's why amount of tips - " + (total * 0.1));
        }

        if (service.equals(GREAT)) {
            System.out.println("The service was great, that's why amount of tips - " + (total * 0.15));
        }

        if (service.equals(EXCELLENT)) {
            System.out.println("The service was excellent, that's why amount of tips - " + (total * 0.2));
        }

    }

}

