package Payment;

public class DebitCard extends Card{

    public DebitCard(String userName, String cardNo){
        super(cardNo, userName);
    }

    @Override
    public void pay() {
        System.out.println("Making payment using debit card");
    }
}
