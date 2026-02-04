package kiemtra.s3.ex3;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class main {
    public static void main(String[] args) {

        // B1: Cung cấp array bất đồng bộ
        CompletableFuture<int[]> future = CompletableFuture.supplyAsync(() -> {
            return new int[]{1, 2, 5, 3, 100};
        });

        // B2: Lấy số lẻ và sắp xếp tăng dần
        CompletableFuture<List<Integer>> oddSortedFuture = future.thenApply(array ->
                Arrays.stream(array)
                        .filter(n -> n % 2 != 0)
                        .sorted()
                        .boxed()
                        .collect(Collectors.toList())
        );

        // B3: Chuyển kết quả thành chuỗi
        CompletableFuture<String> resultStringFuture = oddSortedFuture.thenApply(list ->
                "Ket qua là: " + list
        );

        // B4: In ra màn hình
        resultStringFuture.thenAccept(System.out::println);

        // Chờ CompletableFuture hoàn thành (tránh chương trình kết thúc sớm)
        resultStringFuture.join();
    }
}

