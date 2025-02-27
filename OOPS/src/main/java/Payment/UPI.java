package Payment;

public class UPI implements PaymentMethod{

    private String upiId;

    public UPI(String upiId){
        this.upiId  = upiId;
    }


    @Override
    public void pay() {
        System.out.println("Making payment using upi service");
    }
}
