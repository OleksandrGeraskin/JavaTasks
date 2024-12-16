package JavaLabs.Lab2;

import java.lang.Math;

public class lab2
{
    public static void main(String[] args)
    {
        double result1 = calculateTask1();
        double result2 = calculateTask2();
        double result3 = calculateTask3();

        System.out.printf("Результат першого виразу: y = %.6f%n", result1);
        System.out.printf("Результат другого виразу: y = %.6f%n", result2);
        System.out.printf("Результат третього виразу: y = %.6f%n", result3);
    }

    public static double calculateTask1()
    {
        double a = 1.27;
        double b = 10.99;
        double c = 2.73;
        double d = 25.32;

        double y = Math.pow(a, b) / Math.sinh(Math.abs(b)) + 4 * (Math.log(c) / Math.pow(d, 1/4));

        return y;
    }

    public static double calculateTask2()
    {
        double a = 0.478;
        double b = -1.26;
        double c = 2.68;
        double d = 18.24;

        double y = 9 * ((Math.asin(a)) / Math.cos(Math.sqrt(Math.abs(b)))) + Math.pow(2.43, d) + Math.log(c);

        return y;
    }

    public static double calculateTask3()
    {
        double a = 1.478;
        double b = 9.26;
        double c = 0.68;
        double d = 2.24;

        double y = 6 * (Math.pow(Math.sin(Math.abs(2 * a)), Math.log10(b))) + Math.sqrt(c * Math.cosh(-d));

        return y;
    }
}