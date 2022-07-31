import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {
    private Factorial factorial;
    @Before
    public void setUp() {
        factorial = new Factorial();
    }

    @Test
    public void testFactorial() {
        double num1 = 5;
        double expectedResult = 120;
        //Ask
        double result = factorial.factorial(num1);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }

}