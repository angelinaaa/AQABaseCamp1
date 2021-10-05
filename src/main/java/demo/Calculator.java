package demo;
import java.util.Scanner;
public class Calculator {

        static Scanner scanner = new Scanner(System.in);

        public int nextInt() {
            System.out.println("Введите число:");
            int operand;
            if (scanner.hasNextInt()) {
                operand = scanner.nextInt();
            } else {
                System.out.println("Ошибка при вводе числа. Попробуйте еще раз.");
                scanner.next();//рекурсия
                operand = nextInt();
            }
            return operand;
        }

        public char getOperation() {
            System.out.println("Введите операцию:");
            char operation;
            if (scanner.hasNext()) {
                operation = scanner.next().charAt(0);
            } else {
                System.out.println("Ошибка  при вводе операции. Попробуйте еще раз.");
                scanner.next();//рекурсия
                operation = getOperation();
            }
            return operation;
        }

        public int calc(int operand1, int operand2, char operation) {
            int result;
            switch (operation) {
                case '+':
                    result = operand1 + operand2;
                    break;
                case '-':
                    result = operand1 - operand2;
                    break;
                case '*':
                    result = operand1 * operand2;
                    break;
                case '/':
                    result = operand1 / operand2;
                    break;
                default:
                    System.out.println("Не удается распознать операцию . Повторите ввод.");
                    result = calc(operand1, operand2, getOperation());
            }
            return result;
        }
    }


