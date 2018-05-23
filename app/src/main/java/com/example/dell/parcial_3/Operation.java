package com.example.dell.parcial_3;

/**
 * Created by Dell on 23/05/2018.
 */

public class Operation {

    public String operation;
    public int num1;
    public int num2;

    public Operation(String operation, int num1, int num2) {
        this.operation = operation;
        this.num1 = num1;
        this.num2 = num2;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
}
