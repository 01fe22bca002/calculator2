
public class mathlib  {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Cannot divide by zero");
            return Double.NaN; // Not a Number
        }
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }

    public static void main(String[] args) {
        double resultAdd = add(5, 3);
        double resultSubtract = subtract(8, 4);
        double resultMultiply = multiply(2, 6);
        double resultDivide = divide(10, 2);
        double resultPower = power(2, 3);
        double resultSquareRoot = squareRoot(25);

        System.out.println("Addition: " + resultAdd);
        System.out.println("Subtraction: " + resultSubtract);
        System.out.println("Multiplication: " + resultMultiply);
        System.out.println("Division: " + resultDivide);
        System.out.println("Power: " + resultPower);
        System.out.println("Square Root: " + resultSquareRoot);
    }
}