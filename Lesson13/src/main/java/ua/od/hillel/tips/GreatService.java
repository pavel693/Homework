package ua.od.hillel.tips;

public class GreatService implements TipsForService {
    public double tipsForService(double totalAmount) {
        return totalAmount * 0.15;
    }
}
