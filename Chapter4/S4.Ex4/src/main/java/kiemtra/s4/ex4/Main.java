/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kiemtra.s4.ex4;
import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        List<String> moneyList = Arrays.asList("$10", "$20", "$50");

        // Function cat bo dau $ va chuyen sang Integer
        Function<String, Integer> convertMoney = s -> 
                Integer.valueOf(s.replace("$", ""));

        List<Integer> result = new ArrayList<>();

        // Ap dung function cho tung phan tu
        for (String money : moneyList) {
            result.add(convertMoney.apply(money));
        }

        // In ket qua
        System.out.println(result);
    }
}