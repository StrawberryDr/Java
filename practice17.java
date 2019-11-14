class Shape {
    public void draw() {
        // 啥都不用干
    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("□");
    }
}
class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("♣");
    }
}
public class Test {
    public static void main(String[] args) {
        Shape shape1 = new Flower();
        Shape shape2 = new Cycle();
        Shape shape3 = new Rect();
        drawMap(shape1);
        drawMap(shape2);
        drawMap(shape3);
    }
    // 打印单个图形
    public static void drawMap(Shape shape) {
        shape.draw();
    }
}