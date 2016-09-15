import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Fractions {

    enum Accuracy {
        Halves(2),
        Thirds(3),
        Quarters(4),
        Eights(8),
        Sixteens(16),
        Tenths(10),
        Hundreds(100);
        BigDecimal acc;
        Accuracy(int acc) {
            this.acc = new BigDecimal(acc);
        }
    }

    public static String calculateFractionOf(BigDecimal number, Accuracy accuracy) {
        BigDecimal integer = number.divideToIntegralValue(new BigDecimal(1));
        BigDecimal decimal = number.subtract(integer);
        StringBuilder builder = new StringBuilder();
        decimal = decimal.multiply(accuracy.acc).round(new MathContext(10, RoundingMode.UP));
        int numerator = integer.multiply(accuracy.acc).add(decimal).intValue();
        if (numerator > 0) {
            builder.append(numerator + "/" + accuracy.acc);
        }
        return builder.toString();
    }

    private static double roundTo(double decimal, double i) {
        return Math.round(decimal * i) ;
    }

}
