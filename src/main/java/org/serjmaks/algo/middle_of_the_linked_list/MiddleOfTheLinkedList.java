package org.serjmaks.algo.middle_of_the_linked_list;

import org.serjmaks.algo.ListNode;

public class MiddleOfTheLinkedList {
    public static ListNode run(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
