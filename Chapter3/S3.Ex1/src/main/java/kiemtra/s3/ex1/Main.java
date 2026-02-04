
package kiemtra.s3.ex1;
public class Main {
    public static void main(String[] args) {

        // Chạy WorkerThread
        WorkerThread thread1 = new WorkerThread();
        thread1.start();

        // Chạy WorkerRunnable
        Thread thread2 = new Thread(new WorkerRunnable());
        thread2.start();
    }
}
