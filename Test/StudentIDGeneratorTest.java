import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentIDGeneratorTest {

    @Test
    public void testGenerateID() {
        String firstName = "John";
        String fatherName = "Doe";
        int batch = 2024;
        String phoneNumber = "1234567890";
        String expectedID = "JOHDOE24";
        String generatedID = StudentIDGenerator.generateID(firstName, fatherName, batch, phoneNumber);
        assertEquals(expectedID, generatedID);
    }

}
