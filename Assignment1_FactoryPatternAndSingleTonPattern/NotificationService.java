package Assignment1_FactoryPatternAndSingleTonPattern;
public class NotificationService {
    
    public static void main(String[] args) {

        // using factory design pattern
        // NotificationFactory factory1 = new NotificationFactory();

        // Notification sms1 = factory1.createNotification("sms");
        // sms1.notifyUser("new SMS using factory 1");

        // Notification email1 = factory1.createNotification("email");
        // email1.notifyUser("new Email using factory 1");

        // Notification push1 = factory1.createNotification("push");
        // push1.notifyUser("new Push using factory 1");


        //using singleton design pattern
        NotificationFactory singleNotificationFactory  = NotificationFactory.getInstance();

        Notification sms = singleNotificationFactory.createNotification("sms");
        sms.notifyUser("new SMS notification using single notification factory");

        Notification email = singleNotificationFactory.createNotification("email");
        email.notifyUser("new email notification using single notification factory");

        Notification push = singleNotificationFactory.createNotification("push");
        push.notifyUser("new push notfication using single notification factory");
    }
}
