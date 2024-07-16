package AbstractFactory;

// Notification.java
 interface Notification {
    void sendNotification();
}

// EmailNotification.java
class EmailNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending email notification");
    }
}

// SmsNotification.java
class SmsNotification implements Notification {
    @Override
    public void sendNotification() {
        System.out.println("Sending SMS notification");
    }
}

// NotificationFactory.java
interface NotificationFactory {
    Notification createNotification();
}

// EmailNotificationFactory.java
class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}

// SmsNotificationFactory.java
class SmsNotificationFactory implements NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}

// AbstractFactory.java
abstract class AbstractFactory {
    abstract NotificationFactory getFactory(String type);
}

// NotificationAbstractFactory.java
class NotificationAbstractFactory extends AbstractFactory {
    @Override
    NotificationFactory getFactory(String type) {
        if ("EMAIL".equalsIgnoreCase(type)) {
            return new EmailNotificationFactory();
        } else if ("SMS".equalsIgnoreCase(type)) {
            return new SmsNotificationFactory();
        }
        return null;
    }
}

// AbstractFactoryPatternExample.java
public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new NotificationAbstractFactory();

        // Get an Email Notification Factory
        NotificationFactory emailFactory = abstractFactory.getFactory("EMAIL");
        Notification emailNotification = emailFactory.createNotification();
        emailNotification.sendNotification(); // Output: Sending email notification

        // Get an SMS Notification Factory
        NotificationFactory smsFactory = abstractFactory.getFactory("SMS");
        Notification smsNotification = smsFactory.createNotification();
        smsNotification.sendNotification(); // Output: Sending SMS notification
    }
}

