import java.util.Scanner;

public class Calculator {
    public static void main(String[] a) {
        System.out.println("How many numbers do you want to add? (minimum 2): ");
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(); // Number of inputs
        if (num < 2) { // Enforcing minimum 2 numbers
            System.out.println("You must enter at least 2 numbers!");
        } else {
            int sum = 0; // Local sum variable
            for (int i = 0; i < num; i++) {
                System.out.println("Enter number " + (i + 1) + ": ");
                sum += scanner.nextInt();
            }
            System.out.println("The sum of the numbers is: " + sum);
        }

        scanner.close();
    }
}
