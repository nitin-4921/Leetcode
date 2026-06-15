/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k <= 1) {
            return head;
        }

        ListNode current = head;
        ListNode prev = null;

        while (true) {

            // Check if there are at least k nodes left
            ListNode temp = current;
            int count = 0;

            while (temp != null && count < k) {
                temp = temp.next;
                count++;
            }

            if (count < k) {
                break;
            }

            ListNode last = prev;      // end of previous group
            ListNode newEnd = current; // will become end after reversal

            // Reverse k nodes
            ListNode next = current.next;
            for (int i = 0; current != null && i < k; i++) {
                current.next = prev;
                prev = current;
                current = next;

                if (next != null) {
                    next = next.next;
                }
            }

            // Connect previous group with reversed group
            if (last != null) {
                last.next = prev;
            } else {
                head = prev;
            }

            // Connect end of reversed group to remaining list
            newEnd.next = current;

            if (current == null) {
                break;
            }

            prev = newEnd;
        }

        return head;
    }
}