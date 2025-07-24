import java.util.concurrent.LinkedBlockingQueue;

class Task {
    int id;
    String name;
    Task(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class StageBasedTaskRunner {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue<Task> stage1 = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Task> stage2 = new LinkedBlockingQueue<>();

        stage1.put(new Task(1, "A"));
        stage1.put(new Task(2, "B"));
        stage1.put(new Task(3, "C"));
        stage1.put(new Task(4, "D"));

        while (!stage1.isEmpty()) {
            Task t = stage1.take();
            if (t.id % 2 == 0) {
                stage2.put(t);
            }
        }

        for (Task t : stage2) {
            System.out.println(t.name);
        }
    }
}
