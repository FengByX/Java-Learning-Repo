package Chapter_4;

public class Box2 {
    int width,height,depth;
    Box2(int width,int height,int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}

class BoxDemo2{
    public static void main(String[] args) {
        Box2 mybox1 = new Box2(10,15,10);
        Box2 mybox2 = new Box2(20,30,20);

    }
}
