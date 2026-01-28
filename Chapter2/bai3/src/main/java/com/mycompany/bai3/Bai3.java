/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bai3;

// Subsystem classes
class TV {
    public void on() {
        System.out.println("TV duoc bat");
    }
}

class SoundSystem {
    public void on() {
        System.out.println("He thong loa duoc bat");
    }
}

class DVDPlayer {
    public void on() {
        System.out.println("Dau DVD duoc bat");
    }
}

class Light {
    public void dim() {
        System.out.println("Den duoc giam anh sang");
    }
}

// Facade class
class HomeTheaterFacade {

    private TV tv;
    private SoundSystem sound;
    private DVDPlayer dvd;
    private Light light;

    public HomeTheaterFacade() {
        tv = new TV();
        sound = new SoundSystem();
        dvd = new DVDPlayer();
        light = new Light();
    }

    public void watchMovie() {
        System.out.println("Bat dau xem phim");
        light.dim();
        tv.on();
        sound.on();
        dvd.on();
    }
}

// Client
public class Bai3 {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie();
    }
}

