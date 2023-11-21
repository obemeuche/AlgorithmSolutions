

public class SingleLinkedListDemo {
    // Element in a LinkedList are stored in a node which also stores the next object reference.
    // one node is linked to the next using the object reference.
    // the first element is usually referred to as the head.
    // the last element usually references null.
    // it uses the 0(n) for searching.

    static Node head;

    static class Node {
        int data;
        Node next;
    }

    public static void main(String[] args) {

        int data = 5;
        insertToLinkedList(data);
    }

    private static void insertToLinkedList(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null)
        {
            head = node;
        }else
        {
            Node n = head;
            while (n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
    }
}

