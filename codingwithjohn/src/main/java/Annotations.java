import java.util.ArrayList;
import java.util.List;

public class Annotations {
    public static void main(String[] arg){
        System.out.println("Hello world of annotations");
        printImportant();
    }

    public static void printImportant(){
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(triangle);
        shapes.add(square);
        shapes.add(circle);

        for (Shape shape: shapes){
            if (Shape.class.isAnnotationPresent(Important.class))
                System.out.println("Shape is important");
            else
                System.out.println("Shape is not important");
        }

        if (Triangle.class.isAnnotationPresent(Important.class))
            System.out.println("A triangle is important");
        else
            System.out.println("A triangle is not important");

        if (Square.class.isAnnotationPresent(Important.class))
            System.out.println("A square is important");
        else
            System.out.println("A square is not important");

        if (Circle.class.isAnnotationPresent(Important.class))
            System.out.println("A circle is important");
        else
            System.out.println("A circle is not important");
    }
}