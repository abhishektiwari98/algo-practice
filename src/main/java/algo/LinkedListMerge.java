package algo;

import common.ListNode;

/**
 * Implements linked list merging algorithm.
 */
public class LinkedListMerge {
    public ListNode mergeSortedLists(ListNode first, ListNode second) {
        ListNode dummyNode = new ListNode(-1);
        ListNode it = dummyNode;

        while(first != null && second != null){
            if(first.value < second.value){
                it.nextNode = first;
                first = first.nextNode;
            } else {
                it.nextNode = second;
                second = second.nextNode;
            }

            it = it.nextNode;
        }

        if(first != null) {
            it.nextNode = first;
        }

        if(second != null) {
            it.nextNode = second;
        }

        // return the new head using dummy node
        return dummyNode.nextNode;
    }
}
