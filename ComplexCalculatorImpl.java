import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComplexCalculatorImpl implements ComplexCalculator {
    private static final Logger LOGGER = LogManager.getLogger(ComplexCalculatorImpl.class);

    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        LOGGER.info("Суммированные комплексные числа: {} + {}", a, b);
        double realPartSum = a.getRealPart() + b.getRealPart();
        double imaginaryPartSum = a.getImaginaryPart() + b.getImaginaryPart();
        return new ComplexNumberImpl(realPartSum, imaginaryPartSum);
    }

    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        LOGGER.info("Умноженные комплексные числа: {} * {}", a, b);
        double realPartProduct = a.getRealPart() * b.getRealPart() - a.getImaginaryPart() * b.getImaginaryPart();
        double imaginaryPartProduct = a.getRealPart() * b.getImaginaryPart() + a.getImaginaryPart() * b.getRealPart();
        return new ComplexNumberImpl(realPartProduct, imaginaryPartProduct);
    }

    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) {
        LOGGER.info("Деленные комплексные числа: {} / {}", a, b);
        double denominator = b.getRealPart() * b.getRealPart() + b.getImaginaryPart() * b.getImaginaryPart();
        double realPartQuotient = (a.getRealPart() * b.getRealPart() + a.getImaginaryPart() * b.getImaginaryPart())
                / denominator;
        double imaginaryPartQuotient = (a.getImaginaryPart() * b.getRealPart() - a.getRealPart() * b.getImaginaryPart())
                / denominator;
        return new ComplexNumberImpl(realPartQuotient, imaginaryPartQuotient);
    }
}