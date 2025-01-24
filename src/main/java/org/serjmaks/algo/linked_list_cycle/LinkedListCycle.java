package org.serjmaks.algo.linked_list_cycle;

import org.serjmaks.algo.ListNode;

//не стал писать тесты, т.к.
//для тестирования нужно создать отдельный ListNode со своими особенностями
public class LinkedListCycle {
    public static boolean run(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }
}
