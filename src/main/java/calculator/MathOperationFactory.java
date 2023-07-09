package OCP.src.main.java.calculator;

import java.util.HashMap;

public class MathOperationFactory {

    public HashMap<String, IMathOperation> operationHashMap;


    public MathOperationFactory(HashMap<String, IMathOperation> operationHashMap) {
        this.operationHashMap = operationHashMap;
    }


    public IMathOperation getMathOperation(String mathOperation, int num1, int num2) {
        IMathOperation mathOperation1 = operationHashMap.get(mathOperation);
        mathOperation1.setNum1(num1);
        mathOperation1.setNum2(num2);
        return mathOperation1;
    }
}
