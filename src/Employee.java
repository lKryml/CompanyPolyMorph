
public abstract class Employee implements Payable {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public abstract double getPaymentAmount();
}
