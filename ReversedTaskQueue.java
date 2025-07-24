import java.util.Scanner;
import java.util.LinkedList;
import java.util.Collections;

public class ReversedTaskQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < 4; i++) {
            String task = sc.nextLine();
            if (task.endsWith("!")) list.addFirst(task);
            else list.addLast(task);
        }
        Collections.reverse(list);
        for (String t : list) System.out.println(t);
    }
}
