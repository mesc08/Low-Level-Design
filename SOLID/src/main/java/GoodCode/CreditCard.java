package GoodCode;

public class CreditCard extends Pay{

    @Override
    public void processPayment(double amount) {
        System.out.println("Make payment using credit card "+ amount);
    }
}
