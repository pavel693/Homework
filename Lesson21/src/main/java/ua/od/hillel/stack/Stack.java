package ua.od.hillel.stack;

import java.util.EmptyStackException;

public class Stack {

    public static final int MAXIMUM_SIZE = 10;
    private int[] array;
    private int pointer;

    public Stack() {
        array = new int[MAXIMUM_SIZE];
        pointer = -1;
    }

    public void push(int element) {
        if (pointer == MAXIMUM_SIZE) {
            throw new StackOverflowError();
        }
        pointer++;
        array[pointer] = element;
    }

    public int pop() {
        if (pointer == -1) {
            throw new EmptyStackException();
        }
        int element = array[pointer];
        pointer--;
        return element;
    }

    public boolean isEmpty() {
        return pointer == -1;
    }

    @Override
    public String toString() {
        String elements = "[";
        for (int i = 0; i <= pointer; i++) {
            if (elements.equals("["))
                elements += array[i];
            else
                elements += ", " + array[i];
        }
        elements += "]";
        return elements;
    }
}
