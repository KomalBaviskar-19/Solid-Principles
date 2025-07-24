interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email: " + message);
    }
}

class Notification {
    private MessageService service;

    public Notification(MessageService service) {
        this.service = service;
    }

    public void alert(String msg) {
        service.sendMessage(msg);
    }
}

public class DIPExample {
    public static void main(String[] args) {
        MessageService service = new EmailService();
        Notification notification = new Notification(service);
        notification.alert("Hello Komal!");
    }
}
