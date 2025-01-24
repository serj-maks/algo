package org.serjmaks.algo.remove_duplicates_from_sorted_list;

import org.serjmaks.algo.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static ListNode run(ListNode head) {
        ListNode list = head;

        while(list != null && list.next != null) {
            if (list.val == list.next.val) {
                list.next = list.next.next;
            } else {
                list = list.next;
            }
        }

        return head;
    }
}
