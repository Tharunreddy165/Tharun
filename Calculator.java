package ajp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        double result = 0;
        if (operator == '+') {
            result = num1 + num2;
        } else if (operator == '-') {
            result = num1 - num2;
        } else if (operator == '*') {
            result = num1 * num2;
        } else if (operator == '/') {
            if (num2 != 0)
                result = num1 / num2;
            else {
                System.out.println("Error: Cannot divide by zero!");
                sc.close();
                return;
            }
        } else {
            System.out.println("Invalid operator!");
            sc.close();
            return;
        }

        System.out.println("Result: " + result);
        sc.close();
    }
}


