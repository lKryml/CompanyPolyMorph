import java.util.ArrayList;

public class Company {

    public static void main(String[] args) {
        ArrayList<Payable> arr = new ArrayList<>();
        arr.add(new CommissionEmployee("Salem", 3500.0, 0.01));
        arr.add(new Invoice("Electric bill", 200));
        arr.add(new CommissionEmployee("Salem", 3500.0, 0.01));
        arr.add(new CommissionEmployee("Salem", 3500.0, 0.01));
        arr.add(new Invoice("Electric bill", 200));

        double sum = 0;
        int cemp = 0;
        for (Payable emp : arr) {
            sum += emp.getPaymentAmount();
            if (emp instanceof CommissionEmployee) {
                cemp++;
            }
        }
        System.out.println("SUM:" + sum + " cemp:" + cemp);
    }

}
