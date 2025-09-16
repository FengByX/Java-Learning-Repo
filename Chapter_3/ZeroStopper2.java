import java.util.Scanner;

public class ZeroStopper2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i;
        do {
            i = scanner.nextInt();
        } while (i != 0);
    }
}
