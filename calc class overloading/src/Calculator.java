public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b, double c) {
        return a + b + c;
    }


    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero!");
        }
        return (double) a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero!");
        }
        return a / b;
    }


    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(5, 10));
        System.out.println("add(double, double): " + calc.add(5.5, 2.3));
        System.out.println("add(int, int, int): " + calc.add(1, 2, 3));


        System.out.println("subtract(int, int): " + calc.subtract(10, 3));
        System.out.println("subtract(double, double): " + calc.subtract(9.5, 4.2));


        System.out.println("multiply(int, int): " + calc.multiply(3, 4));
        System.out.println("multiply(double, double): " + calc.multiply(2.5, 1.5));
        System.out.println("multiply(int, int, int): " + calc.multiply(2, 3, 4));


        System.out.println("divide(int, int): " + calc.divide(10, 2));
        System.out.println("divide(double, double): " + calc.divide(7.5, 2.5));
    }
}
