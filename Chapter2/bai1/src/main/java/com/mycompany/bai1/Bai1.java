/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai1;

public class Bai1 {

    private static Bai1 instance;

    private Bai1() {
        System.out.println("da tao ket noi Database");
    }

    public static Bai1 getInstance() {
        if (instance == null) {
            instance = new Bai1();
        }
        return instance;
    }

    public void connect() {
        System.out.println("dang ket noi voi Database...");
    }

    public static void main(String[] args) {
        Bai1 db1 = Bai1.getInstance();
        Bai1 db2 = Bai1.getInstance();

        db1.connect();
        db2.connect();

        System.out.println(db1 == db2); // true
    }
}
