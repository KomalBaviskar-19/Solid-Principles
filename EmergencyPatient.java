import java.util.PriorityQueue;
import java.util.Scanner;

class Patient {
    String name;
    int severity;
    long timestamp;

    Patient(String name, int severity, long timestamp) {
        this.name = name;
        this.severity = severity;
        this.timestamp = timestamp;
    }
}

public class EmergencyPatient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Patient> pq = new PriorityQueue<>((a, b) -> {
            if (a.severity != b.severity)
                return a.severity - b.severity;
            return Long.compare(a.timestamp, b.timestamp);
        });

        for (int i = 0; i < 5; i++) {
            String name = sc.next();
            int severity = sc.nextInt();
            pq.add(new Patient(name, severity, System.nanoTime()));
        }

        while (!pq.isEmpty()) {
            System.out.println(pq.poll().name);
        }
    }
}
