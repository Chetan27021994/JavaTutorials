public class Calculator {


    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }


    public double add(double a, double b) {
        return a + b;
    }


    public int add(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("add(int, int): " + calc.add(65, 780));
        System.out.println("add(int, int, int): " + calc.add(52, 189, 135));
        System.out.println("add(double, double): " + calc.add(2.51, 93.7));
        System.out.println("add(int[]): " + calc.add(new int[]{16, 29, 33, 54, 95}));
    }
}
