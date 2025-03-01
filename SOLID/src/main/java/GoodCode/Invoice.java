package GoodCode;

public class Invoice {

    private double amount;

    public Invoice(double amount){
        this.amount = amount;
    }

    public void generateInvoice(){
        System.out.println("Invoice generate and printed for the amount " + amount);
    }
}
