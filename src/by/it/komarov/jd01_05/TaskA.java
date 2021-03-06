package by.it.komarov.jd01_05;

public class TaskA {

    public static void main(String[] args) {

        step1();
        step2();
        step3();
    }

    private static void step1() {
        double a = 756.13;
        double x = 0.3;
        double z = Math.cos(Math.pow(Math.pow(x, 2) + Math.PI/6, 5.0));
        z = z - Math.sqrt(x * (Math.pow(a, 3.0)));
        z = z - Math.log(Math.abs((a - (1.12 * x))/4.0));
        System.out.printf("z = %6.10f\n", z);

        z = Math.cos(Math.pow(Math.pow(x, 2) + Math.PI/6, 5)) - Math.sqrt(x * Math.pow(a, 3)) - Math.log(Math.abs((a - 1.12 * x)/4));
        System.out.printf("z = %6.10f\n", z);
    }

    private static void step2() {
        double a = 1.21;
        double b = 0.371;

        double y = Math.tan(Math.pow((a + b), 2)) - Math.pow((a + 1.5), 1.0/3.0) + (a * Math.pow(b, 5)) - (b / (Math.log(Math.pow(a, 2))));
        System.out.printf("y = %6.10f\n", y);
    }

    private static void step3() {
        double x = 12.1;
        double f;
        for (double a = -5; a <= 12; a += 3.75) {
            f = Math.exp(a * x) - 3.45 * a;
            System.out.printf("При a=%6.2f f=%g\n", a, f);
        }
    }
}
