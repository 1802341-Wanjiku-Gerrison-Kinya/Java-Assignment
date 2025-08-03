public class NumberUtilities {

    //Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        if (number == 2) return true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    //Print first 10 Fibonacci numbers starting from 1 and 2
    public static void printFirst10Fibonacci() {
        System.out.println("\nFirst 10 Fibonacci numbers starting from 1 and 2:");
        int a = 1, b = 2;
        System.out.print(a + ", " + b);
        for (int i = 3; i <= 10; i++) {
            int next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        System.out.println();
    }

    //Sum of even Fibonacci numbers less than or equal to 4 million
    public static int sumEvenFibonacci(int limit) {
        int a = 1, b = 2;
        int sum = 0;

        while (b <= limit) {
            if (b % 2 == 0) {
                sum += b;
            }
            int next = a + b;
            a = b;
            b = next;
        }

        return sum;
    }

    // Main method
    public static void main(String[] args) {
        //Display prime numbers between 1 to 500
        System.out.println("Prime numbers between 1 and 500:");
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }

        //Print first 10 Fibonacci numbers
        printFirst10Fibonacci();

        //Sum of even Fibonacci numbers not exceeding 4 million
        int sum = sumEvenFibonacci(4_000_000);
        System.out.println("\nSum of even Fibonacci numbers not exceeding 4 million: " + sum);
    }
}
