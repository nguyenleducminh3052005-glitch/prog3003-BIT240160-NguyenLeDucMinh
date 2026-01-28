/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

/**
 *
 * @author nguye
 */
public class Ex1<T> {

    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    public static void main(String[] args) {
        Ex1<Integer> t1 = new Ex1<>();
        t1.set(100);
        System.out.println(t1.get());

        Ex1<String> t2 = new Ex1<>();
        t2.set("Hello");
        System.out.println(t2.get());
    }
}
