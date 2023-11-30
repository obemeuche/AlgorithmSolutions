

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

        insertAtStart(20);

        viewList();

        Node node = head;
        Node reversedNode = reverseList(node);

//        while (reversedNode != null)
//        {
//            System.out.println(reversedNode.data);
//            reversedNode = reversedNode.next;
//        }

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
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    private static void insertAtStart(int data){
        //inserting at the start of the linked list
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;

        head = node;
    }

    private static void insertAt(int data, int index){
        //inserting at a particular index of the linked list
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0){
            insertAtStart(data);
        }else {
            Node n = head;
            for(int i = 0; i<index-1; i++)
            {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    private static void deleteAt(int index){
        // deleting a particular index
        if (index == 0)
        {
            head = head.next;
        }else
        {
            Node n = head;
            Node n1 = null;
            for(int i = 0; i<index-1; i++)
            {
                n = n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
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

