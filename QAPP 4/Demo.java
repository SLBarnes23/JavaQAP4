public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(7, 5);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);

        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        Scalable[] scalables = {shapes[0], shapes[1], shapes[2], shapes[3]};
        scaleShapes(scalables, 2);

        System.out.println("After scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
    }
}
