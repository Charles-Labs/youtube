import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void testSetVertices() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> {
                    Triangle triangle = new Triangle("triangle");

                    triangle.setVertices(new Vertex(1,2,3),
                            new Vertex(1,2,3),
                            new Vertex(1,2,3),
                            new Vertex(1,2,3));
                });
    }
}