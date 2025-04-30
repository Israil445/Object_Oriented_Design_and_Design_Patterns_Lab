package Assignment1_FactoryPatternAndSingleTonPattern;
public class SMSNotification implements Notification {

    @Override
    public void notifyUser(String sms) {
        System.out.println("Notification::sms: " + sms + "\n");
    }
}