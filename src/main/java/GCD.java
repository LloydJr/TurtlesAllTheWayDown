public class GCD {
    public double gcd(double num1, double num2) {
        if (num2 == 0)
            return num1;
        return gcd(num2, num1 % num2);
    }

}
