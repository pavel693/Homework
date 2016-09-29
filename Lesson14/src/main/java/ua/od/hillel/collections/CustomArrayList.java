package ua.od.hillel.collections;

import java.util.Iterator;
import java.util.Random;

public class CustomArrayList implements CustomList {
    public static final int SIZE = 10;

    private String[] array;
    private int size = 0;

    public CustomArrayList() {
        this(SIZE);
        array = new String[SIZE];
    }

    public CustomArrayList(int size) {
        array = new String[size];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(String element) {
        return false;
    }

    public boolean add(String element) {
        if (size >= array.length)
            resizeArrayBigger();

        array[size] = element;
        size++;

        return true;
    }

    private void resizeArrayBigger() {
        String[] arrayExt = new String[array.length * 2];
        for (int i = 0; i < size; i++) {
            arrayExt[i] = array[i];
        }
        array = arrayExt;
    }

    public void add(int index, String element) {

    }

    public boolean remove(String element) {
        int elementPosition = -1;
        for (int i = 0; i < size; i++) {
            if (element.equals(array[i])) {
                elementPosition = i;
            }
        }
        if (elementPosition != -1) {
            for (int i = elementPosition; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        }
        if (size < array.length / 4) {
            resizeArrayShorter();
        }

        return true;
    }

    private void resizeArrayShorter() {
        String[] arrayExt = new String[array.length / 2];
        for (int i = 0; i < size; i++) {
            arrayExt[i] = array[i];
        }
        array = arrayExt;
    }

    public String remove(int index) {
        return null;
    }

    public void clear() {

    }

    public String get(int index) {
        return null;
    }

    public String get(int index, String element) {
        return null;
    }

    public int indexOf(String element) {
        return 0;
    }

    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < size; i++) {
            if (i != 0)
                result += ", ";
            result += array[i];
        }
        result += "]";
        return result;
    }

    @Override
    public Iterator listIterator() {
        return new ListIterator();
    }

    @Override
    public Iterator backwardIterator() {
        return new BackwardIterator();
    }

    @Override
    public Iterator randomIterator() {
        return new RandomIterator();
    }

    private class ListIterator implements Iterator {

        int current = 0;

        public boolean hasNext() {
            return current < size;
        }

        public Object next() {
            String element = array[current];
            current++;
            return element;
        }
    }

    private class BackwardIterator implements Iterator {

        int current = size - 1;

        @Override
        public boolean hasNext() {
            return current >= 0;
        }

        @Override
        public Object next() {
            String element = array[current];
            current--;
            return element;
        }
    }

    private class RandomIterator implements Iterator {

        int current = size;
        String[] arrayTemp = toArrayUsedSize(array);
        Random random = new Random();

        @Override
        public boolean hasNext() {
            return current > 0;
        }

        @Override
        public Object next() {
            int elementNumber = random.nextInt(current);
            String element = arrayTemp[elementNumber];
            arrayTemp = removeElement(arrayTemp, elementNumber);
            current--;
            return element;
        }

        public String[] removeElement(String[] array, int elementNumber) {
            if (elementNumber == array.length - 1) {
                toArrayShorter(array);
            } else {
                for (int i = elementNumber; i < array.length - 1; i++) {
                    array[i] = array[i + 1];
                }
                toArrayShorter(array);
            }
            return array;
        }

        public String[] toArrayShorter(String[] array) {
            String[] newArray = new String[array.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            return newArray;
        }

        public String[] toArrayUsedSize(String[] array) {
            String[] newArray = new String[size];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            return newArray;
        }
    }
}

