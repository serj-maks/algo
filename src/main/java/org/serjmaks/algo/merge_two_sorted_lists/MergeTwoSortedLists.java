package org.serjmaks.algo.merge_two_sorted_lists;

import org.serjmaks.algo.ListNode;

public class MergeTwoSortedLists {
    public static ListNode run(ListNode list1, ListNode list2) {
        if (list1 == null) {
            return list2;
        }

        if (list2 == null) {
            return list1;
        }

        if (list1.val < list2.val) {
            list1.next = run(list1.next, list2);
            return list1;
        } else {
            list2.next = run(list1, list2.next);
            return list2;
        }
    }
}
