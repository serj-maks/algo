package org.serjmaks.algo.middle_of_the_linked_list;

public class MiddleOfTheLinkedList {

    public static ListNode run(ListNode head) {
        ListNode aPointer = head;
        ListNode bPointer = head;

        while (bPointer != null && bPointer.next != null) {
            aPointer = aPointer.next;
            bPointer = bPointer.next.next;
        }

        return aPointer;
    }
}
