package ua.od.hillel.collections;

import java.util.Iterator;

public class ArrayListMain {

    public static void main(String[] args) {

        CustomList list = new CustomArrayList(5);
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        System.out.println(list);
        System.out.println();

        /*System.out.println("Iterator example");
        Iterator iterator = list.randomIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();*/

        /*list.add(6, "abc");
        System.out.println(list);*/

        list.remove(6);
        System.out.println(list);
    }
}
