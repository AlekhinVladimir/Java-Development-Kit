package Homework.Task3;

import java.util.Arrays;

import Homework.Task2.MyArraysSizeException;
import Homework.Task2.MyArraysTypeException;

public class ArraysComporator {
    public <E, T> boolean compareArrays(E[] array1, T[] array2) throws MyArraysSizeException, MyArraysTypeException {
        if (array1.length != array2.length) throw new MyArraysSizeException();
        if (array1.getClass() != array2.getClass()) throw new MyArraysTypeException();
        return Arrays.equals(array1, array2);
    }
}