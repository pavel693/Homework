package ua.od.hillel.customLinkedList;

public class CustomLinkedList {

    private Node firstNode;
    private Node lastNode;

    private class Node {
        String value;
        Node next;
    }

    public void add(String element) {
        Node node = new Node();
        node.value = element;

        if (firstNode == null) {
            firstNode = node;
            lastNode = node;
        } else {
            lastNode.next = node;
            lastNode = node;
        }
    }

    public void introduceCycle(int index) {
        Node current = firstNode;
        int currentIndex = 0;
        while (currentIndex < index) {
            current = current.next;
            currentIndex++;
        }
        lastNode.next = current;
    }

    public boolean hasCycle() {
        Node current = firstNode;
        Node currentStepTwo = current.next;
        while (currentStepTwo.next != null) {
            if (current.next == currentStepTwo.next) return true;
            current = current.next;
            currentStepTwo = currentStepTwo.next.next;
        }
        return false;
    }

    public String findElementFromEnd(int number) {
        int firstCounter = 0;
        int secondCounter = 0;
        Node node = firstNode;
        while (node != null) {
            node = node.next;
            firstCounter++;
        }
        node = firstNode;
        while (node != null) {
            if (secondCounter == firstCounter - number) return node.value;
            node = node.next;
            secondCounter++;
        }
        return null;
    }

    public String findElementFromEndAnother(int number) {
        Node nodeTurtle = firstNode;
        Node nodeHare = firstNode;
        int firstCounter = 1;
        int secondCounter = 1;
        while (nodeTurtle.next != null) {
            if (nodeHare.next == lastNode) {
                nodeHare = nodeHare.next;
                firstCounter++;
            }
            if (nodeHare.next != null) {
                nodeHare = nodeHare.next.next;
                firstCounter += 2;
            }
            if (nodeHare.next == null && secondCounter == firstCounter - number) return nodeTurtle.next.value;
            nodeTurtle = nodeTurtle.next;
            secondCounter++;
        }
        return null;
    }

    @Override
    public String toString() {
        String result = "[";
        Node current = firstNode;
        while (current != null) {
            if (result.equals("["))
                result += current.value;
            else
                result += ", " + current.value;
            current = current.next;
        }
        result += "]";
        return result;
    }
}
