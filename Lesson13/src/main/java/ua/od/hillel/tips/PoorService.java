package ua.od.hillel.tips;

public class PoorService implements TipsForService {
    public double tipsForService(double totalAmount) {
        return totalAmount * 0.05;
    }
}
