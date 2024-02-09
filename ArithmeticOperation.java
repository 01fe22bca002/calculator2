
import java.util.Scanner;

public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        double number = scanner.nextDouble();

        System.out.println("Square: " + square(number));
        System.out.println("Cube: " + cube(number));

        System.out.println("Enter another number:");
        double anotherNumber = scanner.nextDouble();

        System.out.println("Modulus: " + modulus(number, anotherNumber));
        System.out.println("Enter the exponent for power operation:");
        int exponent = scanner.nextInt();
        System.out.println("Power: " + power(number, exponent));

        scanner.close();
    }

    public static double square(double num) {
        return num * num;
    }

    public static double cube(double num) {
        return num * num * num;
    }

    public static double modulus(double num1, double num2) {
        return num1 % num2;
    }

    public static double power(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}
