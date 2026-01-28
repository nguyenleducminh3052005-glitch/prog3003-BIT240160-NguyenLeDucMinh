/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex3;

/**
 *
 * @author nguye
 */
public class Ex3 {

    // 1. Interface Pair
    interface Pair<K, V> {
        K getKey();
        V getValue();
    }

    // 2. Class OrderedPair implements Pair
    static class OrderedPair<K, V> implements Pair<K, V> {

        private K key;
        private V value;

        public OrderedPair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }
    }

    // 3. Hàm main
    public static void main(String[] args) {

        Pair<String, Integer> pair1 =
                new OrderedPair<>("MSSV", 10170);

        Pair<String, String> pair2 =
                new OrderedPair<>("HoTen", "Nguyen Thi Hoa");

        System.out.println(pair1.getKey() + " : " + pair1.getValue());
        System.out.println(pair2.getKey() + " : " + pair2.getValue());
    }
}
