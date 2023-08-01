public interface ComplexNumber {
    double getRealPart();

    double getImaginaryPart();

    ComplexNumber add(ComplexNumber other);

    ComplexNumber multiply(ComplexNumber other);

    ComplexNumber divide(ComplexNumber other);
}