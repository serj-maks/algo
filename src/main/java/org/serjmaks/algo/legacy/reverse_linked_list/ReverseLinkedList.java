package org.serjmaks.algo.legacy.reverse_linked_list;

public class ReverseLinkedList {

    public static ListNode run(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next_node = head.next;
            head.next = prev;
            prev = head;
            head = next_node;
        }

        return prev;
    }
}
