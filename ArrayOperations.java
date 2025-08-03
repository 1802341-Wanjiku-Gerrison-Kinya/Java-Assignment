import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        final int SIZE = 15;
        int[] array = new int[SIZE];
        Scanner scanner = new Scanner(System.in);

        //Input values from the user
        System.out.println("Enter 15 integers:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        //Print values stored in the array
        System.out.println("\nArray elements are:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //Check if a number exists in the array
        System.out.print("\nEnter a number to search in the array: ");
        int searchNum = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < SIZE; i++) {
            if (array[i] == searchNum) {
                System.out.println("The number found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Number not found in this array");
        }

        //Create another array with elements in reverse order
        int[] reversedArray = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            reversedArray[i] = array[SIZE - 1 - i];
        }

        // Print the reversed array
        System.out.println("\nReversed array elements are:");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(reversedArray[i] + " ");
        }
        System.out.println();

        //Calculate sum and product
        int sum = 0;
        long product = 1;
        for (int i = 0; i < SIZE; i++) {
            sum += array[i];
            product *= array[i];
        }

        // Print sum and product
        System.out.println("\nSum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);

        scanner.close();
    }
}
