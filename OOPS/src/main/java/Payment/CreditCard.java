package Payment;

public class CreditCard extends Card{

    public CreditCard(String userName, String cardNo){
        super(cardNo, userName);
    }
    @Override
    public void pay() {
        System.out.println("Making payment via credit card");
    }
}
