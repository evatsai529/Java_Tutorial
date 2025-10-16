// 選擇運算類別
class Calculator {
    public static Operation GetOperation(String operator, int num1, int num2) {
        switch (operator) {
            case "+":
                return new AddOperation(num1, num2);
            case "-":
                return new SubOperation(num1, num2);
            case "*":
                return new MulOperation(num1, num2);
            case "/":
                return new DivOperation(num1, num2);
            default:
                throw new IllegalArgumentException("不支援的運算符號: " + operator);
        }
    }
}