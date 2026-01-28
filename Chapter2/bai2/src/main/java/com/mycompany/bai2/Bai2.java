/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai2;

// 1. Interface Notification
interface Notification {
    void notifyUser();
}

// 2. Các class implement Notification
class SMSNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Gui thong bao qua SMS");
    }
}

class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Gui thong bao qua Email");
    }
}

class PushNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Gui thong bao qua Push Notification");
    }
}

// 3. Factory tạo Notification
class NotificationFactory {

    public static Notification createNotification(String channel) {
        if (channel == null) {
            return null;
        }

        switch (channel.toLowerCase()) {
            case "sms":
                return new SMSNotification();
            case "email":
                return new EmailNotification();
            case "push":
                return new PushNotification();
            default:
                return null;
        }
    }
}

// Class main để test
public class Bai2 {

    public static void main(String[] args) {

        Notification noti1 = NotificationFactory.createNotification("sms");
        Notification noti2 = NotificationFactory.createNotification("email");
        Notification noti3 = NotificationFactory.createNotification("push");

        noti1.notifyUser();
        noti2.notifyUser();
        noti3.notifyUser();
    }
}
