package Payment;

public class Wallet implements PaymentMethod{

    @Override
    public void pay() {
        System.out.println("Make payment using wallet");
    }
}
