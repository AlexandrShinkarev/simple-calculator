public class SimpleCalculator {

    public static void main(String[] arg) {
        Calculator calc = new Calculator();

        int a = 8;
        int b = 6;
        System.out.println("Результат сложения :" + calc.sum(a, b));
        System.out.println("Результат умножения :" + calc.multiply(a, b));
    }
}
