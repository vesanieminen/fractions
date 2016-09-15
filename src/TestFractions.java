import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TestFractions {
    @Test
    public void testHalves() {
        Fractions.Accuracy half = Fractions.Accuracy.Halves;
        Assert.assertEquals("2/2", Fractions.calculateFractionOf(new BigDecimal(1.1), half));
        Assert.assertEquals("1/2", Fractions.calculateFractionOf(new BigDecimal(.5), half));
        Assert.assertEquals("3/2", Fractions.calculateFractionOf(new BigDecimal(1.3), half));
        Assert.assertEquals("4/2", Fractions.calculateFractionOf(new BigDecimal(1.75), half));
        Assert.assertEquals("5/2", Fractions.calculateFractionOf(new BigDecimal(2.25), half));
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
        Assert.assertEquals("5/4", Fractions.calculateFractionOf(new BigDecimal(1.2), quarters));
        Assert.assertEquals("", Fractions.calculateFractionOf(new BigDecimal(0), quarters));
    }

    @Test
    public void testTenths() {
        Fractions.Accuracy tenths = Fractions.Accuracy.Tenths;
        Assert.assertEquals("1/10", Fractions.calculateFractionOf(new BigDecimal(.1), tenths));
        Assert.assertEquals("4/10", Fractions.calculateFractionOf(new BigDecimal(.35), tenths));
        Assert.assertEquals("12/10", Fractions.calculateFractionOf(new BigDecimal(1.15), tenths));
    }

}
