/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex7;

/**
 *
 * @author nguye
 */
import java.util.TreeSet;

public class Ex7 {
    public static void main(String[] args) {

        // 1. Tạo TreeSet và thêm các tên
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        // 2. In danh sách và quan sát thứ tự (tự động sắp xếp theo alphabet)
        System.out.println("Danh sach ten (da sap xep):");
        System.out.println(names);

        // 3. Lấy phần tử đầu tiên và cuối cùng
        String first = names.first();
        String last = names.last(); 

        System.out.println("Phan tu dau tien (MIN): " + first);
        System.out.println("Phan tu cuoi cung (MAX): " + last);
    }
}
