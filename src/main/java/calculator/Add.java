package OCP.src.main.java.calculator;

public class Add implements IMathOperation {
    public double num1;
    public double num2;

    public Add(int firstNumber, int secondNumber) {
        this.num1 = firstNumber;
        this.num2 = secondNumber;
    }

    public Add() {
    }

    @Override
    public double mathOperation() {
        return num1 + num2;
    }

    @Override
    public void setNum1(int num1) {

    }

    @Override
    public void setNum2(int num2) {

    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
