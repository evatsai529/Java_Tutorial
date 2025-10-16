// 減
class SubOperation extends Operation {
    public SubOperation(int num1, int num2) {
        super(num1, num2);
    }

    @Override
    public double Calculate() {
        return num1 - num2;
    }
}