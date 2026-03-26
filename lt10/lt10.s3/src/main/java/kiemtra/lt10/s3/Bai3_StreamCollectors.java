
package kiemtra.lt10.s3;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Bai3_StreamCollectors {

    // ============================================================
    // Class Employee (id, name, salary)
    // ============================================================
    static class Employee {
        private int id;
        private String name;
        private double salary;

        public Employee(int id, String name, double salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public String getName()   { return name; }
        public double getSalary() { return salary; }

        @Override
        public String toString() {
            return String.format("Employee{id=%d, name='%s', salary=%.0f}", id, name, salary);
        }
    }

    public static void main(String[] args) {
        // Danh sach 4 nhan vien (co nguoi luong < 1000, co nguoi > 1000)
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Nguyen Van An",   500),
            new Employee(2, "Tran Thi Bich",  1500),
            new Employee(3, "Le Minh Chau",    800),
            new Employee(4, "Pham Duc Dung",  2000)
        );

        System.out.println("=== Danh sach nhan vien goc ===");
        employees.forEach(System.out::println);

        // Stream: lọc luong > 1000, lay ten, sap xep alpha, gom vao List
        List<String> result = employees.stream()
            .filter(e -> e.getSalary() > 1000)          // 1. Lọc luong > 1000
            .map(Employee::getName)                      // 2. Lay ra ten
            .sorted()                                    // 3. Sap xep Alpha-beta (A-Z)
            .collect(Collectors.toList());               // 4. Gom ve List<String>

        System.out.println("\n=== Ten nhan vien luong > 1000 (sap xep A-Z) ===");
        result.forEach(name -> System.out.println("  - " + name));
    }
}