package DecimalToBinaryRecursive;

import java.util.Scanner;

public class DecimalToBinaryRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            System.out.print("Enter a decimal number: ");
            int decimal = scanner.nextInt();

            System.out.print("Binary equivalent: ");
            decimalToBinary(decimal); // Call the recursive function to convert decimal to binary
            System.out.println();

            System.out.print("Do you want to continue? (Y/N): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'Y' || choice == 'y');

    }

    // Recursive function to convert decimal to binary and print the binary representation
    public static void decimalToBinary(int decimal) {
        if (decimal > 0) { // Base case: if decimal is greater than 0
            decimalToBinary(decimal / 2); // Recursively call the function with decimal divided by 2
            System.out.print(decimal % 2); // Print the remainder (binary digit)
        }
    }
}
