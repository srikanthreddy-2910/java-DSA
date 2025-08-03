public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insertAtHead(10);
        list.insertAtHead(20);
        list.insertAtHead(30);
        list.insertAtHead(40);
        System.out.print("Original List: ");
        list.print();

        list.reverseRecursiveCall();
        System.out.print("Reversed ");
        list.print();

        Node middle = list.getMiddle();
        System.out.println("Middle Node: " + (middle != null ? middle.data : "null"));

        int nFromStart = 2;
        Node nthFromStart = list.getNthFromStart(nFromStart);
        System.out.println(
                "Node at index " + nFromStart + " from start: " + (nthFromStart != null ? nthFromStart.data : "null"));

        int nFromEnd = 2;
        Node nthFromEnd = list.getNthFromEnd(nFromEnd);
        System.out
                .println("Node at index " + nFromEnd + " from end: " + (nthFromEnd != null ? nthFromEnd.data : "null"));

        // --------------------------------------------------------------------------------------------------------------

        LinkedList palList = new LinkedList();
        palList.insertAtHead(1);
        palList.insertAtHead(2);
        palList.insertAtHead(2);
        palList.insertAtHead(1);
        System.out.print("Palindrome Check List: ");
        palList.print();
        System.out.println("Is Palindrome : " + palList.isPalindrome(palList.getHead()));

        // System.out.println("Is Palindrome : " +
        // LinkedList.isPalindromeUsingStack(palList.getNthFromStart(0)));

        LinkedList l1 = new LinkedList();
        l1.insertAtHead(10);
        l1.insertAtHead(5);
        l1.insertAtHead(1);

        LinkedList l2 = new LinkedList();
        l2.insertAtHead(20);
        l2.insertAtHead(15);
        l2.insertAtHead(2);

        Node mergedRecursive = list.mergeSortedListsRecursive(l1.getHead(), l2.getHead());
        System.out.print("Merged  ");
        printList(mergedRecursive);

        // Node mergedIterative = list.mergeSortedListsIterative(l1.getNthFromStart(0),
        // l2.getNthFromStart(0));
        // System.out.print("Merged ");
        // printList(mergedIterative);

        Node loopNode1 = new Node(1);
        Node loopNode2 = new Node(2);
        Node loopNode3 = new Node(3);
        Node loopNode4 = new Node(4);

        loopNode1.next = loopNode2;
        loopNode2.next = loopNode3;
        loopNode3.next = loopNode4;
        loopNode4.next = loopNode2;

        System.out.println("Loop Detected: " + list.detectLoop(loopNode1));
        list.removeLoop(loopNode1);
        System.out.println("Loop Detected After Removal: " + list.detectLoop(loopNode1));
        System.out.print("List after removing loop: ");
        printList(loopNode1);

        Node interCommon = new Node(100);
        Node interListA = new Node(1);
        interListA.next = new Node(2);
        interListA.next.next = interCommon;
        interCommon.next = new Node(200);

        Node interListB = new Node(9);
        interListB.next = new Node(8);
        interListB.next.next = interCommon;

        Node intersection = list.getIntersectionNode(interListA, interListB);
        System.out.println("Intersection Node: " + (intersection != null ? intersection.data : "null"));
    }

    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }
}
