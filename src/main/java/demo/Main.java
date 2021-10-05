package demo;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int operand1 = calculator.nextInt();
        int operand2 = calculator.nextInt();
        char operation = calculator.getOperation();
        int result = calculator.calc(operand1, operand2, operation);
        System.out.println("Результат операции: " + result);
    }
}