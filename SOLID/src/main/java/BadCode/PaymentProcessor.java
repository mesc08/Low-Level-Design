package BadCode;

public class PaymentProcessor {

    public void processPayment(String paymentMethod, double amount){
        if(paymentMethod.equals("CreditCard")){
            //business Logic
            System.out.println("making payment with credit card " + amount);
        } else if(paymentMethod.equals("DebitCard")) {
            //business Logic
            System.out.println("making payment with debit card " + amount);
        } else if(paymentMethod.equals("Paypal")){
            //business Logic
            System.out.println("making payment with paypal " + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment method " + paymentMethod);
        }
    }
}
