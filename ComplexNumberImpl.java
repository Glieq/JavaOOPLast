public class ComplexNumberImpl implements ComplexNumber {
    private double realPart;
    private double imaginaryPart;

    public ComplexNumberImpl(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    @Override
    public double getRealPart() {
        return realPart;
    }

    @Override
    public double getImaginaryPart() {
        return imaginaryPart;
    }

    @Override
    public ComplexNumber add(ComplexNumber other) {
        double newRealPart = this.realPart + other.getRealPart();
        double newImaginaryPart = this.imaginaryPart + other.getImaginaryPart();
        return new ComplexNumberImpl(newRealPart, newImaginaryPart);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber other) {
        double newRealPart = this.realPart * other.getRealPart() - this.imaginaryPart * other.getImaginaryPart();
        double newImaginaryPart = this.realPart * other.getImaginaryPart() + this.imaginaryPart * other.getRealPart();
        return new ComplexNumberImpl(newRealPart, newImaginaryPart);
    }

    @Override
    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.getRealPart() * other.getRealPart() + other.getImaginaryPart() * other.getImaginaryPart();
        double newRealPart = (this.realPart * other.getRealPart() + this.imaginaryPart * other.getImaginaryPart()) / denominator;
        double newImaginaryPart = (this.imaginaryPart * other.getRealPart() - this.realPart * other.getImaginaryPart()) / denominator;
        return new ComplexNumberImpl(newRealPart, newImaginaryPart);
    }

    @Override
    public String toString() {
        return realPart + " + " + imaginaryPart + "i";
    }
}