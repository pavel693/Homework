package ua.od.hillel.tips;

public class GoodService implements TipsForService {
    public double tipsForService(double totalAmount) {
        return totalAmount * 0.1;
    }
}
