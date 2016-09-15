import java.math.BigDecimal;

public class Fractions {

    enum Accuracy {
        Halves(2),
        Quarters(4),
        Eights(8),
        Sixteens(16),
        Tenths(10),
        Hundreds(100);
        int acc;
        Accuracy(int acc) {
            this.acc = acc;
        }
    }

    public static String calculateFractionOf(BigDecimal number, Accuracy accuracy) {
        BigDecimal integer = number.divideToIntegralValue(new BigDecimal(1));
        double decimal = number.subtract(integer).doubleValue();
        StringBuilder builder = new StringBuilder();
        decimal = roundTo(decimal, accuracy.acc);
        int numerator = integer.intValue() * accuracy.acc + (int)decimal;
        if (numerator > 0) {
            builder.append(numerator + "/" + accuracy.acc);
        }
        return builder.toString();
    }

    private static double roundTo(double decimal, double i) {
        return Math.round(decimal * i) ;
    }

}
