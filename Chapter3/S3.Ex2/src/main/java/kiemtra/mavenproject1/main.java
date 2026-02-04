
package kiemtra.mavenproject1;
public class main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Thread t = new NumberThread("Thread-" + i);
            t.start();
        }
    }
}