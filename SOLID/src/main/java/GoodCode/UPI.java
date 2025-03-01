package GoodCode;

public class UPI extends Pay{

    @Override
    public void processPayment(double amount) {
        System.out.println("Make payment using UPI "+ amount);
    }
}
