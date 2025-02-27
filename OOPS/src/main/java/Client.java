import Payment.*;

public class Client {

    public static void main(String[] args){
        PaymentService paymentService = new PaymentService();

        paymentService.addPaymentMethod("SrijanDebitCard",new DebitCard("Srijan Chakraborty", "22332233223322"));
        paymentService.addPaymentMethod("SrijanCreditCard", new CreditCard("Srijan Chakraborty","12312425325235232"));
        paymentService.addPaymentMethod("SrijanUPI", new UPI("232552523@ptyes"));
        paymentService.addPaymentMethod("SrijanWallet", new Wallet());



        paymentService.makePayment("SrijanWallet");
        paymentService.makePayment("SrijanUPI");
    }
}
