package BadCode;

public class NotificationService {

    private EmailService emailService;

    private SmsService smsService;

    public NotificationService(){
        this.emailService = new EmailService();
        this.smsService = new SmsService();
    }

    public void notifyByEmail(String msg){
        emailService.SendEmail(msg);
    }

    public void notifyBySms(String msg){
        smsService.SendSms(msg);
    }



}
