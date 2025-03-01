package GoodCode;

public class Paypal extends Pay{

    @Override
    public void processPayment(double amount) {
        System.out.println("Make payment using paypal "+amount);
    }
}
