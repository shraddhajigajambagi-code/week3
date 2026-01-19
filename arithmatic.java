package arithmetic;

class ArithmeticOperations {

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class MainProgram {
    public static void main(String[] args) {

        ArithmeticOperations obj = new ArithmeticOperations();

        int a = 20, b = 10;

        System.out.println("Addition = " + obj.add(a, b));
        System.out.println("Subtraction = " + obj.subtract(a, b));
        System.out.println("Multiplication = " + obj.multiply(a, b));
        System.out.println("Division = " + obj.divide(a, b));
    }
}