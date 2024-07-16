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

// AbstractFactoryPatternExample.java
public class AbstractFactoryPatternExample {
    public static void main(String[] args) {
        NotificationFactory factory;

        // Get an Email Notification Factory
        factory = new EmailNotificationFactory();
        Notification emailNotification = factory.createNotification();
        emailNotification.sendNotification(); // Output: Sending email notification

        // Get an SMS Notification Factory
        factory = new SmsNotificationFactory();
        Notification smsNotification = factory.createNotification();
        smsNotification.sendNotification(); // Output: Sending SMS notification
    }
}
