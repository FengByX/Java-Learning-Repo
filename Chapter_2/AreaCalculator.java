public class AreaCalculator {
    public static void main(String[] args) {
        int length, width;
        length = 15;
        width = 20;
        int area = length * width;
        if (area > 100) {
            System.out.println("面积大于100");
        } else
            System.out.print("面积小于等于100");
    }
}
