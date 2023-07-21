

/*
PROBLEM --------------------------------------------------------------------------------------------------------------

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

SOLUTION ------------------------------------------------------------------------------------------------------------
*/


class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        ListNode p1 = list1;
        ListNode p2 = list2;

        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }

            current = current.next;
        }

        if (p1 != null) {
            current.next = p1;
        }
        if (p2 != null) {
            current.next = p2;
        }

        return dummy.next;
    }
}

//Solved