import java.util.Scanner;
import java.util.ArrayDeque;

public class LimitedChat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> chat = new ArrayDeque<>();
        for (int i = 0; i < 6; i++) {
            String msg = sc.nextLine();
            if (chat.size() == 4) {
                chat.removeFirst();
            }
            chat.addLast(msg);
        }
        for (String m : chat) {
            System.out.println(m);
        }
    }
}
