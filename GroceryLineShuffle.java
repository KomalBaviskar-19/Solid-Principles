import java.util.Scanner;
import java.util.ArrayDeque;

public class GroceryLineShuffle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            String name = sc.nextLine();
            if (name.length() % 2 == 0) {
                queue.addFirst(name);
            } else {
                queue.addLast(name);
            }
        }
        for (String name : queue) {
            System.out.println(name);
        }
    }
}
