import java.util.Scanner;

public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("优秀");
        } else if (score >= 80 && score <= 89) {
            System.out.println("良好");
        } else if (score >= 70 && score <= 79) {
            System.out.println("中等");
        } else if (score >= 60 && score <= 69) {
            System.out.println("合格");
        } else if (score > 100 || score < 0) {
            System.out.println("成绩不合规！");
        } else {
            System.out.println("成绩不合格！");
        }
    }
}
