package Project;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter the email ID to validate: ");
        String user_email_input = scanner.nextLine();

        // Validate the email ID
        if (isValidEmail(user_email_input)) {
            System.out.println("The email ID is valid.");
        } else {
            System.out.println("The email ID is not valid.");
        }

        scanner.close();
    }

    private static boolean isValidEmail(String email) {
        // Regular expression for a simple email validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);

        return matcher.matches();
    }
}
