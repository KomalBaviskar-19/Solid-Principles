import java.util.Scanner;

public class AverageConfusion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 10) arr[i] *= 2;
            sum += arr[i];
        }
        System.out.println(sum / 5.0);
    }
}
