/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kiemtra.lt8.s2;
public class Main {

    // Interface
    interface Payment {
        void pay(double amount);
    }

    // Các class thanh toán
    static class CreditCardPayment implements Payment {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Credit Card");
        }
    }

    static class PayPalPayment implements Payment {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using PayPal");
        }
    }

    static class CashPayment implements Payment {
        public void pay(double amount) {
            System.out.println("Paid " + amount + " using Cash");
        }
    }

    // Factory
    static class PaymentFactory {
        public static Payment getPayment(String type) {
            switch (type.toLowerCase()) {
                case "credit":
                    return new CreditCardPayment();
                case "paypal":
                    return new PayPalPayment();
                case "cash":
                    return new CashPayment();
                default:
                    throw new IllegalArgumentException("Invalid payment type");
            }
        }
    }

    // Main chạy
    public static void main(String[] args) {
        Payment p1 = PaymentFactory.getPayment("credit");
        p1.pay(100);

        Payment p2 = PaymentFactory.getPayment("paypal");
        p2.pay(200);

        Payment p3 = PaymentFactory.getPayment("cash");
        p3.pay(50);
    }
}