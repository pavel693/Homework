package ua.od.hillel.tips;

import java.util.Scanner;

public class TipsMain {
    final static String TERRIBLE = "terrible";
    final static String POOR = "poor";
    final static String GOOD = "good";
    final static String GREAT = "great";
    final static String EXCELLENT = "excellent";

    public static void main(String args[]) {
        TipsForService terribleService = new TerribleService();
        TipsForService poorService = new PoorService();
        TipsForService goodService = new GoodService();
        TipsForService greatService = new GreatService();
        TipsForService excellentService = new ExcellentService();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please, enter the level of service,(terrible, poor, good, great, excellent):");
        String service = scanner.nextLine();

        System.out.println("Please, enter the total amount:");
        double total = scanner.nextDouble();

        if (service.equals(TERRIBLE)) {
            System.out.println("The service was terrible, that's why amount of tips - " + terribleService.tipsForService(total));
        }
        if (service.equals(POOR)) {
            System.out.println("The service was poor, that's why amount of tips - " + poorService.tipsForService(total));
        }
        if (service.equals(GOOD)) {
            System.out.println("The service was good, that's why amount of tips - " + goodService.tipsForService(total));
        }
        if (service.equals(GREAT)) {
            System.out.println("The service was great, that's why amount of tips - " + greatService.tipsForService(total));
        }
        if (service.equals(EXCELLENT)) {
            System.out.println("The service was excellent, that's why amount of tips - " + excellentService.tipsForService(total));
        }
    }
}
