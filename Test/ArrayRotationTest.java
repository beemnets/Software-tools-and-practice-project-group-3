import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayRotationTest {

    @Test
    public void testRotateLeft() {
        int[] arr = {1, 2, 3, 4, 5};
        int[] expected = {3, 4, 5, 1, 2};
        ArrayRotation.rotateLeft(arr, 2);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testRotateRight() {
        int[] arr = {1, 2, 3, 4, 5};

        int[] expected = {4, 5, 1, 2, 3};
        ArrayRotation.rotateRight(arr, 2);
        assertArrayEquals(expected, arr);
    }
    
}
