
package kiemtra.s4.ex5;
import java.util.function.Supplier;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        // 1. Supplier tra ve so ngau nhien tu 0 den 100
        Supplier<Double> randomSupplier = () -> Math.random() * 100;

        // 2. Consumer in so voi dinh dang yeu cau
        Consumer<Double> printConsumer = number ->
                System.out.println("So may man: " + number);

        // 3. Goi Supplier lay so, dua vao Consumer de in
        Double luckyNumber = randomSupplier.get();
        printConsumer.accept(luckyNumber);
    }
}
