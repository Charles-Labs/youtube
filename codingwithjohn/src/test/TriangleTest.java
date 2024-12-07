import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TriangleTest {

    @Test
    void testSetVertices() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Triangle("triangle"));
    }
}