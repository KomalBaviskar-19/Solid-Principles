
import java.util.Scanner;
import java.util.LinkedList;

public class RecentAppMemory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> apps = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            String app = sc.nextLine();
            apps.remove(app);
            apps.addFirst(app);
        }
        for (String a : apps) {
            System.out.println(a);
        }
    }
}
