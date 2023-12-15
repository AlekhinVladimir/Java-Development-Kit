package Homework.Task2;

public class MyDivideByZeroException extends ArithmeticException {

    public MyDivideByZeroException() {
        super("На ноль делить нельзя");
    }

}