/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kiemtra.lt8.s1;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Them sinh vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim theo ten");
            System.out.println("4. Xoa theo MSSV");
            System.out.println("0. Thoat");

            System.out.print("Chon: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addStudent();
                case 2 -> showList();
                case 3 -> searchByName();
                case 4 -> deleteByMssv();
                case 0 -> {
                    System.out.println("Thoát...");
                    return;
                }
                default -> System.out.println("Sai lựa chọn!");
            }
        }
    }

    static void addStudent() {
        System.out.print("MSSV: ");
        String mssv = sc.nextLine();
        System.out.print("Ten: ");
        String name = sc.nextLine();
        System.out.print("GPA: ");
        double gpa = sc.nextDouble();

        list.add(new Student(mssv, name, gpa));
        System.out.println("Đa them!");
    }

    static void showList() {
        if (list.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        list.forEach(System.out::println);
    }

    static void searchByName() {
        System.out.print("Nhap tên can tim: ");
        String keyword = sc.nextLine();

        for (Student s : list) {
            if (s.getName().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(s);
            }
        }
    }

    static void deleteByMssv() {
        System.out.print("Nhap MSSV can xoa: ");
        String mssv = sc.nextLine();

        list.removeIf(s -> s.getMssv().equals(mssv));
        System.out.println("Đa xoa (neu ton tai)!");
    }
}