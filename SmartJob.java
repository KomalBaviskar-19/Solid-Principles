import java.util.Scanner;
import java.util.PriorityQueue;
import java.util.Comparator;

class Job {
    String name;
    int urgency;

    Job(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }
}

public class SmartJob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Job> pq = new PriorityQueue<>(new Comparator<Job>() {
            public int compare(Job j1, Job j2) {
                if (j1.urgency != j2.urgency)
                    return j1.urgency - j2.urgency;
                return j1.name.length() - j2.name.length();
            }
        });

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int urgency = sc.nextInt();
            pq.add(new Job(name, urgency));
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name);
        }
    }
}
