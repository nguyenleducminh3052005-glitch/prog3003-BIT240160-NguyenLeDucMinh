/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex9;

/**
 *
 * @author nguye
 */
import java.util.TreeMap;
import java.util.Map;

public class Ex9 {
    public static void main(String[] args) {

        // 1. Tạo TreeMap lưu tên sản phẩm và giá tiền
        TreeMap<String, Double> products = new TreeMap<>();

        // 2. Thêm dữ liệu
        products.put("Laptop", 1500.0);
        products.put("Mouse", 25.0);
        products.put("Keyboard", 50.0);

        // 3. In danh sách (tự động sắp xếp theo tên sản phẩm)
        System.out.println("Danh sach san pham:");
        for (Map.Entry<String, Double> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        // 4. Lấy các sản phẩm từ chữ K đến M
        System.out.println("\nSan pham tu K den M:");
        Map<String, Double> subProducts =
                products.subMap("K", "N"); 
        // "N" dùng làm mốc trên để bao trùm các chữ bắt đầu bằng M

        for (Map.Entry<String, Double> entry : subProducts.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
