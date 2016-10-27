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
        list.add("h");

        /*System.out.println(list.findElementFromEnd(2));
        System.out.println(list.findElementFromEndAnother(2));

        list.introduceCycle(4);

        if (!list.hasCycle()) {
            System.out.println(list);
        } else System.out.println("There are cycle in the list");*/
        System.out.println(list.getElement(0));
    }
}
