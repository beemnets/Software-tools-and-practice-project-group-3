import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArraySubsetTest {

    @Test
    public void testIsSubset() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 4};
        assertTrue(ArraySubset.isSubset(arr2, arr1));
    }

    @Test
    public void testIsNotSubset() {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7};
        assertFalse(ArraySubset.isSubset(arr2, arr1));
    }


}
