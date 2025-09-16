import java.io.IOException;

public class Guess {
    public static void main(String[] args)
            throws IOException {
        char answer = (char) System.in.read();

        switch (answer) {
            case 'D':
                System.out.println("Right!");
                break;

            default:
                System.out.println("不对");
                break;
        }
    }

}
