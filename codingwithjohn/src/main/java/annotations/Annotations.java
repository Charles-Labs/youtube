package annotations;

import annotations.jEngine.model.Triangle;

import java.util.Arrays;
import java.util.List;

public class Annotations {
    public static void main(String[] arg){
        System.out.println("Hello world of annotations");
        printImportant();
    }

    public static void printImportant() {
        List<Shape> shapes = Arrays.asList(new Triangle("triangle"),
                new Square("square"),
                new Circle("circle"));

        for (Shape shape : shapes) {
            if (shape.getClass().isAnnotationPresent(Important.class))
                System.out.println("A " + shape.getType() + " is important. How important? "
                                    + shape.getClass().getAnnotation(Important.class).howImportant());
            else
                System.out.println("A " + shape.getType() + " is not important");
        }
    }
}