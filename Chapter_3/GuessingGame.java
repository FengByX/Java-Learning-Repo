package Chapter_3;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int rd = random.nextInt(10);
        int answer;

        do {
            System.out.println("请输入一个数字：");
            answer = scanner.nextInt();

            if (answer > rd) {
                System.out.println("猜高了");
            } else if (answer < rd) {
                System.out.println("猜低了");
            } else {
                System.out.println("猜对了");
            }
        } while (answer != rd);

    }

}
