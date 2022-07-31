import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GCD2Test {
    private GCD2 gcd2;
    @Before
    public void setUp() {
        gcd2 = new GCD2();
    }
    @Test
    public void testGCD() {
        double num1 = 2;
        double num2 = 10;
        double expectedResult = 2;
        //Ask
        double result = gcd2.gcd2(num1, num2);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }
}