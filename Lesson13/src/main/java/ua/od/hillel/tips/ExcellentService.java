package ua.od.hillel.tips;

public class ExcellentService implements TipsForService {
    public double tipsForService(double totalAmount) {
        return totalAmount * 0.2;
    }
}
