# tandemloop_java_test
import java.util.Scanner;

class Calculator {
    public double calculate(double a, double b, String op) {
        switch(op.toLowerCase()) {
            case "add": return a + b;
            case "sub": return a - b;
            case "mul": return a * b;
            case "div": return b != 0 ? a / b : Double.NaN; // Handle division by zero
            default: return Double.NaN;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operation (add, sub, mul, div): ");
        String op = sc.next();
        
        Calculator calc = new Calculator();
        double result = calc.calculate(a, b, op);
        System.out.println("Result: " + result);
    }
}
