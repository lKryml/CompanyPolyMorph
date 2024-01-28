public class Invoice implements Payable {
    private String descreption;
    private double amount;

    public Invoice(String descreption, double amount) {
        this.descreption = descreption;
        this.amount = amount;

    }

    public double getPaymentAmount() {
        return amount;
    }

}
