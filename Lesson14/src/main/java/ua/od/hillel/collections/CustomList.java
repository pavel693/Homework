package ua.od.hillel.collections;

import java.util.Iterator;

public interface CustomList {

    int size();

    boolean isEmpty();

    boolean contains(String element);

    boolean add(String element);

    void add(int index, String element);

    boolean remove(String element);

    String remove(int index) throws ArrayIndexException;

    void clear();

    String get(int index) throws ArrayIndexException;

    String set(int index, String element) throws ArrayIndexException;

    int indexOf(String element);

    Iterator listIterator();

    Iterator backwardIterator();

    Iterator randomIterator();

}
