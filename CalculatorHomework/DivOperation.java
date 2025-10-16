// 除
class DivOperation  extends Operation {
    public DivOperation (int num1, int num2) {
        super(num1, num2);
        if (num2 == 0) {
            throw new ArithmeticException("除數不可為 0");
        }
    }

    @Override
    public double Calculate() {
        return (double) num1 / num2;
    }
}