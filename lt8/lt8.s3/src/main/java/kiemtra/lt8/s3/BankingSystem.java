/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kiemtra.lt8.s3;
import java.util.concurrent.*;

public class BankingSystem {

    public static void main(String[] args) {

        CompletableFuture<Boolean> auth = CompletableFuture.supplyAsync(() -> {
            sleep(2);
            System.out.println("Authenticating...");
            return true; 
        });

        CompletableFuture<Boolean> balance = auth.thenApplyAsync(result -> {
            if (!result) throw new RuntimeException("Auth failed");
            sleep(2);
            System.out.println("Checking balance...");
            return true;
        });

        CompletableFuture<Void> transaction = balance.thenAcceptAsync(result -> {
            if (!result) throw new RuntimeException("Not enough money");
            sleep(2);
            System.out.println("Transaction success!");
        });

        transaction.exceptionally(ex -> {
            System.out.println("Error: " + ex.getMessage());
            return null;
        }).join();
    }

    static void sleep(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}