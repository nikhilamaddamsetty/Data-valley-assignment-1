public class DivisionProgram {
    public static void main(String[] args) {
        divideNumbers(10, 2);
        divideNumbers(10, 0); 
    }

    public static void divideNumbers(int numerator, int denominator) {
        try{
            int result = numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            
            System.out.println("Error: Division by zero is not allowed.");
        }
    }
}



Output:
Result of division: 5
ERROR!
Error: Division by zero is not allowed.
