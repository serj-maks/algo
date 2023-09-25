package org.serjmaks.algo.merge_two_sorted_list;

public class MergeTwoSortedList2 {
    // метод двух указателей
    public ListNode run(ListNode list1, ListNode list2) {
        ListNode tempNode = new ListNode(0);
        ListNode currNode = tempNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                currNode.next = list1;
                list1 = list1.next;
            } else {
                currNode.next = list2;
                list2 = list2.next;
            }
            currNode = currNode.next;
        }

        if (list1 != null) {
            currNode.next = list1;
            list1 = list1.next;
        }

        if (list2 != null) {
            currNode.next = list2;
            list2 = list2.next;
        }

        return tempNode.next;
    }
}
