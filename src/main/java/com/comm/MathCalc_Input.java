package com.comm;

import java.util.Locale;
import java.util.Scanner;
import static java.lang.Math.*;

public class MathCalc_Input {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        try (Scanner scanner = new Scanner(System.in)) {
            double x, a, b, c;

            System.out.print("Enter the value of x: ");
            if (scanner.hasNextDouble()) {
                x = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for x (use a dot as the decimal separator)!");
                return;
            }

            System.out.print("Enter the value of a: ");
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for a (use a dot as the decimal separator)!");
                return;
            }

            System.out.print("Enter the value of b: ");
            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for b (use a dot as the decimal separator)!");
                return;
            }

            System.out.print("Enter the value of c: ");
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
            } else {
                System.err.println("You must enter a valid double for c (use a dot as the decimal separator)!");
                return;
            }

            // Перша частина: e^(cubic root((ax^2 - b) / (c + x)))
            double ax2_minus_b = a * pow(x, 2) - b;       // Обчислення ax^2 - b
            double denominator1 = c + x;                 // c + x
            double cubicRoot = cbrt(ax2_minus_b / denominator1); // Кубічний корінь
            double expPart = exp(cubicRoot);             // eкспонента

            // Друга частина: cos(ax) / e^((x + b) / c)
            double cosPart = cos(a * x);                 // cos(ax)
            double denominator2 = exp((x + b) / c);      // e^((x + b) / c)
            double fractionPart = cosPart / denominator2; // Ділення

            // Загальний результат
            double result = expPart + fractionPart;

            // Виведення результату
            System.out.printf("Result: %.3f\n", result);
        }
    }
}
