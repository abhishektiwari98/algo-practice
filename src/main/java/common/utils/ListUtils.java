package common.utils;

import common.ListNode;

public class ListUtils {
    public static int getLength(ListNode head) {
        int result = 0;
        while (head != null) {
            head = head.nextNode;
            result++;
        }
        return result;
    }
}
