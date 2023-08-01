public class CalculatorApp {
    public static void main(String[] args) {
        ComplexNumber a = new ComplexNumberImpl(2.0, 3.0);
        ComplexNumber b = new ComplexNumberImpl(1.0, 2.0);

        ComplexCalculator calculator = new ComplexCalculatorImpl();
        ComplexNumber sum = calculator.add(a, b);
        ComplexNumber product = calculator.multiply(a, b);
        ComplexNumber quotient = calculator.divide(a, b);

        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
        System.out.println("Частное: " + quotient);
    }
}