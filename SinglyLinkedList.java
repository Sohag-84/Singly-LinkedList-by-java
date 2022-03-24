package Data_structure;

public class SinglyLinkedList {
    static Node head;
    public static void main(String[] args) {
        System.out.println("Our LinkedList : ");
        head = new Node(5);
        head = head.addFirst(head, 10);
        head = head.addFirst(head, 20);
        head.addMiddle(head, 30, 2);
        head.addMiddle(head, 40, 3);
        head.addLast(head, 23);
        head = head.addFirst(head, 6);
        head.traverse(head);
    }
}
