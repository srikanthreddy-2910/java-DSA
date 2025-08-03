// ✅ Problem Statements

// 🔸 1. Reverse a Linked List Iteratively
// Problem: Write a method reverseIterative() to reverse a singly linked list using iteration.

// Input:
// A singly linked list with nodes.

// Output:
// The linked list should be reversed in place.

// 🔸 2. Reverse a Linked List Recursively
// Problem: Write a method reverseRecursive(Node head) that reverses a linked list using recursion and returns the new head.

// Input:
// The head of a singly linked list.

// Output:
// The new head of the reversed list.

// 🔸 3. Detect if a cycle exists in a Linked List
// Problem Statement: Given the head of a singly linked list, determine if the list has a cycle in it.

// 🔸 4. Remove the cycle from the Linked List
// Problem Statement: Given a singly linked list that may contain a loop, remove the loop if present and return the updated list.

// 🔸 5. Problem Statements: Find the Middle Element of a Linked List
// Return the middle node.
// If even number of nodes, return the second middle node.

// 🔸 6. Problem Statements: Find the Nth Node from the End
// Return the node at position n from the end of the linked list.

// 🔸 7. Problem Statement:
// Merge Two Sorted Linked Lists
// You are given the heads of two sorted singly linked lists head1 and head2. Write a function mergeSortedLists(Node head1, Node head2) that merges them into a single sorted linked list, and returns the head of the merged list.

// The merged list should be sorted in non-decreasing order.
// Do not create new nodes — reuse the existing nodes from the input lists.

// 🔸 8. Problem Statement
// Check if a singly linked list is a palindrome.
// Given the head of a singly linked list, return true if it is a palindrome, or false otherwise.

// Example:
// Input: 1 -> 2 -> 2 -> 1
// Output: true
// Input: 1 -> 2
// Output: false

import java.util.HashSet;
import java.util.Stack;

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

    public LinkedList() {
        head = null;
    }

    public Node getHead() {
        return head;
    }

    public void insertAtHead(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            return;
        }
        node.next = head;
        head = node;
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

    public Node reverseIterative(Node head) {

        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public void reverseRecursiveCall() {
        head = reverseRecursive(head);
    }

    public Node reverseRecursive(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseRecursive(head.next);

        Node front = head.next;
        front.next = head;
        head.next = null;

        return newHead;
    }

    public boolean detectLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public void removeLoop(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        if (fast == null || fast.next == null) {
            return;
        }

        slow = head;

        if (slow == fast) {
            while (fast.next != slow) {
                fast = fast.next;
            }
        } else {
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        fast.next = null;
    }

    public Node getMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node getNthFromStart(int n) {
        Node current = head;
        int count = 1;

        while (current != null && count < n) {
            current = current.next;
            count++;
        }

        return current;
    }

    public Node getNthFromEnd(int n) {
        Node first = head;
        Node second = head;
        for (int i = 0; i < n; i++) {
            if (first == null)
                return null;
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }

    public Node mergeSortedListsRecursive(Node head1, Node head2) {
        if (head1 == null) {
            return head1;
        }
        if (head2 == null) {
            return head2;
        }

        if (head1.data < head2.data) {
            head1.next = mergeSortedListsRecursive(head1.next, head2);
            return head1;
        } else {
            head2.next = mergeSortedListsRecursive(head1, head2.next);
            return head2;
        }
    }

    public Node mergeSortedListsIterative(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node tail = dummy;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        if (head1 != null) {
            tail.next = head1;
        } else {
            tail.next = head2;
        }
        return dummy.next;
    }

    public boolean isPalindrome(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node secondHalfHead = reverseIterative(slow);

        Node firstHalfPointer = head;
        Node secondHalfPointer = secondHalfHead;

        while (secondHalfPointer != null) {
            if (firstHalfPointer.data != secondHalfPointer.data) {
                return false;
            }
            firstHalfPointer = firstHalfPointer.next;
            secondHalfPointer = secondHalfPointer.next;
        }

        return true;
    }

    public static boolean isPalindromeUsingStack(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node current = head;
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        current = head;
        while (current != null) {
            if (current.data != stack.pop()) {
                return false;
            }
            current = current.next;
        }
        return true;
    }

    public Node getIntersectionNode(Node headA, Node headB) {
        HashSet<Node> set = new HashSet<>();

        Node current = headA;
        while (current != null) {
            set.add(current);
            current = current.next;
        }

        current = headB;
        while (current != null) {
            if (set.contains(current)) {
                return current;
            }
            current = current.next;
        }

        return null;
    }


    

}