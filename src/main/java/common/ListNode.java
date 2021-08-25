package common;

/**
 * Node class to represent a node of linked list (singly linked list).
 *
 * @author abhishek
 */
public class ListNode {
    public int value;
    public ListNode nextNode;

    public ListNode(final int value) {
        this(value, null);
    }

    public ListNode(final int value, final ListNode nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
}
