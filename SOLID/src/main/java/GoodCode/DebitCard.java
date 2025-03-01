package GoodCode;

public class DebitCard extends Pay{


    @Override
    public void processPayment(double amount) {
        System.out.println("Make payment using debit card "+ amount);
    }
}
