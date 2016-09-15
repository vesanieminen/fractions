import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TestFractions {
    @Test
    public void testHalves() {
        Fractions.Accuracy half = Fractions.Accuracy.Halves;
        Assert.assertEquals("2/2", Fractions.calculateFractionOf(new BigDecimal(1.1), half));
        Assert.assertEquals("1/2", Fractions.calculateFractionOf(new BigDecimal(.5), half));
        Assert.assertEquals("", Fractions.calculateFractionOf(new BigDecimal(0), half));
        Assert.assertEquals("10/2", Fractions.calculateFractionOf(new BigDecimal(5), half));
    }

    @Test
    public void testQuarters() {
        Fractions.Accuracy quarters = Fractions.Accuracy.Quarters;
        Assert.assertEquals("1/4", Fractions.calculateFractionOf(new BigDecimal(.25), quarters));
        Assert.assertEquals("2/4", Fractions.calculateFractionOf(new BigDecimal(.5), quarters));
        Assert.assertEquals("3/4", Fractions.calculateFractionOf(new BigDecimal(.8), quarters));
        Assert.assertEquals("4/4", Fractions.calculateFractionOf(new BigDecimal(.9), quarters));
        Assert.assertEquals("5/4", Fractions.calculateFractionOf(new BigDecimal(.9), quarters));
        Assert.assertEquals("", Fractions.calculateFractionOf(new BigDecimal(0), quarters));
    }
}
