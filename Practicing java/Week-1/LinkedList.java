// Singly Linked List – Problem Statements

// 📘 Problem 1: Create a Node Class
// Statement: Design a Node class to represent a node in a singly linked list.
// Each node
// should contain:
// an integer data field
// a next pointer to the next node

// Goal:
// Create a self-contained Node class with a constructor to initialize the data.

// 📘 Problem 2: Insert at Head
// Statement: Write a method insertAtHead(int data) to insert a new node at the
// beginning
// of the list.

// Example:
// list.insertAtHead(10);
// list.insertAtHead(20);
// // List becomes: 20 -> 10

// 📘 Problem 3: Insert at Tail
// Statement: Write a method insertAtTail(int data) to insert a new node at the
// end of the
// list.

// Example:
// list.insertAtTail(30);
// list.insertAtTail(40);
// // List becomes: 30 -> 40

// 📘 Problem 4: Print All Elements
// Statement: Write a method printList() to traverse the linked list from head
// to tail and
// print all elements in order.

// Example Output:
// 20 -> 10 -> 30 -> 40
// 🧠 Bonus Challenge :

// Problem 5: Count the Length of the List
// Write a method getLength() that returns the number of nodes in the linked
// list.

// Example:
// list.getLength(); // Output: 4

// 🔧 Techniques Used:
// Dynamic memory allocation using new
// Handling null head and tail
// Pointer manipulation

// 🔸 6. Delete Node with Value X
// Problem: Write a method deleteByValue(int val) to remove the first node that has the value val from the linked list.
// Input:
// A value X to delete from the list.

// Output:
// Modified list with the value X removed (if found).

// Edge Cases:
// List is empty
// Head node contains value X
// Tail node contains value X
// X not found in the list

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void insertAtHead(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        head = node;
    }

    public void insertAtTail(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        tail = node;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;
        }
        System.out.println();
    }

    public int countLength() {
        int length = 0;
        if (head == null) {
            return length;
        }
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            tail = null;
            return;
        }

        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
        tail = current;
    }

    public void deleteValue(int data) {
        if (head == null) {
            return;
        }
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println("Inserting at Head:");
        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.print();

        System.out.println("Inserting at Tail:");
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.print();

        System.out.println("Counting Length:");
        int length = list.countLength();
        System.out.println("Length = " + length);

        System.out.println("Deleting at Beginning:");
        list.deleteAtBeginning();
        list.print();

        System.out.println("Deleting at End:");
        list.deleteAtEnd();
        list.print();

        System.out.println("Deleting Value 10:");
        list.deleteValue(10);
        list.print();

        System.out.println("Final Length:");
        System.out.println("Length = " + list.countLength());
    }

}