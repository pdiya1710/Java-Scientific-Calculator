//Java Calculator — *Beginner OOP Console Calculator*

// What you learn:** classes, methods, Scanner, exception handling

import java.util.Scanner;

class Calculator {
    double add(double a, double b) { return a + b; }
    double sub(double a, double b) { return a - b; }
    double mul(double a, double b) { return a * b; }
    double div(double a, double b) {
        if (b == 0) {
            System.out.println("Division by zero not allowed");
            return 0;
        }
        return a / b;
    }
}

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("--- Java Calculator ---");
        System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
        int choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        switch (choice) {
            case 1: System.out.println(calc.add(x, y)); break;
            case 2: System.out.println(calc.sub(x, y)); break;
            case 3: System.out.println(calc.mul(x, y)); break;
            case 4: System.out.println(calc.div(x, y)); break;
            default: System.out.println("Invalid choice");
        }
        sc.close();
    }
}
