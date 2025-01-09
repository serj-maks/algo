package org.serjmaks.algo.legacy.middle_of_the_linked_list;

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
