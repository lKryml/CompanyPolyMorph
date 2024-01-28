public class CommissionEmployee extends Employee {

    private double grossSales;
    private double comissionRate;

    CommissionEmployee(String name, double grossSales, double commissionRate) {
        super(name);
        this.grossSales = grossSales;
        this.comissionRate = commissionRate;
    }

    @Override
    public double getPaymentAmount() {
        return grossSales * comissionRate;
    }
}
