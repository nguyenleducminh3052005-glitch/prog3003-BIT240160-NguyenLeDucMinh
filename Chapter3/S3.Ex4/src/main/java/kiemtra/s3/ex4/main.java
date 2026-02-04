package kiemtra.s3.ex4;
import java.util.concurrent.CompletableFuture;

public class main {

    public static void main(String[] args) {

        // 1. Kiểm tra tồn kho
        CompletableFuture<Void> checkStock = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(2000); // giả lập xử lý
                System.out.println(" Da kiem tra ton kho");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 2. Thanh toán
        CompletableFuture<Void> payment = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(3000);
                System.out.println(" Thanh toan thanh cong");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // 3. Vận chuyển
        CompletableFuture<Void> shipping = CompletableFuture.runAsync(() -> {
            try {
                Thread.sleep(4000);
                System.out.println("Don hang dang duoc van chuyen");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        // Kết hợp tất cả tác vụ
        CompletableFuture<Void> allTasks =
                CompletableFuture.allOf(checkStock, payment, shipping);

        // Khi tất cả hoàn thành
        allTasks.thenRun(() -> {
            System.out.println(" Don hang da duoc xu ly hoan tat!");
        });

        // Chờ tất cả task xong
        allTasks.join();
    }
}

