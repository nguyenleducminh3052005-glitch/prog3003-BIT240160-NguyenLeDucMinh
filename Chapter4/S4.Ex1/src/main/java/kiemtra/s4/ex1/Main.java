
package kiemtra.s4.ex1;
public class Main {
    public static void main(String[] args) {

        // Lambda cho phép cộng
        MathOperation add = (a, b) -> a + b;

        // Lambda cho phép trừ
        MathOperation subtract = (a, b) -> a - b;

        // Lambda cho phép nhân
        MathOperation multiply = (a, b) -> a * b;

        // Lambda cho phép chia
        MathOperation divide = (a, b) -> {
            if (b == 0) {
                throw new ArithmeticException("Khong the chia cho 0");
            }
            return a / b;
        };

        // Ví dụ chạy
        int a = 10;
        int b = 5;

        System.out.println("Cong: " + add.compute(a, b));
        System.out.println("Tru: " + subtract.compute(a, b));
        System.out.println("Nhan: " + multiply.compute(a, b));
        System.out.println("Chia: " + divide.compute(a, b));
    }
}

