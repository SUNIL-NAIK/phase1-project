package Project;
import java.util.Scanner;

public class ArithmeticCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Arithmetic Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        int choice = scanner.nextInt();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + add(num1, num2));
                break;
            case 2:
                System.out.println("Result: " + subtract(num1, num2));
                break;
            case 3:
                System.out.println("Result: " + multiply(num1, num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result: " + divide(num1, num2));
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

    // Addition
    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Subtraction
    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Multiplication
    private static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Division
    private static double divide(double num1, double num2) {
        return num1 / num2;
    }
}
