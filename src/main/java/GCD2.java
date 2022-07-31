public class GCD2 {

    public double gcd2(double num1, double num2) {
        while (num2 != 0) {
            double temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }
}
