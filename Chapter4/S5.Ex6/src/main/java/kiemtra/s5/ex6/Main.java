
package kiemtra.s5.ex6;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> result = Arrays.asList(1, 2, 3, 4, 5, 6)
                .stream()
                .filter(n -> n % 2 == 0)   // loc so chan
                .map(n -> n * n)          // binh phuong
                .toList();

        System.out.println(result);
    }
}
