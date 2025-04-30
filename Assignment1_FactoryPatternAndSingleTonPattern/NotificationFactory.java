package Assignment1_FactoryPatternAndSingleTonPattern;

public class NotificationFactory {

    //for singleton pattern
    private static NotificationFactory instance = new NotificationFactory();//Eager initialization
    private NotificationFactory() {
        //private constructor
    }
    public static NotificationFactory getInstance() {
        return instance;
    }
    

    //for factory design pattern 
    public Notification createNotification(String notificationType) {

        if(notificationType.equalsIgnoreCase("email")) {
            return new EmailNotification();
        } else if(notificationType.equalsIgnoreCase("sms")) {
            return new SMSNotification();
        } else if(notificationType.equalsIgnoreCase("push")) {
            return new PushNotification();
        }
        return null;
    }
}
