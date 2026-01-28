/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex8;

/**
 *
 * @author nguye
 */
import java.util.HashMap;

public class Ex8 {
    public static void main(String[] args) {

        // 1. Tạo HashMap lưu ID và tên nhân viên
        HashMap<Integer, String> employees = new HashMap<>();

        // 2. Thêm 3 nhân viên
        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

        // 3. Lấy tên nhân viên có ID 102
        String name = employees.get(102);
        System.out.println("Nhan vien ID 102: " + name);

        // 4. Kiểm tra ID 105, nếu không có thì thêm
        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
        }

        // In toàn bộ danh sách để kiểm tra
        System.out.println("Danh sach nhan vien: " + employees);
    }
}
