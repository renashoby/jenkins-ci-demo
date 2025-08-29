public class Calculator {
    public static void main(String[] args) {
        System.out.println("=== Jenkins CI Calculator Demo ===");
        System.out.println("Build executed at: " + new java.util.Date());
        
        // Default values if no arguments provided
        double num1 = 10.0;
        double num2 = 5.0;
        
        if (args.length >= 2) {
            try {
                num1 = Double.parseDouble(args[0]);
                num2 = Double.parseDouble(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Using default values due to invalid input");
            }
        }
        
        System.out.println("Numbers: " + num1 + " and " + num2);
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        
        if (num2 != 0) {
            System.out.println("Division: " + (num1 / num2));
        } else {
            System.out.println("Division: Cannot divide by zero");
        }
        
        System.out.println("Build Status: SUCCESS");
    }
}
