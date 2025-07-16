

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.print("Choose operation (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        //  Traditional Switch Statement
        System.out.println("\n--- Traditional Switch ---");
        switch (op) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Result: " + (a / b));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation.");
        }

        
        System.out.println("\n--- Enhanced Switch Expression ---");
        String result = switch (op) {
            case '+' -> "Result: " + (a + b);
            case '-' -> "Result: " + (a - b);
            case '*' -> "Result: " + (a * b);
            case '/' -> {
                if (b != 0) yield "Result: " + (a / b);
                else yield "Cannot divide by zero.";
            }
            default -> "Invalid operation.";
        };

        System.out.println(result);
        scanner.close();
    }
}

