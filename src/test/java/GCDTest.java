import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;

public class GCDTest {

    private GCD gcd;
    private GCD2 gcd2;
    @Before
    public void setUp() {
        gcd = new GCD();
    }
    public void setUp2() { gcd2 = new GCD2();
    }

    @Test
    public void testGCD() {
        double num1 = 2;
        double num2 = 10;
        double expectedResult = 2;
        //Ask
        double result = gcd.gcd(num1, num2);
        //Assert
        Assert.assertEquals(expectedResult, result, 0.01d);
    }
//    @Test
//    public void testGCDCompareGCD2() {
//        double num1 = 2;
//        double num2 = 10;
//        double expectedResult = 2;
//        //Ask
//        double result = gcd.gcd(num1, num2);
//        double result2 = gcd2.gcd2(num1, num2);
//        //Assert
//        Assert.assertEquals(expectedResult, result, 0.01d);
//        Assert.assertEquals(expectedResult, result2, 0.01d);
//
////        Instant start1 = Instant.now();
////// CODE to be timed goes HERE
////        gcd.gcd(num1, num2);
////        Instant finish1 = Instant.now();
////        long timeElapsed1 = Duration.between(start1, finish1).toMillis();
////        System.out.println(timeElapsed1);
////
////        Instant start2 = Instant.now();
////// CODE to be timed goes HERE
////        gcd2.gcd2(num1, num2);
////        Instant finish2 = Instant.now();
////        long timeElapsed2 = Duration.between(start2, finish2).toMillis();
////        System.out.println(timeElapsed2);
////    }
}