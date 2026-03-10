package kiemtra.bailuyentap2.s1;
import java.util.TreeSet;

public class Bai1 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sach (tu dong sap xep): " + names);

        System.out.println("Phan tu dau tien (nho nhat): " + names.first()); // Alice
        System.out.println("Phan tu cuoi cung (lon nhat): " + names.last());  // Zack
    }
}