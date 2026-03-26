package kiemtra.lt10.s1;
public class Bai1_GenericMethod {
    public static <E> void printArray(E[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
 
    public static void main(String[] args) {
        // Kiểm thử với mảng Integer[]
        Integer[] intArray = {10, 20, 30, 40, 50};
        System.out.print("Mang Integer: ");
        printArray(intArray);
 
        // Kiểm thử với mảng String[]
        String[] strArray = {"Java", "Generic", "Method", "Example"};
        System.out.print("Mảng String:  ");
        printArray(strArray);
 
        // Mở rộng: kiểm thử với Double[]
        Double[] dblArray = {1.1, 2.2, 3.3};
        System.out.print("Mang Double:  ");
        printArray(dblArray);
    }
}