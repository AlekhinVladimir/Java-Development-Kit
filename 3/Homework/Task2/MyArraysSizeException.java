package Homework.Task2;

public class MyArraysSizeException extends RuntimeException {

    public MyArraysSizeException() {
        super("Длины массивов не равны");
    }
}
