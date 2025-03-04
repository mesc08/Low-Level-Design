package GoodCode;

public class EmailChannel implements NotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending email message "+ message);
    }
}
