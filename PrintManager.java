import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;

public class PrintManager {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        ArrayBlockingQueue<String> printQueue = new ArrayBlockingQueue<>(3);

        for (int i = 0; i < 5; i++) {
            String job = sc.nextLine();
            if (!printQueue.offer(job)) {
                continue;
            }
        }

        while (!printQueue.isEmpty()) {
            System.out.println("Printing: " + printQueue.take());
        }
    }
}
