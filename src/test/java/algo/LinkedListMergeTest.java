package algo;

import common.ListNode;
import common.utils.ListUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListMergeTest {
    @Test
    public void testBasic() {
        ListNode firstList = createLinkedList(new int[] {1, 2, 4});
        ListNode secondList = createLinkedList(new int[] {1, 3, 4});

        ListNode result = new LinkedListMerge().mergeSortedLists(firstList, secondList);
        assertEquals(6, ListUtils.getLength(result));
        assertEquals(1, result.nextNode.value);
    }

    @Test
    public void testEmptyListMerge() {
        ListNode firstList = createLinkedList(new int[] {});
        ListNode secondList = createLinkedList(new int[] {});

        ListNode result = new LinkedListMerge().mergeSortedLists(firstList, secondList);
        assertEquals(0, ListUtils.getLength(result));
    }

    private ListNode createLinkedList(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        ListNode head = new ListNode(arr[0]);
        ListNode p = head;
        for (int i = 1; i<arr.length; i++) {
            ListNode newNode = new ListNode(arr[i]);
            p.nextNode = newNode;
            p = p.nextNode;
        }
        return head;
    }
}