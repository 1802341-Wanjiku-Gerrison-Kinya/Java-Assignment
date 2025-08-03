public class OperatorExample {
    public static void main(String[] args) {
        // Unary Operator Example
        int x = 5;
        System.out.println("Unary Operators:");
        System.out.println("Original x: " + x);
        x++; // x becomes 6 (post-increment)
        System.out.println("x++: " + x);
        int y = -x; // y becomes -6 (unary minus)
        System.out.println("-x: " + y);
        boolean isSunny = true;
        System.out.println("!isSunny: " + !isSunny); // Logical NOT

        // Binary Operator Example
        int a = 10;
        int b = 3;
        System.out.println("\nBinary Operators:");
        System.out.println("a + b: " + (a + b)); // Addition
        System.out.println("a / b: " + (a / b)); // Division (integer division)
        System.out.println("a == b: " + (a == b)); // Equality

        // Ternary Operator Example
        int score = 75;
        String grade = (score >= 60) ? "Pass" : "Fail";
        System.out.println("\nTernary Operator:");
        System.out.println("Score " + score + " results in: " + grade);
    }
}
