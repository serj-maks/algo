package org.serjmaks.algo.remove_n_node_from_end_of_list;

import org.serjmaks.algo.ListNode;

public class RemoveNNodeFromEndOfList {
    public static ListNode run(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        if (fast == null) {
            return head.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
