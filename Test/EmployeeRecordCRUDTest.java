import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class EmployeeRecordCRUDTest {

    @Test
    public void testCRUDOperations() {
        // Redirect System.in and System.out for testing
        ByteArrayInputStream inputStream = new ByteArrayInputStream(("1\n1\nJohn\nManager\n2\n1\n3\n1\nJohn Doe\nManager\n4\n1").getBytes());
        System.setIn(inputStream);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Run the main method
        EmployeeRecordCRUD.main(new String[]{});

        // Check if employee is created, read, updated, and deleted successfully
        String output = outputStream.toString();
        assertTrue(output.contains("Employee created successfully."));
        assertTrue(output.contains("Employee found:"));
        assertTrue(output.contains("Employee updated successfully."));
        assertTrue(output.contains("Employee deleted successfully."));
    }
    
}
