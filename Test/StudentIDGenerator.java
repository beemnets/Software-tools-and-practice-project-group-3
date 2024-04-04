public class StudentIDGenerator {

    public static String generateID(String firstName, String fatherName, int batch, String phoneNumber) {
        // Assuming the pattern includes the first three letters of the first name,
        // the first three letters of the father's name, the last two digits of the batch, and the last four digits of the phone number

        // Extracting the required substrings
        String firstThreeFirstName = firstName.substring(0, Math.min(firstName.length(), 3)).toUpperCase();
        String firstThreeFatherName = fatherName.substring(0, Math.min(fatherName.length(), 3)).toUpperCase();
        String lastTwoBatch = String.valueOf(batch % 100);
        String lastFourPhoneNumber = phoneNumber.substring(Math.max(0, phoneNumber.length() - 4));

        // Generating the ID
        StringBuilder idBuilder = new StringBuilder();
        idBuilder.append(firstThreeFirstName);
        idBuilder.append(firstThreeFatherName);
        idBuilder.append(lastTwoBatch);
        idBuilder.append(lastFourPhoneNumber);

        return idBuilder.toString();
    }

    public static void main(String[] args) {
        // Sample data
        String firstName = "John";
        String fatherName = "Doe";
        int batch = 2024;
        String phoneNumber = "1234567890";

        String studentID = generateID(firstName, fatherName, batch, phoneNumber);
        System.out.println("Generated Student ID: " + studentID);
    }
}
