package Chapter_4;

public class Box {

    int width, height, depth;

    int getVolume() {
        return width * depth * height;
    }
}

class BoxDemo {

    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();

        myBox1.width = 10;
        myBox2.width = 15;

        myBox1.height = 20;
        myBox2.height = 25;

        myBox1.depth = 30;
        myBox2.depth = 35;

        myBox1.getVolume();
        myBox2.getVolume();

        System.out.println("myBox1 的体积是：" + myBox1.getVolume());
        System.out.println("myBox2 的体积是：" + myBox2.getVolume());
    }
}
