package org.serjmaks.algo.reverse_linked_list;

import org.serjmaks.algo.ListNode;

public class ReverseLinkedList {
    public static ListNode run(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;

            prev = current;
            current = next;
        }

        return prev;
    }
}
