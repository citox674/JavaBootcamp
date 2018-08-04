package sef.ATestTask.SecondActivity;

public class Calculator {

    public double AddNumbers(double[] numbers) {
        double result = 0.0;
        for (int i = 0;i< numbers.length;i++) {
            result += numbers[i];
        }
        return result;

    }

    public double SubtractNumbers(double number1, double number2) {
        return number1 - number2;
    }

    public double MultiplyNumbers(double[] numbers) {
        double result = 1.0;
        for (int i = 0;i< numbers.length;i++) {
            result *= numbers[i];
        }
        return result;
    }

    public double DivideNumbers(double number1, double number2) {
        if (number2 == 0.0) {
            throw new ArithmeticException("Divide by 0 not allowed");
        }
        return number1 / number2;
    }
}