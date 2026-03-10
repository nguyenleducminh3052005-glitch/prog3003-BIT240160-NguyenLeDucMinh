package kiemtra.bailuyentap.s3;
import java.util.concurrent.CompletableFuture;

public class Bai3 {

    static CompletableFuture<String> validateCustomer(String name) {
        return CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(1000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            System.out.println(" Xac thuc khach hang hoan thanh: " + name);
            return "Khach hang hop le: " + name;
        });
    }

    static CompletableFuture<String> issueTicket(String movie) {
        return CompletableFuture.supplyAsync(() -> {
            try { Thread.sleep(1500); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
            System.out.println(" Xuat ve hoan thanh: " + movie);
            return "Ve phim: " + movie;
        });
    }

    public static void main(String[] args) throws Exception {
        System.out.println("=== Bat dau dat ve ===");

        CompletableFuture<String> customerFuture = validateCustomer("Nguyen Le Duc Minh");
        CompletableFuture<String> ticketFuture   = issueTicket("DORAEMON");

      
        CompletableFuture<String> combined = customerFuture.thenCombine(
                ticketFuture,
                (customerResult, ticketResult) -> customerResult + " | " + ticketResult
        );

        String finalResult = combined.get(); 
        System.out.println("\n=== Ket qua cuoi cung ===");
        System.out.println(finalResult);
    }
}
