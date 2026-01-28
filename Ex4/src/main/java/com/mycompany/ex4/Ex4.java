/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex4;

/**
 *
 * @author nguye
 */
import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {

        // 1. Tạo ArrayList chứa các loại quả
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // 2. Thêm "Mango" vào vị trí index 1
        fruits.add(1, "Mango");

        // 3. Thay thế "Banana" bằng "Grapes"
        int index = fruits.indexOf("Banana");
        if (index != -1) {
            fruits.set(index, "Grapes");
        }

        // 4. Kiểm tra "Apple" có tồn tại không
        boolean hasApple = fruits.contains("Apple");
        System.out.println("Apple ton tai: " + hasApple);

        // In danh sách để kiểm tra
        System.out.println("Danh sach trai cay: " + fruits);
    }
}
