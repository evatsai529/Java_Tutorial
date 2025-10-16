import java.util.Scanner;

// 程式入口
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入第一個數字: ");
        int userInputNum1 = scanner.nextInt();

        System.out.println("請輸入運算符號: ");
        String userInputOperator = scanner.next();

        System.out.println("請輸入第二個數字: ");
        int userInputNum2 = scanner.nextInt();

        try {
            Operation operation = Calculator.GetOperation(userInputOperator, userInputNum1, userInputNum2);
            double result = operation.Calculate();
            System.out.println(userInputNum1 + " " + userInputOperator + " " + userInputNum2 + " = " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("錯誤: " + e.getMessage());
        }

        scanner.close();
    }
}