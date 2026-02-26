/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kiemtra.s4.ex2;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> cities = Arrays.asList(
                "Hanoi",
                "Ho Chi Minh",
                "Da Nang",
                "Hue"
        );

        // Sap xep theo do dai ten thanh pho (tu ngan den dai)
        Collections.sort(cities, (c1, c2) -> c1.length() - c2.length());

        // In ket qua
        for (String city : cities) {
            System.out.println(city);
        }
    }
}