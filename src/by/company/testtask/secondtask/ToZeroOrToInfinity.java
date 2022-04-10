package by.company.testtask.secondtask;

public class ToZeroOrToInfinity {

    public static void getResult(int n) {
        double un = (1 / factorial(n)) * sumFactorial(n);
        System.out.format("%.6f", un);
    }

    private static double factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static double sumFactorial(int n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += factorial(i);
        }
        return result;
    }
}
