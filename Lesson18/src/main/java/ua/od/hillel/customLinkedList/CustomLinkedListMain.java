package ua.od.hillel.customLinkedList;

public class CustomLinkedListMain {

    public static void main(String[] args) {
        CustomLinkedList list = new CustomLinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");
        list.add("i");
        list.add("j");

        try {
            System.out.println(list.findElementFromEnd(1));
        } catch (CustomArrayListOutOfBoundsException message) {
            message.printStackTrace();
        }
        try {
            System.out.println(list.findElementFromEndAnother(4));
        } catch (CustomArrayListOutOfBoundsException message) {
            message.printStackTrace();
        }
        try {
            list.introduceCycle(5);
        } catch (CustomArrayListOutOfBoundsException message) {
            message.printStackTrace();
        }
        if (!list.hasCycle()) {
            System.out.println(list);
        } else System.out.println("There are cycle in the list");
        try {
            System.out.println(list.getElement(1));
        } catch (CustomArrayListOutOfBoundsException message) {
            message.printStackTrace();
        }
    }
}
