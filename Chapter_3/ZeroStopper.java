import java.util.Scanner;

public class ZeroStopper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();

        while (i != 0) {
            i = scanner.nextInt();
        }

    }
}
