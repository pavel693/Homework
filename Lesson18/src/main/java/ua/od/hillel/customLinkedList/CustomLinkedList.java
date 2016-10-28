package ua.od.hillel.customLinkedList;

public class CustomLinkedList {

    private Node firstNode;
    private Node lastNode;
    final String MESSAGE1 = "The index can't be less than 1";
    final String MESSAGE2 = "There is no element with this index in the LinkedList";
    final String MESSAGE3 = "With this method you can't find element that situated on the position bigger then half of list";

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

    public String getElement(int index) throws CustomArrayListOutOfBoundsException {
        if (index <= 0) {
            throw new CustomArrayListOutOfBoundsException(MESSAGE1);
        } else {
            Node node = firstNode;
            int counter = 1;
            while (counter < index) {
                if (node.equals(lastNode) && counter < index) {
                    throw new CustomArrayListOutOfBoundsException(MESSAGE2);
                }
                node = node.next;
                counter++;
            }
            return node.value;
        }
    }

    public void introduceCycle(int index) throws CustomArrayListOutOfBoundsException {
        if (index <= 0) {
            throw new CustomArrayListOutOfBoundsException(MESSAGE1);
        }
        Node current = firstNode;
        int currentIndex = 1;
        while (currentIndex < index) {
            if (current.equals(lastNode) && currentIndex < index) {
                throw new CustomArrayListOutOfBoundsException(MESSAGE2);
            }
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
            currentStepTwo = currentStepTwo.next;
            if (currentStepTwo.next != null) {
                currentStepTwo = currentStepTwo.next;
            }
        }
        return false;
    }

    public String findElementFromEnd(int index) throws CustomArrayListOutOfBoundsException {
        if (index <= 0) {
            throw new CustomArrayListOutOfBoundsException(MESSAGE1);
        }
        int firstCounter = 1;
        int secondCounter = 1;
        Node node = firstNode;
        while (node != null) {
            if (node.equals(lastNode) && firstCounter < index) {
                throw new CustomArrayListOutOfBoundsException(MESSAGE2);
            }
            node = node.next;
            firstCounter++;
        }
        node = firstNode;
        while (node != null) {
            if (secondCounter == firstCounter - index) return node.value;
            node = node.next;
            secondCounter++;
        }
        return null;
    }

    public String findElementFromEndAnother(int index) throws CustomArrayListOutOfBoundsException {
        if (index <= 0) {
            throw new CustomArrayListOutOfBoundsException(MESSAGE1);
        }
        Node nodeTurtle = firstNode;
        Node nodeHare = firstNode;
        int firstCounter = 1;
        int secondCounter = 1;
        while (nodeTurtle.next != null) {
            if (nodeHare.equals(lastNode) && firstCounter < index) {
                throw new CustomArrayListOutOfBoundsException(MESSAGE2);
            }
            if (nodeHare.next == lastNode) {
                nodeHare = lastNode;
                firstCounter++;
            }
            if (nodeHare.next != null) {
                nodeHare = nodeHare.next.next;
                firstCounter += 2;
            }
            if (nodeHare.next == null && secondCounter == firstCounter - index) return nodeTurtle.next.value;
            nodeTurtle = nodeTurtle.next;
            secondCounter++;
        }
        if (firstCounter % 2 != 0) {
            if (index > (firstCounter / 2) + 1) {
                throw new CustomArrayListOutOfBoundsException(MESSAGE3);
            }
        } else {
            if (index > firstCounter / 2) {
                throw new CustomArrayListOutOfBoundsException(MESSAGE3);
            }
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
