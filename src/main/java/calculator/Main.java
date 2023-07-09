package OCP.src.main.java.calculator;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        welcomeMassage();
        HashMap<String, IMathOperation> operationHashMap = new HashMap<>();
        operationHashMap.put("add", new Add());


    }
    public static void welcomeMassage(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello welcome to the calculator");
        System.out.println("#####################################");
        System.out.println("Enter what function you want to make");
        System.out.println("Enter First number");
        System.out.println("Enter Second number ");
        System.out.println("#####################################");
        String function = reader.next();
        int num1 = reader.nextInt();
        int num2 = reader.nextInt();
    }
}


