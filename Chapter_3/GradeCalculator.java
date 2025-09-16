package Chapter_3;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        for (int i = 1; i < 6; i++) {
            System.out.print("请输入成绩：");
            int score = scanner.nextInt();

            if (score >= 90 && score <= 100) {
                System.out.println("优秀");
                a++;
            } else if (score >= 80 && score <= 89) {
                System.out.println("良好");
                b++;
            } else if (score >= 70 && score <= 79) {
                System.out.println("中等");
                c++;
            } else if (score >= 60 && score <= 69) {
                System.out.println("合格");
                d++;
            } else if (score >= 0 && score <= 59) {
                System.out.println("不合格");
                e++;
            } else {
                System.out.println("输入格式错误，请重新输入");
                i--;
            }
        }
        System.out.println("优秀的人有" + a + "人");
        System.out.println("良好的人有" + b + "人");
        System.out.println("中等的人有" + c + "人");
        System.out.println("合格的人有" + d + "人");
        System.out.println("不合格的人有" + e + "人");
    }
}
