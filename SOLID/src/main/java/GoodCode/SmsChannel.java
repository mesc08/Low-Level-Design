package GoodCode;

public class SmsChannel implements NotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending sms message "+ message);
    }
}
