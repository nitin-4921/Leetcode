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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head ;
        }

        ListNode mid = getmid(head) ;
        ListNode left = sortList(head) ; 
        ListNode right = sortList(mid) ;
        return merge(left , right) ;
    }

    ListNode merge(ListNode list1 , ListNode list2) {
        ListNode dummy = new ListNode() ;
        ListNode tail = dummy ;
        while(list1 != null && list2 != null) {
            if(list1.val < list2.val) {
                tail.next = list1 ;
                list1 = list1.next ;
                tail = tail.next ;
            }else {
                tail.next = list2 ;
                list2 = list2.next ;
                tail = tail.next ;
            }
        }
        tail.next = (list1 != null) ? list1 : list2 ;
        return dummy.next;
    }

    ListNode getmid(ListNode head) {
        ListNode mid = null ;
        while (head != null && head.next != null) {
            mid = (mid == null)  ? head : mid.next ;
            head = head.next.next;

        }
        ListNode midd = mid.next ;
        mid.next = null ;
        return midd ;

    }
}