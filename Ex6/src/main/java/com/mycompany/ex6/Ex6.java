/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex6;

/**
 *
 * @author nguye
 */
import java.util.HashSet;

public class Ex6 {
    public static void main(String[] args) {

        // 1. Mảng số nguyên ban đầu (có phần tử trùng)
        int[] numbers = {5, 2, 9, 2, 5, 8, 1};

        // 2. Đưa các phần tử vào HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int num : numbers) {
            set.add(num);
        }

        // 3. In ra các phần tử duy nhất
        System.out.println("Cac phan tu duy nhat:");
        System.out.println(set);

        /*
         * 4. Giải thích:
         * HashSet KHÔNG duy trì thứ tự chèn phần tử.
         * Nó lưu trữ dữ liệu dựa trên mã băm (hash code),
         * nên thứ tự in ra có thể khác với thứ tự trong mảng ban đầu.
         */
    }
}
