import java.util.Scanner;
import java.util.Stack;

public class UndoStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < 3; i++) {
            stack.push(sc.nextLine());
        }
        String undone = stack.pop();
        Stack<String> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        temp.push(undone);
        while (!temp.isEmpty()) {
            System.out.println(temp.pop());
        }
    }
}
