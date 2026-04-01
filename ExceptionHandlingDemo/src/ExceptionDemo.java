public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Exception Handling Demo");

        // 1. Arithmatic Exception
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmatic Error: Cannot divide by 0");
        } finally {
            System.out.println("Finally Block Executed");
        }
    }
}
