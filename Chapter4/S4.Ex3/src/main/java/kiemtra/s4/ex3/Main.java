
package kiemtra.s4.ex3;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        // Lambda kiem tra so chan
        Predicate<Integer> isEven = n -> n % 2 == 0;

        int number = 10;

        if (isEven.test(number)) {
            System.out.println(number + " la so chan");
        } else {
            System.out.println(number + " la so le");
        }
    }
}