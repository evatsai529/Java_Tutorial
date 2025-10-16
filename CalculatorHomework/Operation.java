// 封裝：抽象運算類別
abstract class Operation {
    protected int num1;
    protected int num2;

    public Operation(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public abstract double Calculate();
}