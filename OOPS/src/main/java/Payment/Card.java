package Payment;

public abstract class Card implements PaymentMethod{

    protected String cardNo;

    protected String userName;

    public Card(String cardNo, String userName){
        this.cardNo = cardNo;
        this.userName = userName;
    }

    public String getCardNo(){
        return  this.cardNo;
    }

    public String getUserName(){
        return this.userName;
    }


}
