
package kiemtra.lt10.s2;
interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("[EmailService] Gửi email: " + message);
    }
}

class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("[SMSService]  Gửi SMS:   " + message);
    }
}

class Notification {
    // Dependency được inject từ bên ngoài
    private MessageService messageService;

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }
 
    public void notifyUser(String message) {
        if (messageService == null) {
            throw new IllegalStateException("MessageService chưa được inject!");
        }
        messageService.sendMessage(message);
    }
}
public class Bai2_SetterInjection {
    public static void main(String[] args) {
        Notification notification = new Notification();
 
        // Inject EmailService và gửi thông báo
        notification.setMessageService(new EmailService());
        notification.notifyUser("Chào mừng bạn đã đăng ký thành công!");
 
        // Đổi sang SMSService (linh hoạt nhờ Setter Injection)
        notification.setMessageService(new SMSService());
        notification.notifyUser("Mã OTP của bạn là: 123456");
 
        System.out.println("\n=> Setter Injection cho phép thay đổi dependency linh hoạt tại runtime.");
    }
}
