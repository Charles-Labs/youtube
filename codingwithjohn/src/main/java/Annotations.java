public class Annotations {
    public static void main(String[] arg){
        System.out.println("Hello world of annotations");
    }

    public static void printImportant(){
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();

        if (Triangle.class.isAnnotationPresent(Important.class))
            System.out.println("A triangle is important");
    }
}