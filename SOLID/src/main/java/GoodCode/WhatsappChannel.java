package GoodCode;

public class WhatsappChannel implements NotificationChannel{
    @Override
    public void send(String message) {
        System.out.println("Sending whatsapp message "+ message);
    }
}
