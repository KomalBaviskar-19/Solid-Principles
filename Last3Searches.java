import java.util.Scanner;
import java.util.ArrayDeque;

public class Last3Searches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            if (deque.size() == 3) {
                deque.removeFirst();
            }
            deque.addLast(s);
        }
        for (String s : deque) {
            System.out.println(s);
        }
    }
}
