

public class SingleLinkedListDemo {
    // Element in a LinkedList are stored in a node which also stores the next object reference.
    // one node is linked to the next using the object reference.
    // the first element is usually referred to as the head.
    // the last element usually references null.
    // it uses the 0(n) for searching.

    static Node head;
    static class Node
    {
        int data;
        Node next;
    }

    public static void main(String[] args)
    {
        insertToLinkedList(5);
        insertToLinkedList(3);
        insertToLinkedList(2);
        insertToLinkedList(10);

        viewList();

        Node node = head;
        Node reversedNode = reverseList(node);

        while (reversedNode != null)
        {
            System.out.println(reversedNode.data);
            reversedNode = reversedNode.next;
        }

    }

    private static void insertToLinkedList(int data)
    {
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

    private static void viewList()
    {
        Node node = head;
        while(node.next != null)
        {
//            System.out.println(node.data);
            node = node.next;
        }
//        System.out.println(node.data);
    }

    private static Node reverseList(Node node) {
        Node previousNode = null;
        Node currentNode = node;
        Node nextNode = null;

        while (currentNode.next != null)
        {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        node = previousNode;

        return node;
    }
}

