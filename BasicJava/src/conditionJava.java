

import java.util.Scanner;

public class conditionJava {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Condition to check if number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Condition to check if number is even or odd
        if (number % 2 == 0) {
            System.out.println("It is an even number.");
        } else {
            System.out.println("It is an odd number.");
        }

    String result="";

    result=number>0?"The number is positive.": number<0?"The number is negative.": "The number is zero.";

    System.out.println(result);

        scanner.close();
    }
}
