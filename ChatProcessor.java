import java.util.concurrent.LinkedBlockingQueue;

public class ChatProcessor {
    public static void main(String[] args) {
        LinkedBlockingQueue<String> chatQueue = new LinkedBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    chatQueue.put("Message " + i);
                    System.out.println("Added: Message " + i);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    String msg = chatQueue.take();
                    System.out.println("Processed: " + msg);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        producer.start();
        consumer.start();
    }
}
