package OCP.src.main.java.calculator;

public class Substract implements IMathOperation {

    public double num1;
    public double num2;

    public Substract(double num1) {
        this.num1 = num1;
        this.num1 = num2;
    }

    @Override
    public double mathOperation() {
        return (num1 - num2);
    }

    @Override
    public void setNum1(int num1) {

    }

    @Override
    public void setNum2(int num2) {

    }
}
