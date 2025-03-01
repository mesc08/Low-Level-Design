package BadCode;

public class Invoice {

    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generate and printed for the amount " + amount);
    }


    public void saveToDatabase(){
        System.out.println("Saving invoice to database");
    }


    public void sendEmailNotification(){
        System.out.println("Sending email notification for invoice");
    }
}
