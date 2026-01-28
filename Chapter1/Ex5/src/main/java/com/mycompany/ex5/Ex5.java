/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex5;

/**
 *
 * @author nguye
 */
import java.util.LinkedList;

public class Ex5 {
    public static void main(String[] args) {

        // 1. Sử dụng LinkedList mô phỏng hàng đợi
        LinkedList<Integer> queue = new LinkedList<>();

        // 2. Thêm các số 10, 20, 30
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // 3. Thêm 5 vào đầu, 40 vào cuối
        queue.addFirst(5);
        queue.addLast(40);

        // 4. Xóa phần tử đầu và cuối
        queue.removeFirst();
        queue.removeLast();

        // In danh sách còn lại
        System.out.println("Danh sach con lai: " + queue);
    }
}
