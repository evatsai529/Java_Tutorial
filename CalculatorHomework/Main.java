import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入第一個數字: ");
        int userInputNum1 = scanner.nextInt();

        System.out.println("請輸入運算符號: ");
        String userInputOperator = scanner.next();

        System.out.println("請輸入第二個數字: ");
        int userInputNum2 = scanner.nextInt();

        double result;

        switch (userInputOperator) {
            case "+":
                result = userInputNum1 + userInputNum2;
                break;
            case "-":
                result = userInputNum1 - userInputNum2;
                break;
            case "*":
                result = userInputNum1 * userInputNum2;
                break;
            case "/":
                if (userInputNum2 == 0) {
                    throw new ArithmeticException("除數不可為 0");
                }
                result = (double) userInputNum1 / userInputNum2;
                break;
            default:
                throw new IllegalArgumentException("不支援的運算符號: " + userInputOperator);
        }

        System.out.println(userInputNum1 + " " + userInputOperator + " " + userInputNum2 + " = " + result);

        scanner.close();
    }
}
